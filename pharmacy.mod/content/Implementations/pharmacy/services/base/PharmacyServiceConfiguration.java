package pharmacy.services.base;

import com.helmedica.common.annotations.Generated;
import com.helmedica.services.web.soap.SoapAuthenticationAction;
import com.helmedica.services.web.soap.SoapHandler;
import pharmacy.types.theservice.BaseMedication;
import pharmacy.types.theservice.Doctor;
import pharmacy.types.theservice.Patient;
import pharmacy.types.theservice.PatientMedication;

@Generated(by="rocketdb", comment="DO NOT EDIT THIS GENERATED CODE")
public interface PharmacyServiceConfiguration extends SoapHandler, SoapAuthenticationAction {

    public Doctor getDoctor(String doctorID);

    public Patient getPatient(String patientId);

    public PatientMedication getPatientMedication(String patientMedicationId);

    public BaseMedication getBaseMedication(String baseMedicationId);

}