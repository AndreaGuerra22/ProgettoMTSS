package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {

   @Test
    public void testPrintOne() {
        // Arrange
        int num = 1;
        String exp = " _____  \n|_   _| \n  | |   \n  | |   \n _| |_  \n|_____| \n";
        // Act
        String res = RomanPrinter.print(num);
        // Assert
        assertEquals(exp, res);
    }

    @Test
    public void testPrintFour() {
        // Arrange
        int num = 4;
        String exp = " _____  __    __\n|_   _| \\ \\  / /\n  | |    \\ \\/ / \n" +
                     "  | |     \\  /  \n _| |_     \\/   \n|_____|         \n";
        // Act
        String res = RomanPrinter.print(num);
        // Assert
        assertEquals(exp, res);
    }

    @Test
    public void testPrintNine() {
        // Arrange
        int num = 9;
        String exp = " _____  __    __\n|_   _| \\ \\  / /\n  | |    \\ \\/ / \n" +
                     "  | |    / /\\ \\ \n _| |_  / /  \\ \\\n|_____| \\/    \\/\n";
        // Act
        String res = RomanPrinter.print(num);
        // Assert
        assertEquals(exp, res);
    }

    @Test
    public void testPrintTen() {
        // Arrange
        int num = 10;
        String exp = "__    __\n\\ \\  / /\n \\ \\/ / \n / /\\ \\ \n/ /  \\ \\\n\\/    \\/\n";
        // Act
        String res = RomanPrinter.print(num);
        // Assert
        assertEquals(exp, res);
    }
}
