package com.jsp.vehicle.registeration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Registration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int rno;
	private String city;
	
	@OneToOne
	private Vehicle vehicle;
	
	
	// Id
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	// Registration Number
	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}
	
	// City

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	// Vehicle

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	

}
