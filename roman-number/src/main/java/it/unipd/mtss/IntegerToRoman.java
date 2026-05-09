////////////////////////////////////////////////////////////////////
// Andrea Guerra 2137978
// Gioele Dalla Pozza 2137977
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    //Test first 6 numbers
    public static String convert(int number) {
        if (number < 1 || number > 6) {
            return null;
        }
        
        int[] values = {5, 4, 1};
        String[] symbols = {"V", "IV", "I"};
        
        StringBuilder result = new StringBuilder();
        int remaining = number;
        
        for (int i = 0; i < values.length; i++) {
            while (remaining >= values[i]) {
                result.append(symbols[i]);
                remaining -= values[i];
            }
        }
        
        return result.toString();
    }
}