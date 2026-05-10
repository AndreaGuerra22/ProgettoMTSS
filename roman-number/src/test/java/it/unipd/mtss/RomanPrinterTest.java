package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {

    @Test
    public void testPrintOne() {
        int num = 1;
        String exp = " _____  \n|_   _| \n  | |   \n  | |   \n _| |_  \n|_____| \n";
        assertEquals(exp, RomanPrinter.print(num));
    }
    
   @Test
    public void testPrintFour() {
        int num = 4;
        String exp = " _____  __    __\n|_   _| \\ \\  / /\n  | |    \\ \\/ / \n" +
                     "  | |     \\  /  \n _| |_     \\/   \n|_____|         \n";
        assertEquals(exp, RomanPrinter.print(num));
    }

    @Test
    public void testPrintNine() {
        int num = 9;
        String exp = " _____  __    __\n|_   _| \\ \\  / /\n  | |    \\ \\/ / \n" +
                     "  | |    / /\\ \\ \n _| |_  / /  \\ \\\n|_____| \\/    \\/\n";
        assertEquals(exp, RomanPrinter.print(num));
    }

    @Test
    public void testPrintFourteen() {
        int num = 14;
        String exp = "__    __ _____  __    __\n\\ \\  / /|_   _| \\ \\  / /\n \\ \\/ /   | |    \\ \\/ / \n" +
                     " / /\\ \\   | |     \\  /  \n/ /  \\ \\ _| |_     \\/   \n\\/    \\/|_____|         \n";
        assertEquals(exp, RomanPrinter.print(num));
    }

    @Test
    public void testPrintNineteen() {
        int num = 19;
        String exp = "__    __ _____  __    __\n\\ \\  / /|_   _| \\ \\  / /\n \\ \\/ /   | |    \\ \\/ / \n" +
                     " / /\\ \\   | |    / /\\ \\ \n/ /  \\ \\ _| |_  / /  \\ \\\n\\/    \\/|_____| \\/    \\/\n";
        assertEquals(exp, RomanPrinter.print(num));
    }

    @Test
    public void testPrintTwenty() {
        int num = 20;
        String exp = "__    ____    __\n\\ \\  / /\\ \\  / /\n \\ \\/ /  \\ \\/ / \n" +
                     " / /\\ \\  / /\\ \\ \n/ /  \\ \\/ /  \\ \\\n\\/    \\/\\/    \\/\n";
        assertEquals(exp, RomanPrinter.print(num));
    }
}
