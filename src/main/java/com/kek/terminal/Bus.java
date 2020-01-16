package com.kek.terminal;

public class Bus {

	public Bustype bustype;
	public Capacity capacity;
	public Comforttype comforttype;

Bus(){
	bustype = new Bustype();
	capacity = new Capacity();
	comforttype = new Comforttype();
	
}

public void getbustype(){
	return bustype();}
	
public void getcapacity(){
	return capacity();}
	
public void getcomforttype(){
	return comforttype();}

}

