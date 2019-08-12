package pharmacy.types.base;

import com.helmedica.administration.user.types.User;
import com.helmedica.administration.user.types.UserId;
import com.helmedica.common.annotations.Generated;
import com.helmedica.common.types.Data;
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
import pharmacy.repositories.BaseMedicationRepository;
import pharmacy.types.BaseMedicationId;
import pharmacy.types.PatientMedication;
import pharmacy.types.PatientMedicationId;

@Generated(by="rocketdb", comment="DO NOT EDIT THIS GENERATED CODE")
public abstract class BaseMedication implements RepositoryObject {

    // ===========================================================================================
    // ==== Factory
    // ===========================================================================================

    public static ObjectFactory<pharmacy.types.BaseMedication> factory = null;

    // ===========================================================================================
    // ==== Static members
    // ===========================================================================================

    public static final ClassId __typeId = ClassId.fromString("clas-bb590284-bd24-11e9-b282-277905286f9a");
    public static final short __typeVersion = 1;

    // ===========================================================================================
    // ==== System properties
    // ===========================================================================================

    public static Class  __type() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Properties
    // ===========================================================================================

    public BaseMedicationId getId() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public boolean has__id() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    protected void setId(BaseMedicationId id) {
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

    public String getPharmacode() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPharmacode(String pharmacode) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public String getName() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setName(String name) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public double getPrice() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPrice(double price) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public String getEan() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setEan(String ean) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public Data getLastUpdate() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setLastUpdate(Data lastUpdate) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public boolean isActive() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setIsActive(boolean isActive) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public List<? extends PatientMedication> getIsBasisOf() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setIsBasisOf(List<? extends PatientMedication> objects) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void addToIsBasisOf(PatientMedication object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void addToIsBasisOf(int index, PatientMedication object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void removeFromIsBasisOf(PatientMedication object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public List<PatientMedicationId> getIsBasisOfIds() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setIsBasisOfIds(List<? extends PatientMedicationId> objects) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void addToIsBasisOfIds(PatientMedicationId object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void addToIsBasisOfIds(int index, PatientMedicationId object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void removeFromIsBasisOfIds(PatientMedicationId object) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void clearIsBasisOfIds() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Cloning
    // ===========================================================================================

    public pharmacy.types.BaseMedication clone() {
        return clone(false);
    }

    @SuppressWarnings("unchecked")
    public final <T extends com.helmedica.meta.interfaces.Object> T duplicate() {
        return (T)clone(true);
    }

    public pharmacy.types.BaseMedication clone(boolean asDuplicate) {
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

    public static final BaseMedicationRepository<BaseMedicationId, pharmacy.types.BaseMedication> repository;
    static {
        repository = null;
    }

    @Override
    public BaseMedicationRepository<? extends BaseMedicationId, ? extends pharmacy.types.BaseMedication> get__repository() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public BaseMedicationRepository<? extends BaseMedicationId, ? extends pharmacy.types.BaseMedication> get__objectRepository() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public BaseMedicationId get__id() {
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
