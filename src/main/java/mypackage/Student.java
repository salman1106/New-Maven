package mypackage;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="students")
public class Student {

	@Id
//	@Generated(value = )
	private int rno;
	
//	@Column(name = "student_name")
	private String name;
	private String qualification;
	private float percentage;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rno, String name, String qualification, float percentage) {
		super();
		this.rno = rno;
		this.name = name;
		this.qualification = qualification;
		this.percentage = percentage;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
}
