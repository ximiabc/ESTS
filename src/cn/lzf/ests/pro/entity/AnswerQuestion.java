package cn.lzf.ests.pro.entity;


public class AnswerQuestion {
	private Integer id;
	private AnswerPaper answerPaper;
	private Question question;
	private String result;
	private Integer grade;
	public AnswerQuestion() {
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public AnswerPaper getAnswerPaper() {
		return answerPaper;
	}
	public void setAnswerPaper(AnswerPaper answerPaper) {
		this.answerPaper = answerPaper;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}
