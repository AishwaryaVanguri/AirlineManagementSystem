package com.ajp.entities;


import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Payment")

public class Payement {
	@Id
	private int paymentID; // primary key

	@ManyToOne
    @JoinColumn(name = "TicketID")  // foreign key
    private Ticket ticket;
	
	@Column(name = "Amount")
    private float amount;

    @Column(name = "PaymentDate")
    private LocalDate paymentDate;

    public Payement() {
    	
    }
    
	public Payement(int paymentID, Ticket ticket, float amount, LocalDate paymentDate) {
		super();
		this.paymentID = paymentID;
		this.ticket = ticket;
		this.amount = amount;
		this.paymentDate = paymentDate;
	}

	public int getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount2) {
		this.amount = amount2;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate2) {
		this.paymentDate = paymentDate2;
	}

	@Override
	public String toString() {
		return "Payement [paymentID=" + paymentID + ", ticket=" + ticket + ", amount=" + amount + ", paymentDate="
				+ paymentDate + "]";
	}
	
	
    
  
    
}
