package com.parking.lot.vehicle.records.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.lot.vehicle.records.model.ChargesPerHourDB;
import com.parking.lot.vehicle.records.repository.ChargesPerHourRepository;

@Service
public class ChargesPerHourServiceClient implements ChargesPerHourService {
	
	private final static Logger LOGGER =  
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	@Autowired
	private ChargesPerHourRepository chargesPerHourRepository;
	
	@Override
	public List<ChargesPerHourDB> findAll() {
		var charges = (List<ChargesPerHourDB>) chargesPerHourRepository.findAll();
		LOGGER.log(Level.INFO, "charges here::\n"+charges);
		return charges;
	}

}