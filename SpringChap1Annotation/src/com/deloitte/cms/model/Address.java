package com.deloitte.cms.model;

public class Address 
{
	private int aId;
	private String city;
	private String State;
	
	public Address() {
	
	}

	public Address(int aId, String city, String state) {
		super();
		this.aId = aId;
		this.city = city;
		State = state;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	@Override
	public String toString() {
		return "Address [aId=" + aId + ", city=" + city + ", State=" + State + ", getaId()=" + getaId() + ", getCity()="
				+ getCity() + ", getState()=" + getState() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
