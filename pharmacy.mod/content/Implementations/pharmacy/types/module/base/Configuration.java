package pharmacy.types.module.base;

import com.helmedica.common.annotations.Generated;
import com.helmedica.common.types.Uuid;
import com.helmedica.meta.factories.ObjectFactory;
import com.helmedica.meta.types.Class;
import com.helmedica.meta.types.ClassId;
import com.helmedica.module.repositories.ConfigurationRepository;
import com.helmedica.module.types.ConfigurationId;

@Generated(by="rocketdb", comment="DO NOT EDIT THIS GENERATED CODE")
public abstract class Configuration extends com.helmedica.module.types.Configuration {

    // ===========================================================================================
    // ==== Factory
    // ===========================================================================================

    public static ObjectFactory<pharmacy.types.module.Configuration> factory = null;

    // ===========================================================================================
    // ==== Static members
    // ===========================================================================================

    public static final ClassId __typeId = ClassId.fromString("clas-0c311484-bd18-11e9-a1b9-c50df70b004f");
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

    public ConfigurationId get__id() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void set__id(Uuid __id) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void set__id(String __id) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Cloning
    // ===========================================================================================

    public final pharmacy.types.module.Configuration clone() {
        return clone(false);
    }

    public pharmacy.types.module.Configuration clone(boolean asDuplicate) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== RepositoryObject
    // ===========================================================================================

    public static final ConfigurationRepository<pharmacy.types.module.Configuration> repository;
    static {
        repository = null;
    }

    @Override
    public ConfigurationRepository<? extends pharmacy.types.module.Configuration> get__repository() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public ConfigurationRepository<? extends pharmacy.types.module.Configuration> get__objectRepository() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    // ===========================================================================================
    // ==== Clear
    // ===========================================================================================

}
