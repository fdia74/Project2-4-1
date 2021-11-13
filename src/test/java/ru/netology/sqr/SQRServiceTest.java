package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateNumberSQR1() {
        SQRService sqrService = new SQRService();

        int expected = 3;
        int actual = sqrService.calculateSQR(200,300);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateNumberSQR2() {
        SQRService sqrService = new SQRService();

        int expected = 0;
        int actual = sqrService.calculateSQR(-200,-300);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateNumberSQR3() {
        SQRService sqrService = new SQRService();

        int expected = 8;
        int actual = sqrService.calculateSQR(0,300);
        assertEquals(expected, actual);
    }
}