package org.keerthi.service;

import java.math.BigInteger;
import java.util.List;
import org.keerthi.Entity.Answer;
import org.keerthi.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {
	
	@Autowired
	private AnswerRepository answerRepository;
	
	public List<Answer> getAnswers(BigInteger questionId){
		return answerRepository.findByQuestionId(questionId);
	}
	
	public Answer getAnswer(BigInteger answerId) {
		return answerRepository.findOne(answerId);	
	}

	public List<Answer> getAnswersByUserId(BigInteger ownerUserId){
		return answerRepository.findByOwnerUserId(ownerUserId);
	}
}
