<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style><%@include file="/css/style.css"%></style>
<title>Ma formation Struts2</title>
</head>
<body>
	<div>
		<h2>Ma formation Struts2</h2>
		L'objectif du tp1 est de comprendre:
		<ul>
			<li>la notion du contrôleur principal de Struts2 (FilterDispatcher).</li>
			<li>Configuration struts.xml</li>
		</ul>
	</div>
	<div>
	<h3>Configuration struts.xml</h3>
	Le fichier strutst.xml doit se placer à la racine des sources "/src". Ce fichier définie les actions supportées ainsi que leurs résultats respectives. 
	</div>
	<div>
	<h3>Séparation de configuration </h3>
	On peut séparer la configuration des actions par modules ! En effet, il suffie de créer un fichier de configuration .xml par module. et les inclure dans struts.xml ;)
	</div>
	
	<div>
	<h3>Connectez vous pour la suite (admin,admin)</h3>
  <form action="user/loginBis.action">
    <label for="uname">username</label>
    <input type="text"  name="u.username" placeholder="username">
     <label for="password">password</label>
    <input type="password" name="u.password" placeholder="password">
    <input type="submit" value="se connecter">
  </form>
</div>

<div>
	<h3>Consomation d'un webservice</h3>
  	On utilise la fake Api https://jsonplaceholder.typicode.com/
  	<form action="consommer.action">
  	<input type="submit" value="consomer">
  	</form>
</div>


</body>
</html>