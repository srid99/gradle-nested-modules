package in.srid.core;

import org.junit.Test;

public class SharedTest {
    @Test(expected = IllegalStateException.class)
    public void unknownSchemaType() {
        Shared.schema(0);
    }
}
