package com.fatec.neweducation.controller;

import com.fatec.neweducation.model.Answer;
import com.fatec.neweducation.model.Question;
import com.fatec.neweducation.model.dto.FakeQuestion;
import com.fatec.neweducation.model.resources.Hability;
import com.fatec.neweducation.model.resources.TypeAnswer;
import com.fatec.neweducation.model.resources.TypeQuestion;
import com.fatec.neweducation.service.AnswerService;
import com.fatec.neweducation.service.QuestionService;
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
@RequestMapping("/question/FAE1")
public class QuestionFAE1Controller {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private AnswerService answerService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("homeQuestionFAE1");
        modelAndView.addObject("title", "Questões do tipo 1");
        modelAndView.addObject("questions", this.questionService.findByFAE(TypeQuestion.FAE1));
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView initAddQuestion() {
        ModelAndView modelAndView = new ModelAndView("formQuestionFAE1");
        FakeQuestion question = new FakeQuestion();
        question.setTypeAnswer(TypeAnswer.FAE1);
        modelAndView.addObject("title", "Adicionar Questão do tipo 1");
        modelAndView.addObject("question", question);
        modelAndView.addObject("habilities", Hability.values());
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String save(@ModelAttribute("questionmodel") FakeQuestion questionmodel) {
        ModelAndView modelAndView = new ModelAndView("homeQuestionFAE1");
        Question question = questionmodel.getQuestion();
        question.setTypeQuestion(TypeQuestion.FAE1);
        Answer answerA = questionmodel.getAnswerA();
        answerA.setTypeAnswer(TypeAnswer.FAE1);
        Answer answerB = questionmodel.getAnswerB();
        answerB.setTypeAnswer(TypeAnswer.FAE1);
        Answer answerC = questionmodel.getAnswerC();
        answerC.setTypeAnswer(TypeAnswer.FAE1);
        this.questionService.save(question);
        this.answerService.save(answerA);
        this.answerService.save(answerB);
        this.answerService.save(answerC);
        modelAndView.addObject("message", "Questão foi salva com sucesso");
        return "redirect:/question/FAE1";
    }

//    @RequestMapping(value = "/edit{id}", method = RequestMethod.GET)
//    public ModelAndView initEditQuestioin(@PathVariable Integer id) {
//        ModelAndView modelAndView = new ModelAndView("formQuestionFAE1");
//        modelAndView.addObject("title", "Editar Questão do tipo 1");
//        //TODO
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/edit{id}", method = RequestMethod.POST)
//    public String update(@ModelAttribute FakeQuestion questionmodel, @PathVariable Long id) {
//        ModelAndView modelAndView = new ModelAndView("homeQuestionFAE1");
//        //TODO
//        return "redirect:/question/FAE1";
//    }

    @RequestMapping(value = "/delete{id}", method = RequestMethod.GET)
    public String delete(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("homeQuestionFAE1");
        //TODO
        return "redirect:/question/FAE1";
    }
}
