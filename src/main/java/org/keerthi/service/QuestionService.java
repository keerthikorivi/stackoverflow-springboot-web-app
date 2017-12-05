package org.keerthi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.keerthi.Entity.Question;
import org.keerthi.repository.QuestionRepository;

@Service
public class QuestionService {

	@Autowired
	private QuestionRepository questionRepository;
	
	public List<Question> getQuestions(){
		List<Question> questions = new ArrayList<Question>();
		questionRepository.findAll().forEach(questions::add);
		return questions;
	}
	
	public Question getQuestion(BigInteger questionId) {
		return questionRepository.findOne(questionId);
	}
}
