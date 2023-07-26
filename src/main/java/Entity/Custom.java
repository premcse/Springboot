package Entity;


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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="Sts_name")
	private String name;
	
	public Custom(Integer id, String name, Integer rollno, String gender) {
		super();
		this.id = id;
		this.name = name;
		Rollno = rollno;
		Gender = gender;
	}

	@Column(name="Sts_rollno")
	private Integer Rollno;
	
	@Column(name="Sts_gender")
	private String Gender;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRollno() {
		return Rollno;
	}
	public void setRollno(Integer rollno) {
		Rollno = rollno;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	@Override
	public String toString() {
		return "Custom [id=" + id + ", name=" + name + ", Rollno=" + Rollno + ", Gender=" + Gender + "]";
	}
	

}
