package com.Taxi.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Taxi.Dao.TaxiDao;
import com.Taxi.Model.RideDetails;

@Service
public class TaxiImpl implements Taxi {

	@Autowired
	TaxiDao dao;
	
	
	@Override
	public Integer savedetails(RideDetails ridedetails) {
	      dao.save(ridedetails);
	      return ridedetails.getId();
	}
	
	
	@Override
	public List<RideDetails> getalldetails() {
        return dao.findAll();
	}


	@Override
	public RideDetails getonedetail(Integer id) {
		 Optional<RideDetails> o=dao.findById(id);
		 RideDetails r=new RideDetails();
		 if(o.isPresent())
		 {
			 r=o.get();
		 }
		 return r;
		
	}


	@Override
	public void deletedetails(Integer id) {
		RideDetails r=getonedetail(id);
		dao.delete(r);
	}


	@Override
	public void UpdateDetails(RideDetails ridedetails) {
		if(dao.existsById(ridedetails.getId()))
		{
			dao.save(ridedetails);
		}
	}




}
