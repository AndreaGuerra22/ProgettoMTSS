////////////////////////////////////////////////////////////////////
// Andrea Guerra 2137978
// Gioele Dalla Pozza 2137977
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    //Test first 3 numbers
    public static String convert(int number) {
        if (number < 1 || number > 3) {
            return null; // Only 1-3 for test
        }
        String result = "";
        for (int i = 0; i < number; i++) {
            result += "I";
        }
        return result;
    }
}