package in.srid;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ApplicationTwoTest {
    @Test
    public void run() {
        PrintStream actualPrintStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        try {
            ApplicationTwo.main(new String[]{});
        } finally {
            System.setOut(actualPrintStream);
        }

        assertThat(outputStream.toString(), is("ApplicationTwo is using SchemaTwo\n"));
    }
}
