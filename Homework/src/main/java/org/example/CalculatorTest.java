//STUDENT NAME : AHSEN ÇELİKÇİ
//STUDENT ID : B201202054
//COURSE NAME : SOFTWARE VERIFICATION AND VALIDATION
// ASSIGNMENT 1
// REPOSITORY ADRESS :https://github.com/ahsencelikci/SOFTWARE-VERIFICATION-AND-VALIDATION.git


package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "18, 9, 2",
            "24, 2, 12",
            "15, 2, 7.5",
            "9, 3, 3",
            "25, 2.5, 10"
    })
    void testDivision(double dividend, double divisor, double expectedQuotient) {
        Calculator calculator = new Calculator();
        double result = calculator.divide(dividend, divisor);
        Assertions.assertEquals(expectedQuotient, result);
    }

    @Test
    void testDivisionByZero() {
        Calculator calculator = new Calculator();
        Exception exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(22, 0),
                "IllegalArgumentException expected."
        );
    }
}