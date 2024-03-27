package com.ajp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Ticket")
public class Ticket {
    @Id  
	private int ticketID;   //primary key
	
	@ManyToOne
	@JoinColumn(name = "PassengerID")  // foreign keys
	private Passenger passenger;
	
	@ManyToOne
	@JoinColumn(name = "FlightID")
	private Flight flight;
	
	@ManyToOne
    @JoinColumn(name = "ClassID")
    private FlightClass flightClass;

	@Column(name = "SeatNumber")
	private String seatNumber;
	
	
	public Ticket() {
		
	}
	
	public Ticket(int ticketID, Passenger passenger, Flight flight, FlightClass flightClass, String seatNumber) {
		super();
		this.ticketID = ticketID;
		this.passenger = passenger;
		this.flight = flight;
		this.flightClass = flightClass;
		this.seatNumber = seatNumber;
	}

	public int getTicketID() {
		return ticketID;
	}

	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passengerId) {
		this.passenger = passengerId;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flightId) {
		this.flight = flightId;
	}

	public FlightClass getFlightClass() {
		return flightClass;
	}

	public void setFlightClass(FlightClass flightClass) {
		this.flightClass = flightClass;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	@Override
	public String toString() {
		return "Ticket [ticketID=" + ticketID + ", passenger=" + passenger + ", flight=" + flight + ", flightClass="
				+ flightClass + ", seatNumber=" + seatNumber + "]";
	}
	
	
}
	
