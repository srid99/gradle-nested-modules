package in.srid;

import in.srid.test.OutputCapture;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ApplicationTwoTest {
    @Test
    public void run() {
        String output = OutputCapture.runAndCapture(
                () -> ApplicationTwo.main(new String[]{})
        );

        assertThat(output, is("ApplicationTwo is using SchemaTwo\n"));
    }
}
