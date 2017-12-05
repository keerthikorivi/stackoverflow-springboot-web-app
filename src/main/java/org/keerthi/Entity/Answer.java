package org.keerthi.Entity;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="answer")
public class Answer implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "answer_id", unique = true)
	private BigInteger answerId;
	
	private BigInteger ownerUserId;
	
	private Date creationDate;
	
	@ManyToOne
	@JoinColumn(name = "question_id")
	private Question question;
	
	private BigInteger score;
	
	private String body;
	
	public Answer() {
		super();
	}
	
	public Answer(BigInteger answerId, BigInteger ownerUserId, Date creationDate, Question question, BigInteger score, String body) {
		this.answerId = answerId;
		this.ownerUserId = ownerUserId;
		this.creationDate = creationDate;
		this.question = question;
		this.score = score;
		this.body = body;
	}

	public BigInteger getAnswerId() {
		return answerId;
	}

	public void setAnswerId(BigInteger answerId) {
		this.answerId = answerId;
	}

	public BigInteger getOwnerUserId() {
		return ownerUserId;
	}

	public void setOwnerUserId(BigInteger ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public BigInteger getScore() {
		return score;
	}

	public void setScore(BigInteger score) {
		this.score = score;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
