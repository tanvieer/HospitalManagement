package com.spring.tanvir.HospitalManagement;

import java.util.List;

public class Patient {
	private int id;
	private String name;
	private List<String> emergencyContactNames;

	public Patient() {

	}

	public Patient(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void Speak() {
		System.out.println("Help me!!");
	}
	
	
	
	public void onCreate(){
		System.out.println("Patient Created: "+ this);
	}
	public void onDestroy(){
		System.out.println("Patient destroyed");
	}
}
