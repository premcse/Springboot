package com.example.demo.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Custom {
	@Id
	@Column(name = "Sts_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="Sts_name")
	private String name;
	
	@Column(name="Sts_rollno")
	private Integer rollno;
	
	@Column(name="Sts_gender")
	private String gender;

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

	public Integer getRollno() {
		return rollno;
	}

	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Custom [id=" + id + ", name=" + name + ", rollno=" + rollno + ", gender=" + gender + "]";
	}
	

}
