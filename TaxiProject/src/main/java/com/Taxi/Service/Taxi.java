package com.Taxi.Service;

import java.util.List;

import com.Taxi.Model.RideDetails;

public interface Taxi {
    Integer savedetails(RideDetails ridedetails);
	List<RideDetails> getalldetails();
	RideDetails getonedetail(Integer id);
	void deletedetails(Integer id);
	void UpdateDetails(RideDetails ridedetails);
}
