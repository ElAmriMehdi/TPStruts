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
		<h3>Déclaration du contrôleur principal</h3>
		La déclaration du contrôleur principal se fait dans le fichier web.xml:
		<ul>
			<li>Premièrement, on déclare un filtre avec la balise "filter".</li>
			<li>La définition du filtre se fait avec un nom avec la balise "filter-name" et la classe qui l'implémente avec la balise "filter-class", en occurence FilterDispather pour struts v 2.0.*</li>
		</ul>
	</div>
	<div>
	<h3>Mapping du filtre</h3>
	Une fois le contôleur est bien définie, il faut l'associer à une url. Ce mapping se fiat avec la balise "filter-mapping".
		<ul>
			<li>On donne le nom du filtre</li>
			<li>une expréssion régulière pour les Urls accéptées</li>
		</ul>
	</div>
		
	
<div>
	<h3>Connectez vous pour la suite (admin,admin)</h3>
  <form action="user/login.action">
    <label for="uname">username</label>
    <input type="text"  name="u.username" placeholder="username">
     <label for="password">password</label>
    <input type="password" name="u.password" placeholder="password">
    <input type="submit" value="se connecter">
  </form>
</div>
</body>
</html>