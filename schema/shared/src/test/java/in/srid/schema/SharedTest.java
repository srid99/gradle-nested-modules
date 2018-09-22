package in.srid.schema;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SharedTest {
    @Test
    public void name() {
        assertThat(Shared.name(Shared.class), is("Shared"));
    }
}
