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
import java.util.List;
import pharmacy.repositories.DoctorRepository;
import pharmacy.types.DoctorId;
import pharmacy.types.Patients;
import pharmacy.types.PatientsId;

@Generated(by="rocketdb", comment="DO NOT EDIT THIS GENERATED CODE")
public abstract class Doctor implements RepositoryObject {

    // ===========================================================================================
    // ==== Factory
    // ===========================================================================================

    public static ObjectFactory<pharmacy.types.Doctor> factory = null;

    // ===========================================================================================
    // ==== Static members
    // ===========================================================================================

    public static final ClassId __typeId = ClassId.fromString("clas-bb59047c-bd24-11e9-a1b9-c50df70b004f");
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

    public DoctorId getId() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public boolean has__id() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    protected void setId(DoctorId id) {
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

    public String getName() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setName(String name) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public String getFirstName() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setFirstName(String firstName) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public String getEan() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setEan(String ean) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public String getLogin() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setLogin(String login) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public String getPassword() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPassword(String password) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public List<? extends Patients> getIsPatient() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setIsPatient(List<? extends Patients> objects) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void addToIsPatient(Patients object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void addToIsPatient(int index, Patients object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void removeFromIsPatient(Patients object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public List<PatientsId> getIsPatientIds() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setIsPatientIds(List<? extends PatientsId> objects) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void addToIsPatientIds(PatientsId object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void addToIsPatientIds(int index, PatientsId object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void removeFromIsPatientIds(PatientsId object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void clearIsPatientIds() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Cloning
    // ===========================================================================================

    public pharmacy.types.Doctor clone() {
        return clone(false);
    }

    @SuppressWarnings("unchecked")
    public final <T extends com.helmedica.meta.interfaces.Object> T duplicate() {
        return (T)clone(true);
    }

    public pharmacy.types.Doctor clone(boolean asDuplicate) {
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

    public static final DoctorRepository<DoctorId, pharmacy.types.Doctor> repository;
    static {
        repository = null;
    }

    @Override
    public DoctorRepository<? extends DoctorId, ? extends pharmacy.types.Doctor> get__repository() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public DoctorRepository<? extends DoctorId, ? extends pharmacy.types.Doctor> get__objectRepository() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public DoctorId get__id() {
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
