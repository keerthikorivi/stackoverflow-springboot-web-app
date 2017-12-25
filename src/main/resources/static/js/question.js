var currPage;

$(document).ready(function(){
	
	var questionTitles = $(".questionTitle");
	var questionBody = $(".questionBody");
	var questions = getPageData();
	
	function getPageData(){
		
		//https://medium.com/coding-design/writing-better-ajax-8ee4a7fb95f
		//https://www.ibm.com/developerworks/library/wa-aj-5best/
		//http://www.tinywall.info/2012/02/change-browser-url-without-page-reload-refresh-with-ajax-request-using-javascript-html5-history-api-php-jquery-like-facebook-github-navigation-menu.html
		currPage = $(".page-item page-link")[1];
		
    	$.ajax({type : "GET",
    		url: "/questions?page=0&size=5", success: function(data){
    			questions = data._embedded.questions;
    			
    			$.each(questions, function(i,question){
    				questionTitles[i].text=question.title;
    				questionTitles[i].href=question._links.answers.href;
    				if(question.body.length>300){
    					questionBody[i].innerHTML=question.body.substr(0,300)+"...";
    				}
    				else{
    					questionBody[i].innerHTML=question.body;    				
    				}
  			  });
    		  return data;
	   }});
    }
	
	
	$(".page-link").click(function(){
		
		    var currPage = $(this);
			var pageNumber=$(currPage).text();
			if(pageNumber!=1){
				$("#previous").parent().removeClass("disabled");
			}
			var prevPageNumber = makePreviousActivePageInactive();
			alert('prevPage '+prevPageNumber);
			
			if(pageNumber=="Next"){
				alert("next page");
				if($("#page3").text()==prevPageNumber){
					setPageNumbers(parseInt(prevPageNumber)+1);
					currPage = $("#page1");
					
				}else{
					var pages = $(".page-link");
					
					$.each(pages,function(i,page){
						var pageValue = $(page).text();
						if(pageValue!="Previous" && pageValue!="Next" && parseInt(pageValue)==parseInt(prevPageNumber)+1){
							currPage = page;
							return false;
						}
					});
				}
				
			}
			
			if(pageNumber=="Previous"){
				alert("prev page");
				if($("#page1").text()==prevPageNumber){
					setPageNumbers(parseInt(prevPageNumber)-1);
					currPage = $("#page3");
					
				}else{
					var pages = $(".page-link");
					
					$.each(pages,function(i,page){
						var pageValue = $(page).text();
						if(pageValue!="Previous" && pageValue!="Next" && parseInt(pageValue)+1==parseInt(prevPageNumber)){
							currPage = page;
							return false;
						}
					});
				}
				
			}
			
			makePageActive($(currPage));
			pageNumber=$(currPage).text();
			
			
			
			var url = "/questions?page="+(pageNumber-1)+"&size=5";
			if (history.pushState) {
		          var newurl = window.location.href  + '?page='+(pageNumber);
		          alert(window.location.href);
		          window.history.pushState({path:newurl},'',newurl);
		      }
			$.ajax({type : "GET",
	    		url: url, success: function(data){
	    			questions = data._embedded.questions;
	    			$.each(questions, function(i,question){
	    				questionTitles[i].text=question.title;
	    				questionTitles[i].href=question._links.answers.href;
	    				if(question.body.length>300){
	    					questionBody[i].innerHTML=question.body.substr(0,300)+"...";
	    				}
	    				else{
	    					questionBody[i].innerHTML=question.body;    				
	    				}
	  			  });
		   }});
	});
	
	function makePreviousActivePageInactive(){
		var prevElement = $(".page-item.active");
		var pageNumber = $($(prevElement[0]).children()[0]).text();
		$(prevElement[0]).removeClass("active");
		return pageNumber;
	}
	
	function makePageActive(element){
		element.parent().addClass("active");
	}
	
	
	function setPageNumbers(startPageNumber){
		var pageElements = $(".page-link");
		
		$.each(pageElements, function(i,pageElement){
			var pageValue = $(pageElement).text();
			if(pageValue!="Previous" && pageValue!="Next"){
				$(pageElement).text(startPageNumber);
				startPageNumber++;
			}	
		});
		
	}
	
	/*function makePreviousPageInactive(){
		currPage.parent().removeClass("active");
	}
	
	function getAllPAginationElements(){
		return $(".page-item");
	}
	
	
	function getCurrentActivePageElement(){
		var elements = getAllPAginationElements();
		$.each(elements, function(i,element){
			if($(element).attr('class').split(/\s+/).indexOf("active")!=-1){
				return element;
			}
		}
	}*/
});