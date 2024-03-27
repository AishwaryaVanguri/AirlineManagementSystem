package com.ajp.entities;

import javax.persistence.Column;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Passenger")

public class Passenger {
	
	@Id
	private int passengerID;   //primary key
	
	@Column(name = "FirstName")
	private String firstName;
	
	@Column(name = "LastName")
	private String lastName;
	
	@Column(name = "Email")
	private String email;
	
	public Passenger() {
		
	}


	public Passenger(int passengerID, String firstName, String lastName, String email) {
		super();
		this.passengerID = passengerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getPassengerID() {
		return passengerID;
	}

	public void setPassengerID(int passengerID) {
		this.passengerID = passengerID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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


	@Override
	public String toString() {
		return "Passenger [passengerID=" + passengerID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + "]";
	}
		
   
	
}
