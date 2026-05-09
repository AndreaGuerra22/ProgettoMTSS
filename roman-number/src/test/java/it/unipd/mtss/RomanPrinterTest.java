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
    public void testPrintFour() {
        int number = 4;
        String expected = 
            " _____  __    __\n" +
            "|_   _| \\ \\  / /\n" +
            "  | |    \\ \\/ / \n" +
            "  | |     \\  /  \n" +
            " _| |_     \\/   \n" +
            "|_____|         \n";
        assertEquals(expected, RomanPrinter.print(number));
    }

    @Test
    public void testPrintFive() {
        int number = 5;
        String expected = 
            "__    __\n" +
            "\\ \\  / /\n" +
            " \\ \\/ / \n" +
            "  \\  /  \n" +
            "   \\/   \n" +
            "        \n";
        assertEquals(expected, RomanPrinter.print(number));
    }

    @Test
    public void testPrintSix() {
        int number = 6;
        String expected = 
            "__    __ _____  \n" +
            "\\ \\  / /|_   _| \n" +
            " \\ \\/ /   | |   \n" +
            "  \\  /    | |   \n" +
            "   \\/    _| |_  \n" +
            "        |_____| \n";
        assertEquals(expected, RomanPrinter.print(number));
    }
}
