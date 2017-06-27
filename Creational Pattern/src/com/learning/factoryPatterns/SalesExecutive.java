package com.learning.factoryPatterns;

public class SalesExecutive extends Employee {
	
	

	@Override
	public CarRental bookCarRental() {
		
		return new LuxuryCarRental();
	}

	@Override
	public HotelReservation bookHotel() {
		
		return new FiveStarHotelBooking();
	}

	@Override
	public FlightBooking bookFlight() {
		
		return new FirstClassFlightBooking();
	}

}
