package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Flight")
public class Flight {

@Id
@Column(name="flightid",nullable=false)
private int flightId;

@Column(name="flightsource")
private String flightSrc;

@Column(name="flightdest")
private String flightDest;

@Column(name="flightdate")
private String flightDate;

@Column(name="flightseat")
private String flightSeat;

@Column(name="ticketcost")
private String ticketCost;

public int getFlightId() {
	return flightId;
}

public void setFlightId(int flightId) {
	this.flightId = flightId;
}

public String getFlightSrc() {
	return flightSrc;
}

public void setFlightSrc(String flightSrc) {
	this.flightSrc = flightSrc;
}

public String getFlightDest() {
	return flightDest;
}

public void setFlightDest(String flightDest) {
	this.flightDest = flightDest;
}

public String getFlightDate() {
	return flightDate;
}

public void setFlightDate(String flightDate) {
	this.flightDate = flightDate;
}

public String getFlightSeat() {
	return flightSeat;
}

public void setFlightSeat(String flightSeat) {
	this.flightSeat = flightSeat;
}

public String getTicketCost() {
	return ticketCost;
}

public void setTicketCost(String ticketCost) {
	this.ticketCost = ticketCost;
}




}
