package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {

    @Test
    public void testPrintOne() {
        // Arrange
        int number = 1;
        String expected = 
            " _____  \n" +
            "|_   _| \n" +
            "  | |   \n" +
            "  | |   \n" +
            " _| |_  \n" +
            "|_____| \n";

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testPrintThree() {
        // Arrange
        int number = 3;
        String expected = 
            " _____   _____   _____  \n" +
            "|_   _| |_   _| |_   _| \n" +
            "  | |     | |     | |   \n" +
            "  | |     | |     | |   \n" +
            " _| |_   _| |_   _| |_  \n" +
            "|_____| |_____| |_____| \n";

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        assertEquals(expected, result);
    }
}
