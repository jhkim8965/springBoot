<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="kr">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script>
        function btnOnclick_web() {
            fetch("/webServer/test?testParam=1")
            .then((response) => { if(reponse.ok) response.json(); })
            .then((json) => alert(json.message))
            .catch(() => alert("에러 발생!!"));
        }

        function btnOnclick_api() {
            fetch("/webServer/api/test?testParam=2")
            .then((response) => { if(reponse.ok) response.json(); })
            .then((json) => {
                alert(json.firstSample);
                alert(json.secondSample);
            })
            .catch(() => alert("에러 발생!!"));
        }

        function btnOnclick_db() {
            fetch("/webServer/db/test?testParam=3")
            .then((response) => response.json())
            .then((json) => {
                alert(json.firstSample);
                alert(json.secondSample);
                alert(json.thirdSample);
                alert(json.fourthSample);
            })
            .catch(() => alert("에러 발생!!"));
        }
    </script>
</head>
<body>
    <div>
        This is Main Page
    </div>
    <div>
        <button type="button" onclick="btnOnclick_web()">Let's get a data from webController via RestAPI</button>
        <button type="button" onclick="btnOnclick_api()">Let's get a data from apiController via RestAPI</button>
        <button type="button" onclick="btnOnclick_db()">Let's get a data from dbController via RestAPI</button>
    </div>
</body>
</html>