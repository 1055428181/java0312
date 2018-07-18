package com.offcn.bean;

public class Mobile {

	private int id;
	private int mobileNumber;
	private String mobileArea;
	private String mobileType;
	private int areaCode;
	private int postCode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getMobileArea() {
		return mobileArea;
	}
	public void setMobileArea(String mobileArea) {
		this.mobileArea = mobileArea;
	}
	public String getMobileType() {
		return mobileType;
	}
	public void setMobileType(String mobileType) {
		this.mobileType = mobileType;
	}
	public int getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}
	public int getPostCode() {
		return postCode;
	}
	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", mobileNumber=" + mobileNumber + ", mobileArea=" + mobileArea + ", mobileType="
				+ mobileType + ", areaCode=" + areaCode + ", postCode=" + postCode + "]";
	}
	public Mobile(int id, int mobileNumber, String mobileArea, String mobileType, int areaCode, int postCode) {
		super();
		this.id = id;
		this.mobileNumber = mobileNumber;
		this.mobileArea = mobileArea;
		this.mobileType = mobileType;
		this.areaCode = areaCode;
		this.postCode = postCode;
	}
	public Mobile() {
		super();
	}
	
	
}
