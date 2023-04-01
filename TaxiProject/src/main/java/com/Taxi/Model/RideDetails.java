package com.Taxi.Model;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class RideDetails {
	
	@Id
	@GeneratedValue
	@Column(name="aid")
	private int id;
	
    @Column(name="bfirstname")
    private String firstname;
 
    @Column(name="clastname")
    private String lastname;
    
    @Column(name="dphone")
    private long phone;
    
    @Column(name="eemail")
    private String email;
    
    @Column(name="fride")
    private String ride;
    
    @Column(name="glocation")
    private String location;
    
    @Column(name="hdate")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private String date;
    
    @Column(name="itime")
    private String time;
    
    @Column(name="jmembers")
    private int members;
    
    @Column(name="kpayment")
    private String payment;
    
    @Column(name="lquery")
    private String query;
    
    public RideDetails() {
		// TODO Auto-generated constructor stub
	}

	public RideDetails(String firstname, String lastname, long phone, String email, String ride, String location,
			String date, String time, int members, String payment, String query) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.email = email;
		this.ride = ride;
		this.location = location;
		this.date = date;
		this.time = time;
		this.members = members;
		this.payment = payment;
		this.query = query;
	}

	@Override
	public String toString() {
		return "RideDetails [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", phone=" + phone
				+ ", email=" + email + ", ride=" + ride + ", location=" + location + ", date=" + date + ", time=" + time
				+ ", members=" + members + ", payment=" + payment + ", query=" + query + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRide() {
		return ride;
	}

	public void setRide(String ride) {
		this.ride = ride;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getMembers() {
		return members;
	}

	public void setMembers(int members) {
		this.members = members;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}
    
    
    
}
