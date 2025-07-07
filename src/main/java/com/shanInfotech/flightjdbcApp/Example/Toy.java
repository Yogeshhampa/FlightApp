package com.shanInfotech.flightjdbcApp.Example;


public class Toy {
	private int toyId;
	private String toyName;
	private String countryOrigin;
	private double toyprice;
	public Toy() {
		super();
	}
	public Toy(int toyId, String toyName, String countryOrigin, double toyprice) {
		super();
		this.toyId = toyId;
		this.toyName = toyName;
		this.countryOrigin = countryOrigin;
		this.toyprice = toyprice;
	}
	public int getToyId() {
		return toyId;
	}
	public void setToyId(int toyId) {
		this.toyId = toyId;
	}
	public String getToyName() {
		return toyName;
	}
	public void setToyName(String toyName) {
		this.toyName = toyName;
	}
	public String getCountryOrigin() {
		return countryOrigin;
	}
	public void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}
	public double getToyprice() {
		return toyprice;
	}
	public void setToyprice(double toyprice) {
		this.toyprice = toyprice;
	}
	@Override
	public String toString() {
		return "Toy [toyId=" + toyId + ", toyName=" + toyName + ", countryOrigin=" + countryOrigin + ", toyprice="
				+ toyprice + "]";
	}
	
	

	
	

}
