package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StatsServiceTest {
    @Test
    public void totalSumTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actual = service.calculateTotalSum(sales);
        long expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSumTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actual = service.averageSumPerMonth(sales);
        long expected = 15;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void monthMaxTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actual = service.monthWithMaxSales(sales);
        long expected = 8;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void monthMinTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actual = service.monthWithMinSales(sales);
        long expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void monthBelowAverageTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actual = service.numberOfMonthWithSalesBelowAverage(sales);
        long expected = 5;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void monthAboveAverageTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actual = service.numberOfMonthWithSalesAboveAverage(sales);
        long expected = 5;
        Assertions.assertEquals(actual, expected);
    }
}
