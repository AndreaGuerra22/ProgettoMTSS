package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {
    @Test
    public void testConvertOne() {
        // Arrange
        int number = 1;

        String result = IntegerToRoman.convert(number);

        assertEquals("I", result);
    }

    @Test
    public void testConvertThree() {
        // Arrange
        int number = 3;
        
        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("III", result);
    }
}