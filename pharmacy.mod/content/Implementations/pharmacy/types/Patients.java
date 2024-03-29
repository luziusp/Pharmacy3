package pharmacy.types;

import java.time.LocalDate;

import com.helmedica.common.types.Uuid;

public class Patients extends pharmacy.types.base.Patients {

    // ===========================================================================================
    // ==== Static members
    // ===========================================================================================

    // ===========================================================================================
    // ==== Members
    // ===========================================================================================

    // ===========================================================================================
    // ==== Constructors
    // ===========================================================================================
	public Patients() {}
	
	public Patients(String name, String firstName, LocalDate dob, Doctor doc){
		
		this.setName("PatName");
		this.setFirstName("PatFn");
		this.setDateOfBirth(dob);
		this.setIsDoctor(doc);
		this.setEntryId(Uuid.randomUuid());
		
	}
    // ===========================================================================================
    // ==== Properties
    // ===========================================================================================

    // ===========================================================================================
    // ==== Methods
    // ===========================================================================================

}
