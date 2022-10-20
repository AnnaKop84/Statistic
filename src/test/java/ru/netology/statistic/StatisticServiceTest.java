package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticServiceTest {

    @Test
    void findMax() {
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void maxIncomeIndex2() {
        StatisticService service = new StatisticService();


        long[] incomesInBillions = {7, 5, 8, 4, 5, 3, 8, 6, 10, 11, 5};
        long expected = 11;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void maxIncomeIndex3() {
        StatisticService service = new StatisticService();


        long[] incomesInBillions = {7, 5, 8, 4, 5, 3, 8, 6, 1, 10, 10};
        long expected = 10;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void maxIncomeIndex4() {
        StatisticService service = new StatisticService();


        long[] incomesInBillions = {10, 10, 8, 4, 5, 3, 8, 6, 1, 4, 3};
        long expected = 10;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}

