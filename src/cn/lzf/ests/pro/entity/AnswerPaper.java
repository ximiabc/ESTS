package cn.lzf.ests.pro.entity;

import java.util.HashSet;
import java.util.Set;

public class AnswerPaper {
	private Integer id;
	private Student student;
	private Paper paper;
	private Set<AnswerQuestion>answerQuestions=new HashSet<AnswerQuestion>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	public Set<AnswerQuestion> getAnswerQuestions() {
		return answerQuestions;
	}
	public void setAnswerQuestions(Set<AnswerQuestion> answerQuestions) {
		this.answerQuestions = answerQuestions;
	}
}
