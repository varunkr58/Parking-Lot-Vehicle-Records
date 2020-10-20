package com.parking.lot.vehicle.records.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="charges_per_hour")
public class ChargesPerHourDB {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
    private Long id;
	
	@Column(name="hours")
	private int hours;
	
	@Column(name="charges")
	private int charges;

	public ChargesPerHourDB() {}
	
	public ChargesPerHourDB(Long id, int hours, int charges) {
		super();
		this.id = id;
		this.hours = hours;
		this.charges = charges;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getCharges() {
		return charges;
	}

	public void setCharges(int charges) {
		this.charges = charges;
	}

}