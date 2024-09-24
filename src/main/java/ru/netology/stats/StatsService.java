package ru.netology.stats;

public class StatsService {
    long[] sales = new long[12];

    public long calculateTotalSum(long[] sales) {
        long totalSum = 0;
        for (long sale : sales) {
            totalSum += sale;
        }
        return totalSum;
    }

    public long averageSumPerMonth(long[] sales) {
        long totalSum = 0;
        for (long sale : sales) {
            totalSum += sale;
        }
        long averageSum = totalSum / 12;
        return averageSum;
    }

    public int monthWithMaxSales(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    public int monthWithMinSales(long[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;
            }
        }
        return monthMin + 1;
    }

    public int numberOfMonthWithSalesBelowAverage(long[] sales) {
        int numberOfMonth = 0;
        long averageSale = averageSumPerMonth(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                numberOfMonth++;
            }
        }
        return numberOfMonth;
    }

    public int numberOfMonthWithSalesAboveAverage(long[] sales) {
        int monthCounter = 0;
        long averageSales = averageSumPerMonth(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                monthCounter++;
            }
        }
        return monthCounter;
    }
}
