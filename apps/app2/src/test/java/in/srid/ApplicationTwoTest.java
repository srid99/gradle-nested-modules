package in.srid;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ApplicationTwoTest {
    @Test
    public void run() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        ApplicationTwo.main(new String[]{});

        assertThat(baos.toString(), is("ApplicationTwo is using SchemaTwo\n"));
    }
}
