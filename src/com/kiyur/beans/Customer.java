package com.kiyur.beans;

import java.io.Serializable;

public class Customer implements Serializable {
String name;
long phone_No;
String address;
String id;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getPhone_No() {
	return phone_No;
}
public void setPhone_No(long phone_No) {
	this.phone_No = phone_No;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getId() {
	return id;
}
public Customer(String name, long phone_No, String address, String id) {
	super();
	this.name = name;
	this.phone_No = phone_No;
	this.address = address;
	this.id = id;
}
public void setId(String id) {
	this.id = id;
}
@Override
public String toString() {
	return "Customer [name=" + name + ", phone_No=" + phone_No + ", address=" + address + ", id=" + id + "]";
}

}
