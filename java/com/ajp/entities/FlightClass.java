package com.ajp.entities;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FlightClass")

public class FlightClass {

	@Id
	private int classID;  // primary key
	
	@Column(name = "ClassName")
    private String className;
	
	public FlightClass() {
		
	}

	public FlightClass(int classID, String className) {
		super();
		this.classID = classID;
		this.className = className;
	}

	public int getClassID() {
		return classID;
	}

	public void setClassID(int classID) {
		this.classID = classID;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "FlightClass [classID=" + classID + ", className=" + className + "]";
	}
	
	
	
}
	