package in.srid;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ApplicationOneTest {
    @Test
    public void run() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        ApplicationOne.main(new String[]{});

        assertThat(baos.toString(), is("ApplicationOne is using SchemaOne\n"));
    }
}
