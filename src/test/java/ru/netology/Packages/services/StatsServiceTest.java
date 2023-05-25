package ru.netology.Packages.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    void shouldSumAllSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.sumAllSales(sales);

        Assertions.assertEquals(expected, actual);

    }


    @Test
    void shouldAvgSumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.avgSumSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldSumMaxMonth() {
        StatsService service = new StatsService();
        long[] maxMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.sumMaxMonth(maxMonth);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldSumMinMonth() {
        StatsService service = new StatsService();
        long[] minMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.sumMinMonth(minMonth);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldAmountMonthUnderAvg() {
        StatsService service = new StatsService();
        int[] amountMonthUnderAvg = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        long actual = service.amountMonthUnderAvg(amountMonthUnderAvg);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldamountMonthOverAvg() {
        StatsService service = new StatsService();
        int[] amountMonthOverAvg = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        long actual = service.amountMonthOverAvg(amountMonthOverAvg);

        Assertions.assertEquals(expected, actual);

    }


}


