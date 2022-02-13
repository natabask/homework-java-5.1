package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"out of lower range boundary,10,99,0",
            "lower range boundary,100,101,1",
            "zero range,200,200,0",
            "preset values,200,300,3",
            "upper range boundary,9801,9802,1",
            "out of higher range boundary,9802,10000,0"})
    void shouldCalculate(String testName, int low, int upper, int expected) {
        SQRService service = new SQRService();

        // вызываем целевой метод
        int actual = service.squaresNumber(low, upper);

        // производим проверку (сравниваем ожидаемый и фактический)
        assertEquals(expected, actual);
    }
}