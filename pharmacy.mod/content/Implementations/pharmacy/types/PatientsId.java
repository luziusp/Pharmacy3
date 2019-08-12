package pharmacy.types;

import com.helmedica.common.annotations.Generated;
import com.helmedica.common.types.Uuid;
import com.helmedica.meta.factories.WrappedTypeFactory;
import com.helmedica.meta.interfaces.Id;
import com.helmedica.meta.types.IdType;
import com.helmedica.meta.types.IdTypeId;

@Generated(by="rocketdb", comment="DO NOT EDIT THIS GENERATED CODE")
public class PatientsId extends Uuid implements Id {

    // ===========================================================================================
    // ==== Static members
    // ===========================================================================================

    public static final IdTypeId __typeId = IdTypeId.fromString("idty-bb5dd74f-bd24-11e9-bda7-edb27ea10108");
    public static final int __typeVersion = 1;
    public static final WrappedTypeFactory<pharmacy.types.PatientsId> factory = null;

    // ===========================================================================================
    // ==== From value
    // ===========================================================================================

    public static pharmacy.types.PatientsId fromUuid(Uuid value) {
        throw new UnsupportedOperationException("Static method [fromUuid()] not implemented");
    }

    public static pharmacy.types.PatientsId fromString(String value) {
        throw new UnsupportedOperationException("Static method [fromString()] not implemented");
    }

    // ===========================================================================================
    // ==== Constructor
    // ===========================================================================================

    public PatientsId(Uuid value) {
        super((String)null);
    }

    public PatientsId(String value) {
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
