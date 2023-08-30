package com.lcwd.hotel.service.services;

import java.util.List;

import com.lcwd.hotel.service.entities.Hotel;

public interface HotelService {
	
	//Create 
	Hotel saveHotel(Hotel hotel);
	
	//Get all 
	List<Hotel> getAllHotel();
	
	//Get specific
	Hotel getHotelById(String hotelId);
}
