package com.learning.factoryPatterns;

public class Developer extends Employee {

	@Override
	public CarRental bookCarRental() {
		// TODO Auto-generated method stub
		return new EconomyCarRentals();
	}

	@Override
	public HotelReservation bookHotel() {
		// TODO Auto-generated method stub
		return new ThreeStarHotelBooking();
	}

	@Override
	public FlightBooking bookFlight() {
		// TODO Auto-generated method stub
		return new EconomyFlightBooking();
	}

}
