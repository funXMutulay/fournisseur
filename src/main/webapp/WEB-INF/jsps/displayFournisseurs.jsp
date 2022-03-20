<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FOURNISSEURS</title>
</head>
<body>

<h2>Fournisseurs:</h2>
<table>
<tr>
<th>Fournisseur Id</th>
<th>NOM</th>
<th>PRENOM</th>
<th>EMAIL</th>
<th>ADDRESSE</th>
<th>TELEPHONE</th>
</tr>

<c:forEach items="${fournisseurs}" var="fournisseur">
<tr>
<td>${fournisseur.fournisseurId}</td>
<td>${fournisseur.nom}</td>
<td>${fournisseur.prenom}</td>
<td>${fournisseur.email}</td>
<td>${fournisseur.addresse}</td>
<td>${fournisseur.phone}</td>
<td><a href="deleteFournisseur?id=${fournisseur.fournisseurId}">SUPPRIMER</a></td>
<td><a href="showUpdate?id=${fournisseur.fournisseurId}">EDITER</a></td>
</tr>
</c:forEach>
</table>
<a href="creerFournisseur">AJOUTER FOURNISSEUR</a>
</body>
</html>