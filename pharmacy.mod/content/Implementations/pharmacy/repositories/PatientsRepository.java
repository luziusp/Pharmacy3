package pharmacy.repositories;

import pharmacy.types.PatientsId;

public class PatientsRepository<ID extends PatientsId, T extends pharmacy.types.Patients> extends pharmacy.repositories.base.PatientsRepository<ID, T> {
}
