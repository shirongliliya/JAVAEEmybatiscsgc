package com.cn.po;

public class Catas {
	private int cata_id;
	private String cata_name;
	private String cata_des;
	private double cata_price;
	private String cata_publish;
	public int getCata_id() {
		return cata_id;
	}
	public void setCata_id(int cata_id) {
		this.cata_id = cata_id;
	}
	public String getCata_name() {
		return cata_name;
	}
	public void setCata_name(String cata_name) {
		this.cata_name = cata_name;
	}
	public String getCata_des() {
		return cata_des;
	}
	public void setCata_des(String cata_des) {
		this.cata_des = cata_des;
	}
	public double getCata_price() {
		return cata_price;
	}
	public void setCata_price(double cata_price) {
		this.cata_price = cata_price;
	}
	public String getCata_publish() {
		return cata_publish;
	}
	public void setCata_publish(String cata_publish) {
		this.cata_publish = cata_publish;
	}
	@Override
	public String toString() {
		return "Books [cata_id=" + cata_id + ", cata_name=" + cata_name + ", cata_des=" + cata_des + ", cata_price="
				+ cata_price + ", cata_publish=" + cata_publish + "]";
	}
	

}
