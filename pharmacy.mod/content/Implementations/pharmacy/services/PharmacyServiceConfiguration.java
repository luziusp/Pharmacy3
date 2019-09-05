package pharmacy.services;

import pharmacy.types.theservice.BaseMedication;
import pharmacy.types.theservice.Doctor;
import pharmacy.types.theservice.Patient;
import pharmacy.types.theservice.PatientMedication;

public class PharmacyServiceConfiguration implements pharmacy.services.base.PharmacyServiceConfiguration {

    @Override
    public Doctor getDoctor(String doctorID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Method [getDoctor] not implemented");
    }

    @Override
    public Patient getPatient(String patientId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Method [getPatient] not implemented");
    }

    @Override
    public PatientMedication getPatientMedication(String patientMedicationId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Method [getPatientMedication] not implemented");
    }

    @Override
    public BaseMedication getBaseMedication(String baseMedicationId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Method [getBaseMedication] not implemented");
    }

}