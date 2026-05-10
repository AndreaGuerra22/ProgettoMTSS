////////////////////////////////////////////////////////////////////
// Andrea Guerra 2137978
// Gioele Dalla Pozza 2137977
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
    private static final String[] I = {
        " _____  ", 
        "|_   _| ", 
        "  | |   ",
        "  | |   ", 
        " _| |_  ", 
        "|_____| "
    };

    private static final String[] V = {
        "__    __", 
        "\\ \\  / /", 
        " \\ \\/ / ",
        "  \\  /  ", 
        "   \\/   ", 
        "        "
    };

    private static final String[] X = {
        "__    __",
        "\\ \\  / /",
        " \\ \\/ / ",
        " / /\\ \\ ",
        "/ /  \\ \\",
        "\\/    \\/"
    };

    private static final String[] L = {
        " _      ",
        "| |     ",
        "| |     ",
        "| |     ",
        "| |____ ",
        "|______|"
    };

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        StringBuilder result = new StringBuilder();

        for (int row = 0; row < 6; row++) {
            for (int j = 0; j < romanNumber.length(); j++) {
                char c = romanNumber.charAt(j);
                if (c == 'I') {
                    result.append(I[row]);
                } else if (c == 'V') {
                    result.append(V[row]);
                } else if (c == 'X') {
                    result.append(X[row]);
                } else if (c == 'L') {
                    result.append(L[row]);
                }
            }
            result.append("\n");
        }

        return result.toString();
    }
}
