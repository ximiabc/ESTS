package cn.lzf.ests.pro.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 班级实体
 * @author 李志飞
 *
 */
public class Classes {
	private Integer id;
	private String name;
	private String info;
	private Teacher teacher;
	private Set<Student>students=new HashSet<Student>();
	private Set<Paper>papers=new HashSet<Paper>();
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
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	public Set<Paper> getPapers() {
		return papers;
	}
	public void setPapers(Set<Paper> papers) {
		this.papers = papers;
	}
}
