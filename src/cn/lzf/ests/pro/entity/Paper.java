package cn.lzf.ests.pro.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 试卷实体
 * @author 李志飞
 */
public class Paper {
	private Integer id;
	private String name;
	private String info;
	private Classes classes;
	private Set<AnswerPaper>answerPapers=new HashSet<AnswerPaper>();
	private Set<Question>questions=new HashSet<Question>();
	public Paper() {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Classes getClasses() {
		return classes;
	}
	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	
	
	public Set<AnswerPaper> getAnswerPapers() {
		return answerPapers;
	}
	public void setAnswerPapers(Set<AnswerPaper> answerPapers) {
		this.answerPapers = answerPapers;
	}
	public Set<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}
}
