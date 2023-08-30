package com.lcwd.hotel.service.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor 
@NoArgsConstructor
@Entity
@Table(name = "hotels")
public class Hotel {
	
	@Id
	@Column(name = "ID")
	private String id;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Location")
	private String location;
	
	@Column(name = "About")
	private String about;
	
}
