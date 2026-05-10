package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {

    @Test
    public void testPrintOne() {
        String exp = " _____  \n|_   _| \n  | |   \n  | |   \n _| |_  \n|_____| \n";
        assertEquals(exp, RomanPrinter.print(1));
    }

    @Test
    public void testPrintFour() {
        String exp = " _____  __    __\n|_   _| \\ \\  / /\n  | |    \\ \\/ / \n" +
                     "  | |     \\  /  \n _| |_     \\/   \n|_____|         \n";
        assertEquals(exp, RomanPrinter.print(4));
    }

    @Test
    public void testPrintNine() {
        String exp = " _____  __    __\n|_   _| \\ \\  / /\n  | |    \\ \\/ / \n" +
                     "  | |    / /\\ \\ \n _| |_  / /  \\ \\\n|_____| \\/    \\/\n";
        assertEquals(exp, RomanPrinter.print(9));
    }

    @Test
    public void testPrintFourteen() {
        String exp = "__    __ _____  __    __\n\\ \\  / /|_   _| \\ \\  / /\n" +
                     " \\ \\/ /   | |    \\ \\/ / \n / /\\ \\   | |     \\  /  \n" +
                     "/ /  \\ \\ _| |_     \\/   \n\\/    \\/|_____|         \n";
        assertEquals(exp, RomanPrinter.print(14));
    }

    @Test
    public void testPrintNineteen() {
        String exp = "__    __ _____  __    __\n\\ \\  / /|_   _| \\ \\  / /\n" +
                     " \\ \\/ /   | |    \\ \\/ / \n / /\\ \\   | |    / /\\ \\ \n" +
                     "/ /  \\ \\ _| |_  / /  \\ \\\n\\/    \\/|_____| \\/    \\/\n";
        assertEquals(exp, RomanPrinter.print(19));
    }

    @Test
    public void testPrintTwenty() {
        String exp = "__    ____    __\n\\ \\  / /\\ \\  / /\n \\ \\/ /  \\ \\/ / \n" +
                     " / /\\ \\  / /\\ \\ \n/ /  \\ \\/ /  \\ \\\n\\/    \\/\\/    \\/\n";
        assertEquals(exp, RomanPrinter.print(20));
    }

    @Test
    public void testPrintForty() {
        String exp = "__    __ _      \n\\ \\  / /| |     \n \\ \\/ / | |     \n" +
                     " / /\\ \\ | |     \n/ /  \\ \\| |____ \n\\/    \\/|______|\n";
        assertEquals(exp, RomanPrinter.print(40));
    }

    @Test
    public void testPrintFortyNine() {
        String exp = "__    __ _       _____  __    __\n" +
                     "\\ \\  / /| |     |_   _| \\ \\  / /\n" +
                     " \\ \\/ / | |       | |    \\ \\/ / \n" +
                     " / /\\ \\ | |       | |    / /\\ \\ \n" +
                     "/ /  \\ \\| |____  _| |_  / /  \\ \\\n" +
                     "\\/    \\/|______||_____| \\/    \\/\n";
        assertEquals(exp, RomanPrinter.print(49));
    }

    @Test
    public void testPrintFifty() {
        String exp = " _      \n| |     \n| |     \n| |     \n| |____ \n|______|\n";
        assertEquals(exp, RomanPrinter.print(50));
    }

    @Test
    public void testPrintOneHundred() {
        String exp = "  _____  \n / ____| \n| |      \n| |      \n| |____  \n \\_____| \n";
        assertEquals(exp, RomanPrinter.print(100));
    }

    @Test
    public void testPrintOneThousand() {
        String exp = " __  __ \n|  \\/  |\n| \\  / |\n| |\\/| |\n| |  | |\n|_|  |_|\n";
        assertEquals(exp, RomanPrinter.print(1000));
    }
}
