package com.parking.lot.vehicle.records.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.parking.lot.vehicle.records.repository.ChargesPerHourRepository;

import graphql.schema.DataFetcher;

@Component
public class GraphQLDataFetchers {
	
	@Autowired
	private ChargesPerHourRepository chargesPerHourRepository;
	
	 public DataFetcher getBookByIdDataFetcher() {
	        return dataFetchingEnvironment -> {
	            return chargesPerHourRepository.findAll();
	        };
	    }
}
