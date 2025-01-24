package com.singleinheritance.smarthomedevices;

// Defining the superclass Device
public class Device
{
	// Declaring the unique device ID
	protected String deviceId;

	// Declaring the status of the device (ON/OFF)
	protected boolean status;

	// Constructor to initialize Device object
	public Device(String deviceId, boolean status)
	{
		// Initializing values to instance variables
		this.deviceId = deviceId;
		this.status = status;
	}

	// Method to display device details
	public void displayStatus()
	{
		System.out.println("Device ID: " + deviceId);
		System.out.println("Status: " + (status ? "ON" : "OFF"));
	}
}