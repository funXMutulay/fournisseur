<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MISE A JOUR FOURNISSEUR </title>
</head>
<body>

<form action="updateFournisseur" method="post" >
<table>

<tr> <td> FOURNISSEUR ID: </td> <td><input type="text" name="id" value="${fournisseur.fournisseurId}" readonly/> </td>    </tr>

<tr> <td> NOM: </td> <td> <input type="text" name="name" value="${fournisseur.nom}"/></td>   </tr>

<tr> <td> PRENOM: </td> <td> <input type="text" name="description" value="${fournisseur.prenom}"/></td>    </tr>

<tr> <td> EMAIL: </td> <td><input type="text" name="quantit" value="${fournisseur.email}"/> </td>    </tr>

<tr> <td> ADDRESSE:  </td> <td><input type="text" name="price" value="${fournisseur.addresse}"/> </td>    </tr>

<tr> <td> TELEPHONE: </td> <td><input type="text" name="prixTotal" value="${cmmande.phone}"/> </td> </tr> 

<input type="submit" value="save"/>

</table>
</form>

</body>
</html>