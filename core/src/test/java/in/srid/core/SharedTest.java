package in.srid.core;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SharedTest {
    @Test
    public void shared() {
        assertThat(Shared.schema(1), is("SchemaOne"));
        assertThat(Shared.schema(2), is("SchemaTwo"));
    }
}
