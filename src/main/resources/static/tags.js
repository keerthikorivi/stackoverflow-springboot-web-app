$(document).ready(function(){
    $("#popularTags").click(function(){
    	alert("hey!!!");
    	document.writeln("hey....");
        $("#bodyDiv").html("popularTags are set here!!!");
    });
    
    $("#tagsByName").click(function(){
    	$("#bodyDiv").html("tagsByName are set here!!!");
    });
    
    $("#newTags").click(function(){
    	$("#bodyDiv").html("newTags are set here!!!");
    });

});