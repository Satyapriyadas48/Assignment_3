package com.store.entity;

public class Store {
	private String storeId;
	private String storeName;
	private AddressLane addressLine_1;
	private AddressLane addressLine_2;
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
	public AddressLane getAddressLine_1() {
		return addressLine_1;
	}
	public void setAddressLine_1(AddressLane addressLine_1) {
		this.addressLine_1 = addressLine_1;
	}
	public AddressLane getAddressLine_2() {
		return addressLine_2;
	}
	public void setAddressLine_2(AddressLane addressLine_2) {
		this.addressLine_2 = addressLine_2;
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
				+ ", addressLine_2=" + addressLine_2 + ", pinCode=" + pinCode + ", Phone=" + Phone + ", email=" + email
				+ "]";
	}
	
	
	

}
