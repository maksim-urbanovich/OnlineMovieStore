<%@ page language="java" contentType="text.html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<!--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
--!>

<html>
    <body>
    <div class = "header">
        <h2>Hello my custom servlet</h2>
                <br/>

                <p>Message from server: ${requestScope.result}</p>
                <br/>

                <p>GET</p>
                <form method="get" action="FrontController">

                    <p>Please select your operation:</p>
                    <input type="radio" id="sum" name="operation" value="sum">
                    <label for="sum">SUM</label><br>
                    <input type="radio" id="subtract" name="operation" value="subtract">
                    <label for="subtract">SUBTRACT</label><br>
                    <input type="hidden" name="command" value="sum"/>
                    <input type="number" name="number-1" value="0"/>
                    <input type="number" name="number-2" value="0"/>
                    <button type="submit" name="SubmitButtonType" value="sum">Submit</button>
                </form>
                <br/>

                <p>POST</p>
                <form method="post" action="FrontController">
                    <input type="hidden" name="command" value="postInputParameter"/>
                    <input type="text" name="message" value="..default value.."/>
                    <button type="submit">Submit</button>
                </form>
    <div class="content">
        <div class="registration">

        </div>
    </div>

    </body>
</html>
