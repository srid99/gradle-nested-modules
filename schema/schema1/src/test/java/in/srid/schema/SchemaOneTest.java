package in.srid.schema;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchemaOneTest {
    @Test
    public void name() {
        assertThat(SchemaOne.name(), is("SchemaOne"));
    }
}
