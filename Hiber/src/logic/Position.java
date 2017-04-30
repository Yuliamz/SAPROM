package logic;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

@javax.persistence.Entity
@Table(name="POSITION")

public class Position {
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="CODE")
	private long id;
	@Column(name="POSITION_NAME")
	private String name;
	@Column(name="SALARY")
	private BigDecimal salary;

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
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

    @Override
    public String toString() {
        return "ID: "+id+", Nombre: "+name+", Salario: "+salary;
    }
	
	
	
	
}
