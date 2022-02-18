package com.caresoft.clinicapp;

import java.util.Date;
import java.util.ArrayList;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
//... imports class definition...
    
    // Inside class:
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    
	public AdminUser(String givenRole) {
		super();
		role = givenRole;
		securityIncidents = new ArrayList<String>();
	}
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    // TO DO: Setters & Getters
    
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		return securityIncidents;
	}
	@Override
	public boolean assignPin(int pin) {
		if(Integer.toString(pin).length() >= 6) {
			super.pin = pin;
			return true;
		}
		return false;
	}
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(id != confirmedAuthID) {
			authIncident();
			return false;
		}
		return true;
	}

}
