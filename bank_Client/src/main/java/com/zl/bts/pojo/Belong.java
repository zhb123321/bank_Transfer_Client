package com.zl.bts.pojo;




public class Belong {
	private	String area;//地区，注意不是所有卡都能返回area字段。
	private	String tel;//银行客服
	private	String brand;//银行卡产品名称
	private	String bankName;//银行名称
	private	String cardType;//银行卡种
	private	String url;//银行官网
	private	String cardNum;
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	@Override
	public String toString() {
		return "Belong [area=" + area + ", tel=" + tel + ", brand=" + brand + ", bankName=" + bankName + ", cardType="
				+ cardType + ", url=" + url + ", cardNum=" + cardNum + "]";
	}
	
}
