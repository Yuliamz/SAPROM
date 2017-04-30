package logic;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;
@Entity
@Table(name="PERSON")

public class Person {


	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="PERSON_ID")
	private long id;
	@Column(name="PERSON_NAME")
	private String name;
	@Column(name="PERSON_LAST_NAME")
	private String lastName;
	@Column(name="PERSON_EMAIL")
	private String email;
	@Column(name="PERSON_PHONE")
	private long phone;
	@Column(name="PERSON_HIRE_DATE")
	private Date hire_date;
	@Column(name="JOB_ID")
	private long job_id;
	@Column(name="SALARY")
	private long salary;
	@ManyToOne
	@JoinColumn(name="CODE")
	@ForeignKey(name = "fk_position_code")
	private Position positionCode;

    public Position getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(Position positionCode) {
        this.positionCode = positionCode;
    }
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Date getHire_date() {
		return hire_date;
	}
	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}
	public long getJob_id() {
		return job_id;
	}
	public void setJob_id(long job_id) {
		this.job_id = job_id;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}

    @Override
    public String toString() {
        return "ID: "+id+", Nombre: "+name+" "+lastName+", Telefono: "+phone;
    }
        
}
