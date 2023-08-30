package com.lcwd.user.service.entities;



import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "micro_users")
public class User {
	
	@Id
	@Column(name="ID")
	private String id;
	
	@Column(name="Name" , length = 100)
	private String name;
	
	@Column(name="Email", length=100)
	private String email;
	
	@Column(name="About")
	private String about;
	
	@Transient
	private List<Ratings> ratings;
	
}