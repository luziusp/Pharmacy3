package pharmacy.types.base;

import com.helmedica.administration.user.types.User;
import com.helmedica.administration.user.types.UserId;
import com.helmedica.common.annotations.Generated;
import com.helmedica.common.types.Uuid;
import com.helmedica.database.data.types.Operation;
import com.helmedica.database.data.types.State;
import com.helmedica.database.events.DeleteEvent;
import com.helmedica.database.events.StoreEvent;
import com.helmedica.database.interfaces.RepositoryObject;
import com.helmedica.domain.types.Domain;
import com.helmedica.domain.types.DomainId;
import com.helmedica.meta.exceptions.ValidationException;
import com.helmedica.meta.factories.ObjectFactory;
import com.helmedica.meta.interfaces.Id;
import com.helmedica.meta.types.Class;
import com.helmedica.meta.types.ClassId;
import java.math.BigInteger;
import java.time.LocalDate;
import pharmacy.repositories.PatientMedicationRepository;
import pharmacy.types.BaseMedication;
import pharmacy.types.BaseMedicationId;
import pharmacy.types.PatientMedicationId;
import pharmacy.types.Patients;
import pharmacy.types.PatientsId;

@Generated(by="rocketdb", comment="DO NOT EDIT THIS GENERATED CODE")
public abstract class PatientMedication implements RepositoryObject {

    // ===========================================================================================
    // ==== Factory
    // ===========================================================================================

    public static ObjectFactory<pharmacy.types.PatientMedication> factory = null;

    // ===========================================================================================
    // ==== Static members
    // ===========================================================================================

    public static final ClassId __typeId = ClassId.fromString("clas-bb5905eb-bd24-11e9-8f90-015bf591da26");
    public static final short __typeVersion = 2;

    // ===========================================================================================
    // ==== System properties
    // ===========================================================================================

    public static Class  __type() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Properties
    // ===========================================================================================

    public PatientMedicationId getId() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public boolean has__id() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    protected void setId(PatientMedicationId id) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setId(Uuid id) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setId(String id) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public Domain get__domain() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public DomainId get__domainId() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public User get__owner() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public UserId get__ownerId() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public User get__creator() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public UserId get__creatorId() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public State get__state() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public Operation get__operation() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public long get__tts() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public int get__sequence() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public long get__ttsTo() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public LocalDate getPrescriptionDate() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPrescriptionDate(LocalDate prescriptionDate) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public LocalDate getPrescriptionEnd() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPrescriptionEnd(LocalDate prescriptionEnd) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public BigInteger getPosologyMorning() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPosologyMorning(BigInteger posologyMorning) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public BigInteger getPosologyMidday() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPosologyMidday(BigInteger posologyMidday) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public BigInteger getPosologyEvening() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPosologyEvening(BigInteger posologyEvening) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public BigInteger getPosologyNight() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPosologyNight(BigInteger posologyNight) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public Patients getIsPrescribedTo() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setIsPrescribedTo(Patients isPrescribedTo) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public PatientsId getIsPrescribedToId() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setIsPrescribedToId(PatientsId isPrescribedToId) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public BaseMedication getIsBasedOn() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setIsBasedOn(BaseMedication isBasedOn) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public BaseMedicationId getIsBasedOnId() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setIsBasedOnId(BaseMedicationId isBasedOnId) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Cloning
    // ===========================================================================================

    public pharmacy.types.PatientMedication clone() {
        return clone(false);
    }

    @SuppressWarnings("unchecked")
    public final <T extends com.helmedica.meta.interfaces.Object> T duplicate() {
        return (T)clone(true);
    }

    public pharmacy.types.PatientMedication clone(boolean asDuplicate) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Validate
    // ===========================================================================================

    public final void validate() throws ValidationException {
    }

    // ===========================================================================================
    // ==== RepositoryObject
    // ===========================================================================================

    public static final PatientMedicationRepository<PatientMedicationId, pharmacy.types.PatientMedication> repository;
    static {
        repository = null;
    }

    @Override
    public PatientMedicationRepository<? extends PatientMedicationId, ? extends pharmacy.types.PatientMedication> get__repository() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public PatientMedicationRepository<? extends PatientMedicationId, ? extends pharmacy.types.PatientMedication> get__objectRepository() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public PatientMedicationId get__id() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public void set__id(String id) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public final boolean is__head(long tts) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public final boolean is__head() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Triggers
    // ===========================================================================================

    protected void afterRead() throws Exception {
    }

    protected void beforeStore(StoreEvent<? extends Id, ? extends RepositoryObject> event) throws Exception {
    }

    protected void beforeDelete(DeleteEvent<? extends Id, ? extends RepositoryObject> event) throws Exception {
    }

    // ===========================================================================================
    // ==== Clear
    // ===========================================================================================

}
