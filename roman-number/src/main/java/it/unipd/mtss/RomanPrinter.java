////////////////////////////////////////////////////////////////////
// Andrea Guerra 2137978
// Gioele Dalla Pozza 2137977
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
    private static final String[] I = {" _____  ","|_   _| ","  | |   ","  | |   "," _| |_  ","|_____| "};
    private static final String[] V = {"__    __","\\ \\  / /"," \\ \\/ / ","  \\  /  ","   \\/   ","        "};
    private static final String[] X = {"__    __","\\ \\  / /"," \\ \\/ / "," / /\\ \\ ","/ /  \\ \\","\\/    \\/"};
    private static final String[] L = {" _      ","| |     ","| |     ","| |     ","| |____ ","|______|"};
    private static final String[] C = {"  _____  "," / ____| ","| |      ","| |      ","| |____  "," \\_____| "};
    private static final String[] D = {" _____   ","|  __ \\  ","| |  | | ","| |  | | ","| |__| | ","|_____/  "};
    private static final String[] M = {" __  __ ","|  \\/  |","| \\  / |","| |\\/| |","| |  | |","|_|  |_|"};

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String[] getChar(char c) {
        if (c == 'I') { return I; }
        if (c == 'V') { return V; }
        if (c == 'X') { return X; }
        if (c == 'L') { return L; }
        if (c == 'C') { return C; }
        if (c == 'D') { return D; }
        if (c == 'M') { return M; }
        return new String[]{"", "", "", "", "", ""};
    }

    private static String printAsciiArt(String romanNumber) {
        if (romanNumber == null) { return null; }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < romanNumber.length(); j++) {
                res.append(getChar(romanNumber.charAt(j))[i]);
            }
            res.append("\n");
        }
        return res.toString();
    }
}
