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
import java.time.LocalDate;
import java.util.List;
import pharmacy.repositories.PatientsRepository;
import pharmacy.types.Doctor;
import pharmacy.types.DoctorId;
import pharmacy.types.PatientMedication;
import pharmacy.types.PatientMedicationId;
import pharmacy.types.PatientsId;

@Generated(by="rocketdb", comment="DO NOT EDIT THIS GENERATED CODE")
public abstract class Patients implements RepositoryObject {

    // ===========================================================================================
    // ==== Factory
    // ===========================================================================================

    public static ObjectFactory<pharmacy.types.Patients> factory = null;

    // ===========================================================================================
    // ==== Static members
    // ===========================================================================================

    public static final ClassId __typeId = ClassId.fromString("clas-bb590718-bd24-11e9-9db0-73896884cedf");
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

    public PatientsId getId() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public boolean has__id() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    protected void setId(PatientsId id) {
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

    public String getFirstName() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setFirstName(String firstName) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public String getName() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setName(String name) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public LocalDate getDateOfBirth() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public LocalDate getDateOfDeath() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setDateOfDeath(LocalDate dateOfDeath) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public Doctor getIsDoctor() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setIsDoctor(Doctor isDoctor) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public DoctorId getIsDoctorId() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setIsDoctorId(DoctorId isDoctorId) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public List<? extends PatientMedication> getIsPrescribed() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setIsPrescribed(List<? extends PatientMedication> objects) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void addToIsPrescribed(PatientMedication object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void addToIsPrescribed(int index, PatientMedication object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void removeFromIsPrescribed(PatientMedication object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public List<PatientMedicationId> getIsPrescribedIds() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setIsPrescribedIds(List<? extends PatientMedicationId> objects) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void addToIsPrescribedIds(PatientMedicationId object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void addToIsPrescribedIds(int index, PatientMedicationId object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void removeFromIsPrescribedIds(PatientMedicationId object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void clearIsPrescribedIds() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Cloning
    // ===========================================================================================

    public pharmacy.types.Patients clone() {
        return clone(false);
    }

    @SuppressWarnings("unchecked")
    public final <T extends com.helmedica.meta.interfaces.Object> T duplicate() {
        return (T)clone(true);
    }

    public pharmacy.types.Patients clone(boolean asDuplicate) {
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

    public static final PatientsRepository<PatientsId, pharmacy.types.Patients> repository;
    static {
        repository = null;
    }

    @Override
    public PatientsRepository<? extends PatientsId, ? extends pharmacy.types.Patients> get__repository() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public PatientsRepository<? extends PatientsId, ? extends pharmacy.types.Patients> get__objectRepository() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public PatientsId get__id() {
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
