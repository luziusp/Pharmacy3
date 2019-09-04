package pharmacy.tests;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import com.helmedica.common.types.Uuid;
import com.helmedica.runtime.runner.Runner;
import com.helmedica.testing.TestContext;
import com.helmedica.testing.annotations.Step;

import pharmacy.types.Doctor;
import pharmacy.types.DoctorId;
import pharmacy.types.Patients;
import pharmacy.types.PatientsId;


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
    	
    	Patients.repository.fetch().forEach(entry -> {
        	Patients.repository.delete(entry);	
             	
        });
    	
    	Doctor.repository.fetch().forEach(entry -> {
        	Doctor.repository.delete(entry);	
             	
        });

    }


    //===========================================================================================
    //==== Steps
    //===========================================================================================

    @Step
    public void step1(TestContext context) throws Exception {
    	var patId1 = new PatientsId(Uuid.randomUuid());
    	var docId1 = new DoctorId(Uuid.randomUuid());
    	LocalDate localDate2 = LocalDate.of(2017, Month.MAY, 14);
    	
    	var doc1 = new Doctor();
    	doc1.setName("n");
    	doc1.setFirstName("fn");
    	doc1.setEan("ean");
    	doc1.setEntryId(docId1);
    	doc1.setLogin("login");
    	doc1.setPassword("pw");
    	doc1.addToIsPatientIds(new PatientsId(patId1));
    	
    	Runner.current().getStdout().println("********Created Doctor*********");
    	Runner.current().getStdout().println(doc1.toPrettyXmlString());
    	
    	
    	
    	var pat1 = new Patients();
    	pat1.setName("PatName");
    	pat1.setFirstName("PatFn");
    	pat1.setEntryId(patId1);
    	pat1.setDateOfBirth(localDate2);
    	pat1.setIsDoctor(doc1);
    	
    	Runner.current().getStdout().println("********Created Doctor*********");
    	Runner.current().getStdout().println(pat1.toPrettyXmlString());
    	
    	Doctor.repository.store(doc1);
    	Patients.repository.store(pat1);
    }
    
    @Step
    public void step2(TestContext context) throws Exception {
    var	docfetched = Doctor.repository.fetch();
    	Runner.current().getStdout().println("********Fetched Doctor*********");
    	Runner.current().getStdout().println(docfetched);
    	
    }
    
    @Step
    public void step3(TestContext context) throws Exception {
    	
    	Doctor.repository.fetch().forEach(entry -> {
        	ArrayList<Patients> pat = (ArrayList<Patients>) entry.getIsPatient();
        	pat.forEach((n) -> Runner.current().getStdout().println(n.toPrettyXmlString())); 
             	
        });
    	
    }

}
