package pharmacy.types.theservice.base;

import com.helmedica.common.annotations.Generated;
import com.helmedica.meta.exceptions.ValidationException;
import com.helmedica.meta.factories.ObjectFactory;
import com.helmedica.meta.interfaces.Object;
import com.helmedica.meta.types.Class;
import com.helmedica.meta.types.ClassId;

@Generated(by="rocketdb", comment="DO NOT EDIT THIS GENERATED CODE")
public abstract class PatientMedication implements Object {

    // ===========================================================================================
    // ==== Factory
    // ===========================================================================================

    public static ObjectFactory<pharmacy.types.theservice.PatientMedication> factory = null;

    // ===========================================================================================
    // ==== Static members
    // ===========================================================================================

    public static final ClassId __typeId = ClassId.fromString("clas-596772a9-ceee-11e9-9a9a-570f31cd399e");
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

    public String getPatientMedicationId() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPatientMedicationId(String patientMedicationId) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public String getBaseMedication() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setBaseMedication(String baseMedication) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public String getPrescriptionDate() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPrescriptionDate(String prescriptionDate) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public String getPrescriptionEnd() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPrescriptionEnd(String prescriptionEnd) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public String getPosologyMorning() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPosologyMorning(String posologyMorning) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public String getPosologyMidday() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void setPosologyMidday(String posologyMidday) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Cloning
    // ===========================================================================================

    public pharmacy.types.theservice.PatientMedication clone() {
        return clone(false);
    }

    @SuppressWarnings("unchecked")
    public final <T extends com.helmedica.meta.interfaces.Object> T duplicate() {
        return (T)clone(true);
    }

    public pharmacy.types.theservice.PatientMedication clone(boolean asDuplicate) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Validate
    // ===========================================================================================

    public final void validate() throws ValidationException {
    }

}
