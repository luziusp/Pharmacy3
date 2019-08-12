package pharmacy.repositories;

import pharmacy.types.BaseMedicationId;

public class BaseMedicationRepository<ID extends BaseMedicationId, T extends pharmacy.types.BaseMedication> extends pharmacy.repositories.base.BaseMedicationRepository<ID, T> {
}
