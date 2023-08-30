package com.lcwd.rating.service.services;

import com.lcwd.rating.service.entities.Rating;
import java.util.*;

public interface RatingService {
	
	//Create Ratings
	Rating createRating(Rating rating);
	
	//Get all rating
	List<Rating> getRatings();
	
	//Get all by user 
	List<Rating> getRatingsByUserId(String userId);
	
	//Get all by hotel 
	List<Rating> getRatingsByHotelId(String hotelId);

}
