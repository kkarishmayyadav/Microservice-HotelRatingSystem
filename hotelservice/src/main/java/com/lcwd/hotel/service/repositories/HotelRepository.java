package com.lcwd.hotel.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.hotel.service.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {

}
