package io.utkarsh;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

// we have two entity annotation one of JPA and other of hibernate ..you should use the JPA one
// because JPA is main interface ..hibernate class is build by implementing JPA so if any change in future , if we use other class 
// then we have to do minimal changes
@Entity
@Table(name="Pokemon_Name")  // this we create table with name provided other then the pokemon table
// both the table will have same values
public class pokemon {
	
	@Id
	@Column (name="Pokemon_Name")  // table "Pokemon_Name" ke column ka naam hoga jo humne column mai diya hai
	private String name;
	
	
	// agar hum @column annotation hata bhi denge toh hibernate itna smart hai ki vo usse column consider kr lega
	@Column (nullable =false) // by default true hota hai
	private String type;
	
	@Column
	private int power;
	
//	private String colour;
//	
//	
//	public String getColour() {
//		return colour;
//	}
//	public void setColour(String colour) {
//		this.colour = colour;
//	}
	
	
	@Enumerated(EnumType.STRING)
	private Color color;
	// by default Enum mai indexing hoti ...agar hum kuch bhi add krte hai enum mai toh indexing change ho jayegi.. which lead to data inconsistency
	// therefore add EnumType.STRING
	
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	@Override
	public String toString() {
		return this.getName() + " " + this.getPower() + " " + this.getType()+" " +getColor();
	}	
	
	
	
}

