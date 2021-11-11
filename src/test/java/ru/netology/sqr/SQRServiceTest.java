package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateNumberSQR() {
        SQRService sqrService = new SQRService();

        int expected = 3;
        int actual = sqrService.calculateSQR(200,300);
        assertEquals(expected, actual);
    }
}