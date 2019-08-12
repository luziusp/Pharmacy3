package pharmacy.repositories;

import pharmacy.types.PatientMedicationId;

public class PatientMedicationRepository<ID extends PatientMedicationId, T extends pharmacy.types.PatientMedication> extends pharmacy.repositories.base.PatientMedicationRepository<ID, T> {
}
