package org.keerthi.repository;

import java.math.BigInteger;
import java.util.List;

import org.keerthi.Entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, BigInteger>{

	public List<Answer> findByQuestionId(BigInteger id);
	
	public List<Answer> findByOwnerUserId(BigInteger ownerUserId);
	
}
