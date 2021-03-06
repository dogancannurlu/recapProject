package com.etiya.recapProject.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cars")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","rentals"})
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="model_year")
	private int modelYear;
	
	@Column(name="daily_price")
	private double dailyPrice;
	
	@Column(name="description")
	private String description;
	
	@Column(name="findex_point")
	private int findexPoint;
	
	@Column(name="city_name")
	private String cityName;
	
	@Column(name="current_kilometer")
	private int currentKilometer;
	
	@ManyToOne
	@JoinColumn(name="brand_id")
	private Brand brand; 
	
	@ManyToOne 
	@JoinColumn(name="color_id")
	private Color color;
	
	@JsonIgnore
	@OneToMany(mappedBy = "car")
	private List<Rental> rentals;
	
	@JsonIgnore
	@OneToMany(mappedBy = "car")
	private List<CarImage> carImages;
	
	@JsonIgnore
	@OneToMany(mappedBy = "car")
	private List<CarMaintenance> carMaintenances;
	
	@JsonIgnore
	@OneToMany(mappedBy = "car")
	private List<Damage> damages;
}
