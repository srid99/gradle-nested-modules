package in.srid;

import in.srid.test.OutputCapture;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ApplicationOneTest {
    @Test
    public void run() {
        String output = OutputCapture.runAndCapture(
                () -> ApplicationOne.main(new String[]{})
        );

        assertThat(output, is("ApplicationOne is using SchemaOne\n"));
    }
}
