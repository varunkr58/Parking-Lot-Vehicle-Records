package com.parking.lot.vehicle.records;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.*;

@SpringBootApplication
@EntityScan("com.parking.lot.vehicle.records.model")
@EnableJpaRepositories("com.parking.lot.vehicle.records.repository")
public class ParkingLotVehicleRecords {
	
	public static void main(String[] args) {
		SpringApplication.run(ParkingLotVehicleRecords.class, args);
	}

}