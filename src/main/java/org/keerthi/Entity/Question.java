package org.keerthi.Entity;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class Question implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "question_id", unique = true)
	private BigInteger id;
	
	private BigInteger ownerUserId;
	
	private Date creationDate;
	
	private Date closedDate;
	
	private String title;
	
	private String body;
	
	@OneToMany(mappedBy = "question", fetch = FetchType.LAZY)
	private Set<Answer> answers;
	
	  public Question()
	  {
	        super();
	  }

	  public Question(BigInteger questionId, BigInteger ownerUserId, Date creationDate,Date closedDate,String title,String body, Set<Answer> answers)
	  {
	        super();
	        this.id = questionId;
	        this.ownerUserId = ownerUserId;
	        this.creationDate = creationDate;
	        this.closedDate = closedDate;
	        this.title = title;
	        this.body = body;
	        this.answers = answers;
	 }

	
	public Set<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<Answer> answers) {
		this.answers = answers;
	}

	public BigInteger getQuestionId() {
		return id;
	}

	public void setQuestionId(BigInteger questionId) {
		this.id = questionId;
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

	public Date getClosedDate() {
		return closedDate;
	}

	public void setClosedDate(Date closedDate) {
		this.closedDate = closedDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
