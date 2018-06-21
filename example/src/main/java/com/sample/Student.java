package com.sample;

@javax.persistence.Entity
public class Student implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "STUDENT_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "STUDENT_ID_SEQ", name = "STUDENT_ID_GENERATOR")
	private java.lang.Long id;

	private java.lang.String name;

	private Integer score;

	private Boolean passed;

	public Student() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Integer getScore() {
		return this.score;
	}

	public void setScore(java.lang.Integer score) {
		this.score = score;
	}

	public java.lang.Boolean getPassed() {
		return this.passed;
	}

	public void setPassed(java.lang.Boolean passed) {
		this.passed = passed;
	}

	public Student(java.lang.Long id, java.lang.String name,
			java.lang.Integer score, java.lang.Boolean passed) {
		this.id = id;
		this.name = name;
		this.score = score;
		this.passed = passed;
	}

}
