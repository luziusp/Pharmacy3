package pharmacy.types.theservice.base;

import com.helmedica.common.annotations.Generated;
import com.helmedica.meta.exceptions.ValidationException;
import com.helmedica.meta.factories.ObjectFactory;
import com.helmedica.meta.interfaces.Object;
import com.helmedica.meta.types.Class;
import com.helmedica.meta.types.ClassId;

@Generated(by="rocketdb", comment="DO NOT EDIT THIS GENERATED CODE")
public abstract class Patient implements Object {

    // ===========================================================================================
    // ==== Factory
    // ===========================================================================================

    public static ObjectFactory<pharmacy.types.theservice.Patient> factory = null;

    // ===========================================================================================
    // ==== Static members
    // ===========================================================================================

    public static final ClassId __typeId = ClassId.fromString("clas-596754ce-ceee-11e9-8d98-375ff2096c95");
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

    public String getPatientId() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPatientId(String patientId) {
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

    public String getDateOfBirth() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setDateOfBirth(String dateOfBirth) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public String getDateOfDeath() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setDateOfDeath(String dateOfDeath) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Cloning
    // ===========================================================================================

    public pharmacy.types.theservice.Patient clone() {
        return clone(false);
    }

    @SuppressWarnings("unchecked")
    public final <T extends com.helmedica.meta.interfaces.Object> T duplicate() {
        return (T)clone(true);
    }

    public pharmacy.types.theservice.Patient clone(boolean asDuplicate) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Validate
    // ===========================================================================================

    public final void validate() throws ValidationException {
    }

}
