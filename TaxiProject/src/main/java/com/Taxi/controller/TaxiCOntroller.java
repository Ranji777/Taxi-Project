package com.Taxi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Taxi.Dao.TaxiDao;
import com.Taxi.Model.RideDetails;
import com.Taxi.Service.Taxi;

@Controller
@RequestMapping("/taxi")
public class TaxiCOntroller {
	
	@Autowired
	private TaxiDao dao;
	
	@Autowired
	private Taxi taxi;
	
	@GetMapping("/welcome")
	public String welcome(Model model)
	{
		model.addAttribute("ridedetails", new RideDetails());
		return "taxi";
	}
	
	@PostMapping("/saved")
	public String saved(@ModelAttribute RideDetails ridedetails,Model model)
	{
		taxi.savedetails(ridedetails);
		model.addAttribute("message", "Hii "+ridedetails.getFirstname()+" Ur Booking Has been Saved... Thank you!...");
		
		model.addAttribute("ridedetails", new RideDetails());
		return "save";
	}
	
	@GetMapping("/all")
	public String all(Model model)
	{
	    List<RideDetails> list=taxi.getalldetails();
		model.addAttribute("list", list);
		return "data";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam Integer id,Model model)
	{
		taxi.deletedetails(id);
		return "redirect:all";
		
	}
	
	@GetMapping("/edit")
	public String edit(@RequestParam Integer id,Model model)
	{
		RideDetails r=taxi.getonedetail(id);
		model.addAttribute("ridedetails", r);
		return "edit";
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute RideDetails ridedetails)
	{
		taxi.UpdateDetails(ridedetails);
		return "redirect:all";
	}

}
