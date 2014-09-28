package com.fatec.neweducation.controller;

import com.fatec.neweducation.model.Answer;
import com.fatec.neweducation.model.Question;
import com.fatec.neweducation.model.dto.FakeQuestion;
import com.fatec.neweducation.model.resources.Hability;
import com.fatec.neweducation.model.resources.TypeAnswer;
import com.fatec.neweducation.model.resources.TypeQuestion;
import com.fatec.neweducation.service.AnswerService;
import com.fatec.neweducation.service.QuestionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by glaucia on 31/07/14.
 */
@Controller
@RequestMapping("/question/FAE3")
public class QuestionFAE3Controller {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private AnswerService answerService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("homeQuestionFAE3");
        modelAndView.addObject("title", "Questões do tipo 3");
        modelAndView.addObject("questions", this.questionService.findByFAE(TypeQuestion.FAE3));
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView initAddQuestion() {
        ModelAndView modelAndView = new ModelAndView("formQuestionFAE3");
        FakeQuestion question = new FakeQuestion();
        question.setTypeAnswer(TypeAnswer.FAE3);
        modelAndView.addObject("title", "Adicionar Questão do tipo 3");
        modelAndView.addObject("question", question);
        modelAndView.addObject("habilities", Hability.values());
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String save(@ModelAttribute("questionmodel") FakeQuestion questionmodel) {
        ModelAndView modelAndView = new ModelAndView("homeQuestionFAE3");
        Question question = questionmodel.getQuestion();
        question.setTypeQuestion(TypeQuestion.FAE3);
        Answer answerA = questionmodel.getAnswerA();
        answerA.setTypeAnswer(TypeAnswer.FAE3);
        Answer answerB = questionmodel.getAnswerB();
        answerB.setTypeAnswer(TypeAnswer.FAE3);
        this.questionService.save(question);
        this.answerService.save(answerA);
        this.answerService.save(answerB);
        modelAndView.addObject("message", "Questão foi salva com sucesso");
        return "redirect:/question/FAE3";
    }

//    @RequestMapping(value = "/edit{id}", method = RequestMethod.GET)
//    public ModelAndView initEditQuestioin(@PathVariable Integer id) {
//        ModelAndView modelAndView = new ModelAndView("formQuestionFAE3");
//        modelAndView.addObject("title", "Editar Questão do tipo 3");
//        //TODO
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/edit{id}", method = RequestMethod.POST)
//    public String update(@ModelAttribute FakeQuestion questionmodel, @PathVariable Long id) {
//        ModelAndView modelAndView = new ModelAndView("homeQuestionFAE3");
//        //TODO
//        return "redirect:/question/FAE3";
//    }

    @RequestMapping(value = "/delete{id}", method = RequestMethod.GET)
    public String delete(@PathVariable Integer id) {
        Question question = this.questionService.findById(id);
        List<Answer> answers = this.answerService.findByQuestion(question);
        if (!answers.isEmpty()) {
            this.answerService.delete(answers.get(0).getId());
            this.answerService.delete(answers.get(1).getId());
        }
        this.questionService.delete(id);
        ModelAndView modelAndView = new ModelAndView("homeQuestionFAE3");
        modelAndView.addObject("message", "Questão deletada com sucesso!");
        return "redirect:/question/FAE3";
    }
}
