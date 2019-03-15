<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>
   
   <body>
      <h2>Student Information</h2>
      <form method = "POST" action = "result">
         <table>
            <tr>
               <td><label path = "name">Name</label></td>
               <td><input path = "name" /></td>
            </tr>
            <tr>
               <td><label path = "age">Age</label></td>
               <td><input path = "age" /></td>
            </tr>
            <tr>
               <td><label path = "id">id</label></td>
               <td><input path = "id" /></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form>
   </body>
</html>
