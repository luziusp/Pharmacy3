package pharmacy.types;

import com.helmedica.common.annotations.Generated;
import com.helmedica.common.types.Uuid;
import com.helmedica.meta.factories.WrappedTypeFactory;
import com.helmedica.meta.interfaces.Id;
import com.helmedica.meta.types.IdType;
import com.helmedica.meta.types.IdTypeId;

@Generated(by="rocketdb", comment="DO NOT EDIT THIS GENERATED CODE")
public class DoctorId extends Uuid implements Id {

    // ===========================================================================================
    // ==== Static members
    // ===========================================================================================

    public static final IdTypeId __typeId = IdTypeId.fromString("idty-bb5dd13a-bd24-11e9-aeab-5783ee9dcdf4");
    public static final int __typeVersion = 1;
    public static final WrappedTypeFactory<pharmacy.types.DoctorId> factory = null;

    // ===========================================================================================
    // ==== From value
    // ===========================================================================================

    public static pharmacy.types.DoctorId fromUuid(Uuid value) {
        throw new UnsupportedOperationException("Static method [fromUuid()] not implemented");
    }

    public static pharmacy.types.DoctorId fromString(String value) {
        throw new UnsupportedOperationException("Static method [fromString()] not implemented");
    }

    // ===========================================================================================
    // ==== Constructor
    // ===========================================================================================

    public DoctorId(Uuid value) {
        super((String)null);
    }

    public DoctorId(String value) {
        super((String)null);
    }

    // ===========================================================================================
    // ==== Properties
    // ===========================================================================================

    public static IdType __type() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== To value
    // ===========================================================================================

    public Uuid toValue() {
        return this;
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Method [toString()] not implemented");
    }

}
