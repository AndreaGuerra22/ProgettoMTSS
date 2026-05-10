package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class IntegerToRomanTest {
    
    @Test
    public void testConvertOne() {
        // Arrange
        int number = 1;
        // Act
        String result = IntegerToRoman.convert(number);
        // Assert
        assertEquals("I", result);
    }

    @Test
    public void testConvertFour() {
        // Arrange
        int number = 4;
        // Act
        String result = IntegerToRoman.convert(number);
        // Assert
        assertEquals("IV", result);
    }

    @Test
    public void testConvertFive() {
        // Arrange
        int number = 5;
        // Act
        String result = IntegerToRoman.convert(number);
        // Assert
        assertEquals("V", result);
    }

    @Test
    public void testConvertSix() {
        // Arrange
        int number = 6;
        // Act
        String result = IntegerToRoman.convert(number);
        // Assert
        assertEquals("VI", result);
    }

    @Test
    public void testConvertNine() {
        // Arrange
        int number = 9;
        // Act
        String result = IntegerToRoman.convert(number);
        // Assert
        assertEquals("IX", result);
    }

    @Test
    public void testConvertTen() {
        // Arrange
        int number = 10;
        // Act
        String result = IntegerToRoman.convert(number);
        // Assert
        assertEquals("X", result);
    }

    @Test
    public void testConvertTwenty() {
        // Arrange
        int number = 20;
        // Act
        String result = IntegerToRoman.convert(number);
        // Assert
        assertEquals("XX", result);
    }

    @Test
    public void testConvertForty() {
        int num = 40;
        String res = IntegerToRoman.convert(num);
        assertEquals("XL", res);
    }

    @Test
    public void testConvertFortyNine() {
        int num = 49;
        String res = IntegerToRoman.convert(num);
        assertEquals("XLIX", res);
    }

    @Test
    public void testConvertFifty() {
        int num = 50;
        String res = IntegerToRoman.convert(num);
        assertEquals("L", res);
    }

    @Test
    public void testConvertOnehundred() {
        int num = 100;
        String res = IntegerToRoman.convert(num);
        assertEquals("C", res);
    }

    @Test
    public void testConvertFivehundred() {
        int num = 500;
        String res = IntegerToRoman.convert(num);
        assertEquals("D", res);
    }

    @Test
    public void testConvertOnethousand() {
        int num = 1000;
        String res = IntegerToRoman.convert(num);
        assertEquals("M", res);
    }

    @Test
    public void testConvertFourHundred() {
        assertEquals("CD", IntegerToRoman.convert(400));
    }

    @Test
    public void testConvertFiveHundred() {
        assertEquals("D", IntegerToRoman.convert(500));
    }

    @Test
    public void testConvertOutOfRange() {
        int num = 1001; 
        String res = IntegerToRoman.convert(num);
        assertNull(res);
    }
    

}
