package org.keerthi.repository;

import java.math.BigInteger;
import java.util.List;

import org.keerthi.Entity.Answer;
import org.keerthi.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface QuestionRepository extends JpaRepository<Question, BigInteger> {

	
	//getAllQuestions
	
	//getQuestion()
	
	
}
