package com.learning.factoryPatterns;

public abstract class Employee {
	
	protected FlightBooking _flight;
	protected HotelReservation _hotel;
	protected CarRental _car;
	

	public void getReadyForTravel() {
		_flight = bookFlight();
		_hotel = bookHotel();
		_car= bookCarRental();
		
	}
	
	public abstract CarRental bookCarRental() ;

	public abstract HotelReservation bookHotel() ;

	public abstract FlightBooking bookFlight() ;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %s %s %s", getClass(), _flight, _hotel, _car);
	}

}
