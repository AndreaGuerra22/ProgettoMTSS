////////////////////////////////////////////////////////////////////
// Andrea Guerra 2137978
// Gioele Dalla Pozza 2137977
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        // Define I print
        String[] i = {
            " _____ ", 
            "|_   _|", 
            "  | |  ",
            "  | |  ", 
            " _| |_ ", 
            "|_____|"
        };

        StringBuilder result = new StringBuilder();

        //Test for only first 3 numbers
        for (int row = 0; row < 6; row++) {
            for (int j = 0; j < romanNumber.length(); j++) {
                char c = romanNumber.charAt(j);
                if (c == 'I') {
                    result.append(i[row]);
                }
            }
            result.append("\n");
        }

        return result.toString();
    }
}
