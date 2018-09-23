package in.srid.core;

import in.srid.schema.SchemaOne;
import in.srid.schema.SchemaTwo;

public class Shared {
    public static String schema(int type) {
        switch (type) {
            case 1:
                return SchemaOne.name();
            case 2:
                return SchemaTwo.name();
            default:
                throw new IllegalStateException("Unknown schema: " + type);
        }
    }
}
