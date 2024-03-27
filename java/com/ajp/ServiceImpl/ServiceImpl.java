package com.ajp.ServiceImpl;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ajp.entities.Airline;
import com.ajp.entities.Flight;
import com.ajp.entities.FlightClass;
import com.ajp.entities.Passenger;
import com.ajp.entities.Payement;
import com.ajp.entities.Ticket;
import com.ajp.service.Service;

import Airline.Utility.UtilityConfig;

public class ServiceImpl implements Service {
	Session session = UtilityConfig.getSession();
	@Override
	public void insertAirline(Airline a) {
		try {
			Session session = UtilityConfig.getSession();
            Transaction transaction = session.beginTransaction();
            session.save(a);
            transaction.commit();
            System.out.println("inserted airline");
		}
		finally {
			
			session.close();
		}
		
	}
		

	@Override
	public void updateAirline(Airline a) {
		try {
			Session session = UtilityConfig.getSession();
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(a);
            transaction.commit();
            System.out.println("updated airline");
		}
		finally {
			session.close();
		}
		
	}

	@Override
	public void deleteAirline(Airline a) {
		try {
			Session session = UtilityConfig.getSession();
            Transaction transaction = session.beginTransaction();
            session.delete(a);
            transaction.commit();
            System.out.println("deleted airline");
		}
		finally {
			session.close();
		}
		
	}

	@Override
	public void displayAirline() {
		
		TypedQuery tq=session.createQuery("from Airline");
		List<Airline> list=tq.getResultList();
		Iterator<Airline> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

	@Override
	public void getAirline(int id) {
		try {
			Session session = UtilityConfig.getSession();
            Airline a=session.get(Airline.class, id);
            System.out.println(a);
		}
		finally {
			session.close();
		}
		
	}

	@Override
	public void insertFlight(Flight f) {
		try {
			Session session = UtilityConfig.getSession();
            Transaction transaction = session.beginTransaction();
            session.save(f);
            transaction.commit();
            System.out.println("inserted flight");
		}
		finally {
			
			session.close();
		}
	}

	@Override
	public void updateFlight(Flight f) {
		try {
			Session session = UtilityConfig.getSession();
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(f);
            transaction.commit();
            System.out.println("updated flight");
		}
		finally {
			session.close();
		}
		
	}

	@Override
	public void deleteFlight(Flight f) {
		try {
			Session session = UtilityConfig.getSession();
            Transaction transaction = session.beginTransaction();
            session.delete(f);
            transaction.commit();
            System.out.println("deleted flight");
		}
		finally {
			session.close();
		}
		
	}

	@Override
	public int displayFlight() {
		// to retrieve entities from database and display them.
		TypedQuery tq=session.createQuery("from Flight");
		List<Flight> list=tq.getResultList();
		Iterator<Flight> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		return 0;
		
	}

	@Override
	public void getFlightById(int flightID) {
		try {
			Session session = UtilityConfig.getSession();
            Flight f=session.get(Flight.class, flightID);
            System.out.println(f);
		}
		finally {
			session.close();
		}
		
	}

	@Override
	public void insertFlightClass(FlightClass fc) {
		try {
			Session session = UtilityConfig.getSession();
            Transaction transaction = session.beginTransaction();
            session.save(fc);
            transaction.commit();
            System.out.println("inserted flightclass");
		}
		finally {
			
			session.close();
		}
	}

	@Override
	public void updateFlightClass(FlightClass fc) {
		try {
			Session session = UtilityConfig.getSession();
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(fc);
            transaction.commit();
            System.out.println("updated flightclass");
		}
		finally {
			session.close();
		}
		
	}

	@Override
	public void deleteFlightClass(FlightClass fc) {
		try {
			Session session = UtilityConfig.getSession();
            Transaction transaction = session.beginTransaction();
            session.delete(fc);
            transaction.commit();
            System.out.println("deleted flightclass");
		}
		finally {
			session.close();
		}
		
	}

	@Override
	public void displayFlightClass() {
		TypedQuery tq=session.createQuery("from FlightClass");
		List<FlightClass> list=tq.getResultList();
		Iterator<FlightClass> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

	@Override
	public void getFlightClassById(int classID) {
		try {
			Session session = UtilityConfig.getSession();
            FlightClass fc=session.get(FlightClass.class, classID);
            System.out.println(fc);
		}
		finally {
			session.close();
		}
	}

	@Override
	public void insertPassesnger(Passenger p) {
		try {
			Session session = UtilityConfig.getSession();
            Transaction transaction = session.beginTransaction();
            session.save(p);
            transaction.commit();
            System.out.println("inserted passenger");
		}
		finally {
			
			session.close();
		}
		
	}

	@Override
	public void updatePassesnger(Passenger p) {
		try {
			Session session = UtilityConfig.getSession();
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(p);
            transaction.commit();
            System.out.println("updated passenger");
		}
		finally {
			session.close();
		}
		
	}

	@Override
	public void deletePassesnger(Passenger p) {
		try {
			Session session = UtilityConfig.getSession();
            Transaction transaction = session.beginTransaction();
            session.delete(p);
            transaction.commit();
            System.out.println("deleted passenger");
		}
		finally {
			session.close();
		}
	}

	@Override
	public int displayPassenger() {
		TypedQuery tq=session.createQuery("from Passenger");
		List<Passenger> list=tq.getResultList();
		Iterator<Passenger> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		return 1;
	}

	@Override
	public int getPassengerById() {
		try {
			Session session = UtilityConfig.getSession();
            Passenger p=session.get(Passenger.class, passengerID);
            System.out.println(p);
		}
		finally {
			session.close();
		}
		
	}

	@Override
	public void insertPayement(Payement p) {
		try {
			Session session = UtilityConfig.getSession();
            Transaction transaction = session.beginTransaction();
            session.save(p);
            transaction.commit();
            System.out.println("inserted payement");
		}
		finally {
			
			session.close();
		}
		
	}

	@Override
	public void updatePayement(Payement p) {
		try {
			Session session = UtilityConfig.getSession();
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(p);
            transaction.commit();
            System.out.println("updated payement");
		}
		finally {
			session.close();
		}
		
	}

	@Override
	public void deletePayement(Payement p) {
		try {
			Session session = UtilityConfig.getSession();
            Transaction transaction = session.beginTransaction();
            session.delete(p);
            transaction.commit();
            System.out.println("deleted payement");
		}
		finally {
			session.close();
		}
	}

	@Override
	public int displayPayement() {
		TypedQuery tq=session.createQuery("from Payement");
		List<Payement> list=tq.getResultList();
		Iterator<Payement> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		return 1;
		
	}

	@Override
	public int getPaymentById(int paymentID) {
		try {
			Session session = UtilityConfig.getSession();
            Payement p=session.get(Payement.class, paymentID);
            System.out.println(p);
		}
		finally {
			session.close();
		}
		return 1;
		
	}

	@Override
	public void insertTicket(Ticket t) {
		try {
			Session session = UtilityConfig.getSession();
            Transaction transaction = session.beginTransaction();
            session.save(t);
            transaction.commit();
            System.out.println("inserted ticket");
		}
		finally {
			
			session.close();
		}
	}

	@Override
	public void updateTicket(Ticket t) {
		try {
			Session session = UtilityConfig.getSession();
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(t);
            transaction.commit();
            System.out.println("updated ticket");
		}
		finally {
			session.close();
		}
		
	}

	@Override
	public void deleteTicket(Ticket t) {
		try {
			Session session = UtilityConfig.getSession();
            Transaction transaction = session.beginTransaction();
            session.delete(t);
            transaction.commit();
            System.out.println("deleted ticket");
		}
		finally {
			session.close();
		}
		
	}

	@Override
	public int displayTicket() {
		TypedQuery tq=session.createQuery("from Ticket");
		List<Ticket> list=tq.getResultList();
		Iterator<Ticket> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		return 1;
		
	}

	@Override
	public int getTicketById(int ticketID) {
		try {
			Session session = UtilityConfig.getSession();
            Ticket t=session.get(Ticket.class, ticketID);
            System.out.println(t);
		}
		finally {
			session.close();
		}
		return 1;
	}

}
