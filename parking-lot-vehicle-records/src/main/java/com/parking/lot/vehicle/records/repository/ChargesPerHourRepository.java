package com.parking.lot.vehicle.records.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parking.lot.vehicle.records.model.ChargesPerHourDB;

@Repository
public interface ChargesPerHourRepository extends JpaRepository<ChargesPerHourDB, Long> {

}