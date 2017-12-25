//package org.keerthi.Controller;
//
//import java.math.BigInteger;
//import java.util.List;
//
//import org.keerthi.Entity.Answer;
//import org.keerthi.service.AnswerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class AnswerController {
//	
//	@Autowired
//	private AnswerService answerService;
//	
//	@RequestMapping("/questions/{id}/answers")
//	public List<Answer> getAnswers(@PathVariable BigInteger id){
//		return answerService.getAnswers(id);
//	}
//	
//	@RequestMapping("/questions/{questionId}/answers/{id}")
//	public Answer getAnswer(@PathVariable BigInteger id){
//		return answerService.getAnswer(id);
//	}
//	
//	@RequestMapping("/answers/{id}")
//	public List<Answer> getAnswerByUserId(@PathVariable BigInteger id){
//		return answerService.getAnswersByUserId(id);
//	}
//}
