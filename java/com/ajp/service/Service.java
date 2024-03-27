package com.ajp.service;

import com.ajp.entities.Airline;
import com.ajp.entities.Flight;
import com.ajp.entities.FlightClass;
import com.ajp.entities.Passenger;
import com.ajp.entities.Payement;
import com.ajp.entities.Ticket;

public interface Service {
	
	public void insertAirline(Airline a);
	public void updateAirline(Airline a);
	public void deleteAirline(Airline a);
	public void displayAirline();
	public void getAirline(int id);
	
	public void insertFlight(Flight f);
	public void updateFlight(Flight f);
	public void deleteFlight(Flight f);
	public int displayFlight();
	public void getFlightById(int flightID);
	
	public void insertFlightClass(FlightClass fc);
	public void updateFlightClass(FlightClass fc);
	public void deleteFlightClass(FlightClass fc);
	public void displayFlightClass();
	public void getFlightClassById(int classID);
	
	public void insertPassesnger(Passenger p);
	public void updatePassesnger(Passenger p);
	public void deletePassesnger(Passenger p);
	public int displayPassenger();
	public void getPassengerById(int passengerID);
	
	public void insertPayement(Payement p);
	public void updatePayement(Payement p);
	public void deletePayement(Payement p);
	public int displayPayement();
	public int getPaymentById(int paymentID);
	
	public void insertTicket(Ticket t);
	public void updateTicket(Ticket t);
	public void deleteTicket(Ticket t);
	public int displayTicket();
	public int getTicketById(int ticketID);
	int getPassengerById();
	

}
