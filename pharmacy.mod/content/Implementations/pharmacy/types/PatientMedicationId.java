package pharmacy.types;

import com.helmedica.common.annotations.Generated;
import com.helmedica.common.types.Uuid;
import com.helmedica.meta.factories.WrappedTypeFactory;
import com.helmedica.meta.interfaces.Id;
import com.helmedica.meta.types.IdType;
import com.helmedica.meta.types.IdTypeId;

@Generated(by="rocketdb", comment="DO NOT EDIT THIS GENERATED CODE")
public class PatientMedicationId extends Uuid implements Id {

    // ===========================================================================================
    // ==== Static members
    // ===========================================================================================

    public static final IdTypeId __typeId = IdTypeId.fromString("idty-bb5dc3e0-bd24-11e9-b282-277905286f9a");
    public static final int __typeVersion = 1;
    public static final WrappedTypeFactory<pharmacy.types.PatientMedicationId> factory = null;

    // ===========================================================================================
    // ==== From value
    // ===========================================================================================

    public static pharmacy.types.PatientMedicationId fromUuid(Uuid value) {
        throw new UnsupportedOperationException("Static method [fromUuid()] not implemented");
    }

    public static pharmacy.types.PatientMedicationId fromString(String value) {
        throw new UnsupportedOperationException("Static method [fromString()] not implemented");
    }

    // ===========================================================================================
    // ==== Constructor
    // ===========================================================================================

    public PatientMedicationId(Uuid value) {
        super((String)null);
    }

    public PatientMedicationId(String value) {
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
