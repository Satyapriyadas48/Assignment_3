package com.example.demo.domain;

public class Store {
	private String storeId;
	private String storeName;
	private String addressLine_1;
	private String addressLine_2;
	private String state;
	private String country;
	private int pinCode;
	private Long Phone;
	private String email;
	
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getAddressLine_1() {
		return addressLine_1;
	}
	public void setAddressLine_1(String addressLine_1) {
		this.addressLine_1 = addressLine_1;
	}
	public String getAddressLine_2() {
		return addressLine_2;
	}
	public void setAddressLine_2(String addressLine_2) {
		this.addressLine_2 = addressLine_2;
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
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public Long getPhone() {
		return Phone;
	}
	public void setPhone(Long phone) {
		Phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", storeName=" + storeName + ", addressLine_1=" + addressLine_1
				+ ", addressLine_2=" + addressLine_2 + ", state=" + state + ", country=" + country + ", pinCode="
				+ pinCode + ", Phone=" + Phone + ", email=" + email + "]";
	}
	
	


}
