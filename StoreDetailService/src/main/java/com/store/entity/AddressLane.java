package com.store.entity;

public class AddressLane {
	private String houseNo;
	private String town;
	private String dist;
	private String state;
	private String country;
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "AddressLane [houseNo=" + houseNo + ", town=" + town + ", dist=" + dist + ", state=" + state
				+ ", country=" + country + "]";
	}
	
	

}
