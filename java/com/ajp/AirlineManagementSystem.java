package com.ajp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import com.ajp.ServiceImpl.ServiceImpl;
import com.ajp.entities.Airline;
import com.ajp.entities.Flight;
import com.ajp.entities.FlightClass;
import com.ajp.entities.Passenger;
import com.ajp.entities.Payement;
import com.ajp.entities.Ticket;
import com.ajp.service.Service;


public class AirlineManagementSystem {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Airline Management System Application");
		Scanner sc=new Scanner(System.in);
		System.out.println("You are 1.User 2.Admin \nEnter Choice");
		int user = sc.nextInt();
		
		Service service = new ServiceImpl();
	        if (user == 1)
	        {
	        System.out.println("1. Get airline details");
	    	System.out.println("2. Get flight details");
	    	System.out.println("3. Get flightclass details");
	    	System.out.println("4. Get passenger details");
	    	System.out.println("5. Get payement details");
	    	System.out.println("6. Get ticket details");
	    	
	    	int a=sc.nextInt();
	    	while(a>0)
	    	{
	    		switch (a)
	    		{
	    		case 1:
	    			System.out.println("Enter airline id:");
	    	        int id = sc.nextInt();
	    	        // Call method to get airline details by ID using AirlineService
	    	        service.getAirline(id);
	    			break;
	    			
	    		case 2:
	    			System.out.println("Enter flight id:");
	    	        int flightId = sc.nextInt();
	    	        // Call method to get flight details by ID using FlightService
	    	        service.getFlightById(flightId);
	    			break;
	    			
	    		 case 3:
	                    System.out.println("Enter flight class id:");
	                    int ClassId = sc.nextInt();
	                    service.getFlightClassById(ClassId);
	                    break;
	                case 4:
	                    System.out.println("Enter passenger id:");
	                    int passengerId = sc.nextInt();
	                    service.getPassengerById(passengerId);
	                    break;
	                case 5:
	                    System.out.println("Enter payement id:");
	                    int payementId = sc.nextInt();
	                    service.getPaymentById(payementId);
	                    break;
	                case 6:
	                    System.out.println("Enter ticket id:");
	                    int ticketId = sc.nextInt();
	                    service.getTicketById(ticketId);
	                    break;
	                
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }  
	    		System.out.println("1.get airline details");
	    	    System.out.println("2.get flight details");
	    	    System.out.println("3.get flightclass details");
	    	    System.out.println("4.get passenger details");
	    	    System.out.println("5.get payement details");
                System.out.println("4.get ticket details\n Press 0 to exit");
	    	    a = sc.nextInt();
	         }
	}
	        else if (user == 2)
	        {
	        	System.out.println("1.get airline details");
	        	System.out.println("2. Get flight details");
	            System.out.println("3. Get flight class details");
	            System.out.println("4. Get passenger details");
	            System.out.println("5. Get payment details");
	            System.out.println("6. Get ticket details");
	            System.out.println("7. Insert airline");
	            System.out.println("8. Insert flight");
	            System.out.println("9. Insert flight class");
	            System.out.println("10. Insert passenger");
	            System.out.println("11. Insert payment");
	            System.out.println("12. Insert ticket");
	            System.out.println("13. Update passenger");
	            System.out.println("14. Update payment");
	            System.out.println("15. Delete passenger");
	            System.out.println("Enter choice:");

	        	int a=sc.nextInt();
	        	while(a>0) {
	        		switch (a)
	        		{
	        		
	        		case 1:
		    			System.out.println("Enter airline id:");
		    	        int id = sc.nextInt();
		    	        // Call method to get airline details by ID using AirlineService
		    	        service.getAirline(id);
		    			break;
		    			
		    		case 2:
		    			System.out.println("Enter flight id:");
		    	        int flightId = sc.nextInt();
		    	        // Call method to get flight details by ID using FlightService
		    	        service.getFlightById(flightId);
		    			break;
		    			
		    		 case 3:
		                    System.out.println("Enter flight class id:");
		                    int ClassId = sc.nextInt();
		                    service.getFlightClassById(ClassId);
		                    break;
		                case 4:
		                    System.out.println("Enter passenger id:");
		                    int passengerId = sc.nextInt();
		                    service.getPassengerById(passengerId);
		                    break;
		                case 5:
		                    System.out.println("Enter payement id:");
		                    int payementId = sc.nextInt();
		                    service.getPaymentById(payementId);
		                    break;
		                case 6:
		                    System.out.println("Enter ticket id:");
		                    int ticketId = sc.nextInt();
		                    service.getTicketById(ticketId);
		                    break;
	        		
	        			case 7:  // Insert Airline
	        			Airline a1=new Airline();
	        			System.out.println("enter airline Id");
	        			Integer str=sc.nextInt();
	        			a1.setAirlineID(str);
	        			System.out.println("enter airline name");
	        			String str1=sc.next();
	        			a1.setAirlineName(str1);
	        			service.insertAirline(a1);
	        			break;
	        			
	        			case 8: // Insert flight
	        			    Flight flight = new Flight();
	        			    System.out.println("Enter flight ID:");
	        			    int flightId1 = sc.nextInt();
	        			    flight.setFlightID(flightId1);
	        			    System.out.println("Enter flight name:");
	        			    String flightName = sc.next();
	        			    flight.setFlightNumber(flightName);
	        			    System.out.println("Enter departure city:");
	        			    String departureCity = sc.next();
	        			    flight.setDepartureCity(departureCity);
	        			    System.out.println("Enter arrival city:");
	        			    String arrivalCity = sc.next();
	        			    flight.setArrivalCity(arrivalCity);
	        			    System.out.println("Enter departure time (HH:mm):");
	        			    String departureTimeStr = sc.next();
	        			    // Assuming departure time is in format HH:mm
	        			    LocalTime departureTime = LocalTime.parse(departureTimeStr);
	        			    flight.setDepartureTime(departureTime);
	        			    System.out.println("Enter arrival time (HH:mm):");
	        			    String arrivalTimeStr = sc.next();
	        			    // Assuming arrival time is in format HH:mm
	        			    LocalTime arrivalTime = LocalTime.parse(arrivalTimeStr);
	        			    flight.setArrivalTime(arrivalTime);
	        			    
	        			    // Call method to insert flight using FlightService
	        			    service.insertFlight(flight);
	        			    break;    
	        			    
	        			case 9: // Insert flight class
	        			    FlightClass flightClass = new FlightClass();
	        			    System.out.println("Enter flight class ID:");
	        			    int flightClassId1 = sc.nextInt();
	        			    flightClass.setClassID(flightClassId1);
	        			    System.out.println("Enter flight class name:");
	        			    String flightClassName = sc.next();
	        			    flightClass.setClassName(flightClassName);
	        			    
	        			    // Call method to insert flight class using FlightClassService
	        			    service.insertFlightClass(flightClass);
	        			    break;
	        			    
	        			case 10: // Insert passenger
	        			    Passenger passenger1 = new Passenger();
	        			    System.out.println("Enter passenger ID:");
	        			    int passengerId1 = sc.nextInt();
	        			    passenger1.setPassengerID(passengerId1);
	        			    System.out.println("Enter passenger first name:");
	        			    String firstName = sc.next();
	        			    passenger1.setFirstName(firstName);
	        			    System.out.println("Enter passenger last name:");
	        			    String lastName = sc.next();
	        			    passenger1.setLastName(lastName);
	        			    System.out.println("Enter passenger email:");
	        			    String email = sc.next();
	        			    passenger1.setEmail(email);
	        			    
	        			    // Call method to insert passenger using PassengerService
	        			    service.insertPassesnger(passenger1);
	        			    break;

	        			case 11: // Insert payment
	        			    Payement payement = new Payement();
	        			    System.out.println("Enter payement ID:");
	        			    int paymentId = sc.nextInt();
	        			    payement.setPaymentID(paymentId);
	        			    System.out.println("Enter amount:");
	        			    float amount = sc.nextFloat();
	        			    payement.setAmount(amount);
	        			    System.out.println("Enter payment date (yyyy-MM-dd):");
	        			    String payementDateStr11 = sc.next();
	        			    LocalDate paymentDate = LocalDate.parse(payementDateStr11);
	        			    payement.setPaymentDate(paymentDate);
	        			    
	        			    // Call method to insert payment using PaymentService
	        			    service.insertPayement(payement);
	        			    break;

	        			case 12: // Insert ticket
	        			    Ticket ticket = new Ticket();
	        			    System.out.println("Enter ticket ID:");
	        			    int ticketId1 = sc.nextInt();
	        			    ticket.setTicketID(ticketId1);
	        			    
	        			    
	        			    System.out.println("Enter passenger ID:");
	        			    int passengerId11 = sc.nextInt();
	        			    
	        			    System.out.println("Enter flight ID:");
	        			    int flightId11 = sc.nextInt();
	        			    
	        			    System.out.println("Enter flight class ID:");
	        			    int flightClassId11 = sc.nextInt();
	        			    
	        			    System.out.println("Enter seat number:");
	        			    String seatNumber = sc.next();
	        			    
	        			    // Create Passenger, Flight, and FlightClass objects using IDs
	        			    Passenger passenger11 = new Passenger();
	        			    passenger11.setPassengerID(passengerId11);
	        			    
	        			    Flight flight1 = new Flight();
	        			    flight1.setFlightID(flightId11);
	        			    
	        			    FlightClass flightClass1 = new FlightClass();
	        			    flightClass1.setClassID(flightClassId11);
	        			    
	        			    // Set Passenger, Flight, FlightClass, and seat number for the ticket
	        			    ticket.setPassenger(passenger11);
	        			    ticket.setFlight(flight1);
	        			    ticket.setFlightClass(flightClass1);
	        			    ticket.setSeatNumber(seatNumber);
	        			    
	        			    // Call method to insert ticket using TicketService
	        			    service.insertTicket(ticket);
	        			    break;
  
	        			case 13: // Update passenger
	        			    Passenger passenger2 = new Passenger();
	        			    
	        			   
	        			    System.out.println("Enter passenger ID to update:");
	        			    int passengerId2 = sc.nextInt();
	        			    passenger2.setPassengerID(passengerId2);
	        			    
	        			    System.out.println("Enter passenger first name:");
	        			    String firstName2 = sc.next();
	        			    passenger2.setFirstName(firstName2);
	        			    
	        			    
	        			    System.out.println("Enter passenger last name:");
	        			    String lastName2 = sc.next();
	        			    passenger2.setLastName(lastName2);
	        			    
	        			    
	        			    System.out.println("Enter passenger email:");
	        			    String email2 = sc.next();
	        			    passenger2.setEmail(email2);
	        			    
	        			    // Call method to update passenger using PassengerService
	        			    service.updatePassesnger(passenger2);
	        			    break;
 
	        			case 14: // Update payment
	        			    Payement payment2 = new Payement();
	        			    
	        			 
	        			    System.out.println("Enter payment ID to update:");
	        			    int paymentId2 = sc.nextInt();
	        			    payment2.setPaymentID(paymentId2);
	        			    
	        			    
	        			    System.out.println("Enter amount:");
	        			    float amount2 = sc.nextFloat();
	        			    payment2.setAmount(amount2);
	        			    
	        			  
	        			    System.out.println("Enter payment date (yyyy-MM-dd):");
	        			    String payementDateStr2 = sc.next();
	        			    LocalDate payementDate = LocalDate.parse(payementDateStr2);
	        			    payment2.setPaymentDate(payementDate);
	        			    
	        			    // Call method to update payment using PaymentService
	        			    service.updatePayement(payment2);
	        			    break;
  

  
	        			case 15: // Delete passenger
	        			    Passenger passenger3 = new Passenger();
	        			    
	        			    
	        			    System.out.println("Enter passenger ID to be deleted:");
	        			    int passengerIdToDelete = sc.nextInt();
	        			    passenger3.setPassengerID(passengerIdToDelete);
	        			    
	        			    // Call method to delete passenger using PassengerService
	        			    service.deletePassesnger(passenger3);
	        			    break;
	        			    
	        			    default :
	        			    	System.out.println("invalid option");
	        					break;
	        		}
	        		
	        		System.out.println("1.get airline details");
	        		System.out.println("2. Get flight details");
		            System.out.println("3. Get flight class details");
		            System.out.println("4. Get passenger details");
		            System.out.println("5. Get payment details");
		            System.out.println("6. Get ticket details");
		            System.out.println("7. Insert airline");
		            System.out.println("8. Insert flight");
		            System.out.println("9. Insert flight class");
		            System.out.println("10. Insert passenger");
		            System.out.println("11. Insert payment");
		            System.out.println("12. Insert ticket");
		            System.out.println("12.Update passenger");
		            System.out.println("14. Update payment");
		            System.out.println("15. Delete passenger");
		            System.out.println("enter choice \nPress 0 to exit");

		            a = sc.nextInt();
	        	}
	        	   
	        }
	        sc.close();
	    } 
	
}

	    
	


