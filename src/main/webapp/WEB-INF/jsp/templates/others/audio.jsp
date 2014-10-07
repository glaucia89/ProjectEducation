<%-- 
    Document   : audio
    Created on : 05/10/2014, 01:26:04
    Author     : glaucia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div ng-app >
    <input type="text" ng-model="url" ng-init="url ='http://translate.google.com.br/translate_tts?ie=UTF-8&q='+ audioload +'&tl=pt&prev=input'"/>
    <iframe  contextmenu style="height: 50px; width: 300px; alignment-adjust: central" ng-src="{{url}}" />
</div>
