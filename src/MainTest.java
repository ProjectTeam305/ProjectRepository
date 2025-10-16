import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        // Simulate user input: choosing option 5 (Exit)
        String simulatedInput = "5\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        // Capture system output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Run the main method
        Main.main(new String[]{});

        // Restore original output stream
        System.setOut(originalOut);

        // Convert output to string and check expected output
        String output = outputStream.toString();

        assertTrue(output.contains("===== Library Management System ====="));
        assertTrue(output.contains("Exiting... Goodbye!"));
    }
}



