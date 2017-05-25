package cn.lzf.ests.pro.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 教师实体
 * @author 李志飞
 *
 */
public class Teacher {
	private Integer id;
	private String account;
	private String pass;
	private String name;
	private Set<Classes>classes=new HashSet<Classes>();
	
	public Teacher() {
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

	public Set<Classes> getClasses() {
		return classes;
	}

	public void setClasses(Set<Classes> classes) {
		this.classes = classes;
	}
}
