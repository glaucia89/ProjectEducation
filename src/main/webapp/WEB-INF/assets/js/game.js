/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function checkbox1Validade() {
    $('input#ckbox1').prop('checked', true);
    $('input#ckbox2').prop('checked', false);
    $('input#ckbox3').prop('checked', false);
}

function checkbox2Validade() {
    $('input#ckbox2').prop('checked', true);
    $('input#ckbox1').prop('checked', false);
    $('input#ckbox3').prop('checked', false);
}

function checkbox3Validade() {
    $('input#ckbox3').prop('checked', true);
    $('input#ckbox1').prop('checked', false);
    $('input#ckbox2').prop('checked', false);
}
