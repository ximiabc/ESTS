package cn.lzf.ests.pro.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 试题
 * @author 李志飞
 *
 */
public class Question {
	private Integer id;
	private String title;
	private String content;
	private String result;
	private Integer type;//类型号0：单选题 1：判断题 2：填空题 3：简答题
	private Integer scores;//分值
	private Paper paper;
	private Set<AnswerQuestion>answerQuestions=new HashSet<AnswerQuestion>();
	
	//单选属性
	private String itemA;
	private String itemB;
	private String itemC;
	private String itemD;
	
	//判断
	//填空
	//简答
	public Question() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getScores() {
		return scores;
	}

	public void setScores(Integer scores) {
		this.scores = scores;
	}
	
	public Set<AnswerQuestion> getAnswerQuestions() {
		return answerQuestions;
	}

	public void setAnswerQuestions(Set<AnswerQuestion> answerQuestions) {
		this.answerQuestions = answerQuestions;
	}

	public String getItemA() {
		return itemA;
	}

	public void setItemA(String itemA) {
		this.itemA = itemA;
	}

	public String getItemB() {
		return itemB;
	}

	public void setItemB(String itemB) {
		this.itemB = itemB;
	}

	public String getItemC() {
		return itemC;
	}

	public void setItemC(String itemC) {
		this.itemC = itemC;
	}

	public String getItemD() {
		return itemD;
	}

	public void setItemD(String itemD) {
		this.itemD = itemD;
	}

	public Paper getPaper() {
		return paper;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
}
