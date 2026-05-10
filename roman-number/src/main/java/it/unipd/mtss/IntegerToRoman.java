////////////////////////////////////////////////////////////////////
// Andrea Guerra 2137978
// Gioele Dalla Pozza 2137977
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 1000) {
            return null;
        }
        
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
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
