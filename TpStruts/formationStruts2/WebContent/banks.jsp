<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://displaytag.sf.net" prefix="display"%>
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
			<li>Redérigier le résultat d'une action vers une autre action (afficher la liste des banques)</li>
			<li>La notion de intercepteurs</li>
		</ul>
	</div>
	<div>
	<h3>Rediréction du résultat d'une action vers une autre action</h3>
	Il est possible de faire ce type de rediréction dans la configuration struts !, En effet, il suffit de mentionner le type "redirect" dans la balise "result" !<br>
	Par exemple: &quot&ltresult &gt name="SUCCESS" type = "redirect">/banque/AfficherBanqueListe.action &lt/result&gt&quot
	</div>
	<div>
	<h3>Interception des requêtes</h3>
	Il est possible de faire ce type de rediréction dans la configuration struts !, En effet, il suffit de mentionner le type "redirect" dans la balise "result" !<br>
	Par exemple: &quot&ltresult &gt name="SUCCESS" type = "redirect">/banque/AfficherBanqueListe.action &lt/result&gt&quot
	</div>
	<div>
	<h4>Liste des banques avec displaytag</h4>
		<display:table name="BanqueList">
			<display:column property="libelle"></display:column>
			<display:column property="capital"></display:column>
			<display:column property="adresse"></display:column>
		</display:table>
	</div>
</body>
</html>