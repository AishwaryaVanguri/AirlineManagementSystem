package com.ajp.entities;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Flight")

public class Flight {
	 @Id
	 private int flightID; // primary key 
	 
	@Column(name = "FlightName")
	private String flightName;
	 
	@Column(name = "DepartureCity")
    private String departureCity;

    @Column(name = "ArrivalCity")
    private String arrivalCity;

    @Column(name = "DepartureTime")
    private LocalTime departureTime;

    @Column(name = "ArrivalTime")
    private LocalTime arrivalTime;

    @ManyToOne
    @JoinColumn(name = "AirlineID") // foreign key
    private Airline airline;
    
    
    public Flight() {
    	
    }
    

	public Flight(int flightID, String flightNumber, String departureCity, String arrivalCity, LocalTime departureTime,
			LocalTime arrivalTime, Airline airline) {
		super();
		this.flightID = flightID;
		this.flightName = flightName;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.airline = airline;
	}

	public int getFlightID() {
		return flightID;
	}

	public void setFlightID(int flightID) {
		this.flightID = flightID;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightName = flightName;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime2) {
		this.departureTime = departureTime2;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime2) {
		this.arrivalTime = arrivalTime2;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

// overrides the default toString() method 
	@Override
	public String toString() {
		return "Flight [flightID=" + flightID + ", flightName=" + flightName + ", departureCity=" + departureCity
				+ ", arrivalCity=" + arrivalCity + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime
				+ ", airline=" + airline + "]";
	}
	
	
    
}
