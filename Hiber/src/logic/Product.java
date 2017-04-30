package logic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name ="PRODUCTS")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="CODE")
	private long id;
	@Column(name="NAME")
	private String name;
	
	@Column(name="PRICE")
	private String price;
	
	@Column(name="QUALITY")
	private String quality;
	
	@Column(name="TYPE")
	private String type;
	
	@ManyToOne
	@JoinColumn(name="PERSON_ID")
	@ForeignKey(name = "fk_person_id")
	private Person personID;
	
	

	public Person getPersonID() {
		return personID;
	}

	public void setPersonID(Person personID) {
		this.personID = personID;
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

    @Override
    public String toString() {
        return "ID: "+id+", Nombre: "+name+", Precio: "+price;
    }

	
	
	
}
