package com.ajp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.ajp.ServiceImpl.ServiceImpl;
import com.ajp.entities.Flight;
import com.ajp.entities.FlightClass;
import com.ajp.entities.Passenger;
import com.ajp.entities.Payement;
import com.ajp.entities.Ticket;

public class ServiceImplTest {
 ServiceImpl ssimp=new ServiceImpl();
 Flight f=new Flight();
 FlightClass fc=new FlightClass();
 Passenger p=new Passenger();
 Payement pa=new Payement();
 Ticket t=new Ticket();
 
 @Test
public void displayFlight() {
	int f=ssimp.displayFlight();
 	assertEquals(1,f);

 }
 
 @Test
 public void displayPassenger()
 {
	 int p=ssimp.displayPassenger();
 	assertEquals(1,p);
 }
 

@Test
 public void displayPayement()
 {
 	int pa=ssimp.displayPayement();
 	assertEquals(1,pa);
 }
 @Test
 public void displayTicket()
 {
 	int da=ssimp.displayTicket();
 	assertEquals(1,t);
 }
 
 @Test
 public void getPassengerById() {
	 int i=ssimp.getPassengerById();
	 assertEquals(1,i);
 }

 @Test
 public void getPayement()
 {
	 int i=ssimp.getPaymentById(12);
	 assertEquals(1,i);
 }
 
 @Test
 public void getTicket() {
	int i=ssimp.getTicketById(123);
	assertEquals(1,i);
	
}
@Test
public void getPassenger()
{
	int i=ssimp.getPassengerById();
	assertEquals(1,i);
	
	
}
	
}

