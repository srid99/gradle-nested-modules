package in.srid.schema;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchemaTwoTest {
    @Test
    public void name() {
        assertThat(SchemaTwo.name(), is("SchemaTwo"));
    }
}
