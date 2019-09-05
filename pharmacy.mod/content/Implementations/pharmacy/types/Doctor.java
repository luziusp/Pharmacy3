package pharmacy.types;

import java.util.ArrayList;

import com.helmedica.common.types.Uuid;


public class Doctor extends pharmacy.types.base.Doctor {

    // ===========================================================================================
    // ==== Static members
    // ===========================================================================================

    // ===========================================================================================
    // ==== Members
    // ===========================================================================================

    // ===========================================================================================
    // ==== Constructors
    // ===========================================================================================
	
	public Doctor() {}
	
	public Doctor(String name, String firstName, String ean, String login, String pw, PatientsId patId) {
			
			this.setName(name);
	    	this.setFirstName(firstName);
	    	this.setEan(ean);	    	
	    	this.setLogin(login);
	    	this.setPassword(pw);

	    	this.setEntryId(Uuid.randomUuid());
	       	this.addToIsPatientIds(patId);    	
	       	
		}
    // ===========================================================================================
    // ==== Properties
    // ===========================================================================================

    // ===========================================================================================
    // ==== Methods
    // ===========================================================================================

	
}
