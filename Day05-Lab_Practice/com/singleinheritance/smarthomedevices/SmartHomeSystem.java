package com.singleinheritance.smarthomedevices;

// SmartHomeSystem class to demonstrate Single Inheritance
public class SmartHomeSystem
{
	public static void main(String[] args)
	{
		// Creating a Thermostat object with device details
		Thermostat smartThermostat = new Thermostat("TH123", true, 24);

		// Displaying the details of the thermostat
		smartThermostat.displayStatus();
	}
}
