package com.lcwd.hotel.service.services.impls;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.hotel.service.entities.Hotel;
import com.lcwd.hotel.service.exceptions.ResourceNotFoundException;
import com.lcwd.hotel.service.repositories.HotelRepository;
import com.lcwd.hotel.service.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel saveHotel(Hotel hotel) {
		String randomHotelId = UUID.randomUUID().toString();
		hotel.setId(randomHotelId);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotel() {
		return hotelRepository.findAll();
	}

	// Get single hotel data from hotelId
	@Override
	public Hotel getHotelById(String hotelId) {
		// Get hotel from database with the help of user Repository
		Hotel hotel = hotelRepository.findById(hotelId)
				.orElseThrow(() -> new ResourceNotFoundException("Hotel with given Id not found !! " + hotelId));
		return hotel;
	}

}
