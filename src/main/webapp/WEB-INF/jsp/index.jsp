<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring Rabbit</title>
</head>
<body>
    <div >
        <div >
            <h1>Spring MVC RabbitMQ Sample <br/></h1>
        </div>
        <div>
            <label>Enter message</label><br>
            <input type="text" id="queue" value="teste"></textarea>
        </div>
        <div>
            <label>Enter message</label><br>
            <textarea cols="50" rows="5" id="message" placeholder="Message"></textarea>
        </div>
        <br>
        <div>
            <button id="sendMessage">Send</button>
        </div>
    </div>
</body>
<script src="https://code.jquery.com/jquery-3.3.1.min.js" type="text/javascript"></script>

<script>
$(function () {
    $("#sendMessage").click(function(evt) {
        var json = {}
        json["queue"] = $("#queue").val();
        json["message"] = $("#message").val();

        $.ajax({
            type: "POST",
            url: "send",
            contentType: 'application/json',
            data: JSON.stringify(json)
        }).done(function(data){
        	$("#message").val("");
        	$("#queue").val("teste");
        	alert(data);

        }).fail(function(data){
        	console.log(data);
           
        });
    });
});


</script>
</html>
