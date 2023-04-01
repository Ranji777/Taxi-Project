package com.Taxi.Dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.Taxi.Model.RideDetails;

public interface TaxiDao extends JpaRepository<RideDetails, Integer>{
	
}
