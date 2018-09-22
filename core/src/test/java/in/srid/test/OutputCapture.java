package in.srid.test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class OutputCapture {
    public static String runAndCapture(Runnable runnable) {
        PrintStream actualOutputStream = System.out;
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        try {
            runnable.run();
        } finally {
            System.setOut(actualOutputStream);
        }

        return outputStreamCaptor.toString();
    }
}
