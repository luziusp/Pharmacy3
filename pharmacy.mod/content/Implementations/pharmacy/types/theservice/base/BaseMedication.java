package pharmacy.types.theservice.base;

import com.helmedica.common.annotations.Generated;
import com.helmedica.meta.exceptions.ValidationException;
import com.helmedica.meta.factories.ObjectFactory;
import com.helmedica.meta.interfaces.Object;
import com.helmedica.meta.types.Class;
import com.helmedica.meta.types.ClassId;

@Generated(by="rocketdb", comment="DO NOT EDIT THIS GENERATED CODE")
public abstract class BaseMedication implements Object {

    // ===========================================================================================
    // ==== Factory
    // ===========================================================================================

    public static ObjectFactory<pharmacy.types.theservice.BaseMedication> factory = null;

    // ===========================================================================================
    // ==== Static members
    // ===========================================================================================

    public static final ClassId __typeId = ClassId.fromString("clas-59671597-ceee-11e9-9a9a-570f31cd399e");
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

    public String getBaseMedicationId() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setBaseMedicationId(String baseMedicationId) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public String getName() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setName(String name) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public String getPharmacode() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPharmacode(String pharmacode) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public String getProce() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setProce(String proce) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public String getEan() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setEan(String ean) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public String getLastUpdate() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setLastUpdate(String lastUpdate) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public String getIsActive() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setIsActive(String isActive) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Cloning
    // ===========================================================================================

    public pharmacy.types.theservice.BaseMedication clone() {
        return clone(false);
    }

    @SuppressWarnings("unchecked")
    public final <T extends com.helmedica.meta.interfaces.Object> T duplicate() {
        return (T)clone(true);
    }

    public pharmacy.types.theservice.BaseMedication clone(boolean asDuplicate) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Validate
    // ===========================================================================================

    public final void validate() throws ValidationException {
    }

}
