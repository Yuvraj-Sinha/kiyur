package com.kiyur.beans;

public enum Product {
  kiyur_kidney_health(200),kiyur_faceCream(300),kiyur_facewash(200),kiyur_vutamintablet(250),kiyur_liverhealth(150),kiyur_juice(233);
	private int num;
	Product(int num){
		this.num=num;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num=num;
	}
}
