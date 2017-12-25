$(document).ready(function(){
	$("#bodyDiv").load("tagTemplate.html");
    $("#popularTags").click(function(){
    	$("#bodyDiv").load("tagTemplate.html");
    	getPopularTags();
        $("#bodyDiv").html("popularTags are set here!!!");
    });
    
    $("#tagsByName").click(function(){
    	getPopularTagsNew();
    	$("#bodyDiv").html("tagsByName are set here!!!");
    });
    
    $("#newTags").click(function(){
    	$("#bodyDiv").html("newTags are set here!!!");
    });
    
    $(".page-item").hover(function(){
    	$( this ).addClass("active");
    });
    
    $("#tagSearch").keyup(function(){
    	getPopularTagsNewSearch();
    });
    
   /* $("#tagSearch").click(function(){
    	alert("clicked");
    });
    
    */
    function getPopularTags(){
    	$.getJSON( "/tags", function( data ) {
    		alert(data[0]);
  		 /* var items = [];
  		  $.each( data, function( key, val ) {
  		    items.push( "<li id='" + key + "'>" + val + "</li>" );
  		  });
  		  $("#bodyDiv").html(items);
  		 
  		  $( "<ul/>", {
  		    "class": "my-new-list",
  		    html: items.join( "" )
  		  }).appendTo( "#bodyDiv" );*/
    		 $.ajax({url: "/tags", success: function(result){
    			 alert(result[0]);
    	            $("#bodyDiv").html(result);
    	        }});
  		});
    }
    
    function getPopularTagsNew(){
    	var body = $("#bodyDiv");
    	body.append("")
    	$.ajax({type : "GET",
    		url: "/tags", success: function(tagCounts){
			  $.each(tagCounts, function(i,tagCount){
				  $("#bodyDiv").append(tagCount.tag).append(" ").append(tagCount.tagCount);
			  });
	            
	   }});
    }
    
    function getPopularTagsNewSearch(){
    	var body = $("#bodyDiv");
    	var tagSearch = $("#tagSearch").val();
    	if(tagSearch==""){
    		body.val("");
    		$.each(tagCounts, function(i,tagCount){
				  $("#bodyDiv").append(tagCount.tag).append(" ").append(tagCount.tagCount);
			  });
    	}
    	body.append("")
    	$.ajax({type : "GET",
    		url: "/tags", success: function(tagCounts){
    			body.val("");
			  $.each(tagCounts, function(i,tagCount){
				  if(tagCount.tag.indexOf(tagSearch)>=0) {
					  $("#bodyDiv").append(tagCount.tag).append(" ").append(tagCount.tagCount);
				  }
			  });
	            
	   }});
    }
});