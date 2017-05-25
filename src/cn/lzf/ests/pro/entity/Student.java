package cn.lzf.ests.pro.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 学生
 */
public class Student {
	private Integer id;
	private String account;
	private String pass;
	private String name;
	private Set<AnswerPaper>answerPapers=new HashSet<AnswerPaper>();
	private Classes classes;

	public Student() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
}
