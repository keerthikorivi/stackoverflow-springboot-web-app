package org.keerthi.Controller;

import java.math.BigInteger;
import java.util.List;

import org.keerthi.Entity.Question;
import org.keerthi.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@RequestMapping("/questions")
	public List<Question> getQuestions(){
		return questionService.getQuestions();		
	}
	
	@RequestMapping("/questions/{id}")
	public Question getQuestion(@PathVariable BigInteger id){
		return questionService.getQuestion(id);		
	}

}
