package in.srid;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ApplicationOneTest {
    @Test
    public void run() {
        PrintStream actualPrintStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        try {
            ApplicationOne.main(new String[]{});
        } finally {
            System.setOut(actualPrintStream);
        }

        assertThat(outputStream.toString(), is("ApplicationOne is using SchemaOne\n"));
    }
}
