<%--
  Created by IntelliJ IDEA.
  User: WagnerMestrinho
  Date: 1/13/17
  Time: 1:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Home Work 03</title>
  </head>
  <body>
  <form action="/invest" method="post">
    <table>
        <th colspan="3"><h1>Investment Hack</h1></th>
        <tr>
        <td >Investor Name:</td>
        <td><input type="text" name="invName"></td>
      </tr>
      <tr>
        <td>Investment Amount:</td>
        <td><input type="text" name="invAmount"></td>
      </tr>
      <tr>
        <td>Investment Profit:</td>
        <td><input type="text" name="invProfit"></td>
      </tr>
    </table>
    <p><input type="submit" value="Calculate"></p>
  </form>
  </body>
</html>
