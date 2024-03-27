package com.ajp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Airline")

public class Airline {
	
	  @Id
	  private int airlineID; // Primary key

	  @Column(name = "AirlineName")
	   private String airlineName;
	  
	  // Default constructor with no arguments
	  public Airline() {
		  
	  }
	  
	 // Constructor with parameters to initialize the airlineID and airlineName attributes.
	  public Airline(int airlineID, String airlineName) {
		super();
		this.airlineID = airlineID;
		this.airlineName = airlineName;
	}

  // Getter and setter methods for airlineID and airlineName

	public int getAirlineID() {
		return airlineID;
	}

	public void setAirlineID(int airlineID) {
		this.airlineID = airlineID;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	// This method overrides the default toString() method
	@Override
	public String toString() {
		return "Airline [airlineID=" + airlineID + ", airlineName=" + airlineName + "]";
	}
	

	
}
