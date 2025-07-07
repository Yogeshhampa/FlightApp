package com.shanInfotech.flightjdbcApp.preparedStatementEx;

public class Liquor {
	private int batchNo;
	private String liquorName;
	private String countryOrigin;
	private String LiquorType;
	private int years;
	private double price;
	public Liquor() {
		super();
	}
	public Liquor(int batchNo, String liquorName, String countryOrigin, String liquorType, int years, double price) {
		super();
		this.batchNo = batchNo;
		this.liquorName = liquorName;
		this.countryOrigin = countryOrigin;
		LiquorType = liquorType;
		this.years = years;
		this.price = price;
	}
	public int getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(int batchNo) {
		this.batchNo = batchNo;
	}
	public String getLiquorName() {
		return liquorName;
	}
	public void setLiquorName(String liquorName) {
		this.liquorName = liquorName;
	}
	public String getCountryOrigin() {
		return countryOrigin;
	}
	public void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}
	public String getLiquorType() {
		return LiquorType;
	}
	public void setLiquorType(String liquorType) {
		LiquorType = liquorType;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Liquor [batchNo=" + batchNo + ", liquorName=" + liquorName + ", countryOrigin=" + countryOrigin
				+ ", LiquorType=" + LiquorType + ", years=" + years + ", price=" + price + "]";
	}
	
	
	
	

}
