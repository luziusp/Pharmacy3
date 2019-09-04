package pharmacy.tests;

import com.helmedica.common.types.Uuid;
import com.helmedica.testing.TestContext;
import com.helmedica.testing.annotations.Step;

import pharmacy.types.Doctor;

import com.helmedica.testing.annotations.Setup;
import com.helmedica.testing.annotations.Cleanup;

public class DoctorTest {

    //===========================================================================================
    //==== Setup
    //===========================================================================================

    @Setup
    public static void setup(TestContext context) throws Exception {
    }


    //===========================================================================================
    //==== Cleanup
    //===========================================================================================

    @Cleanup
    public static void cleanup(TestContext context) throws Exception {
    }


    //===========================================================================================
    //==== Steps
    //===========================================================================================

    @Step
    public void step1(TestContext context) throws Exception {
    	var doc1 = new Doctor();
    	doc1.setName("n");
    	doc1.setFirstName("fn");
    	doc1.setEan("ean");
    	doc1.setEntryId(Uuid.randomUuid());
    	doc1.setLogin("login");
    	doc1.setPassword("pw");
    	
    	
    	Doctor.repository.store(doc1);
    }

}
