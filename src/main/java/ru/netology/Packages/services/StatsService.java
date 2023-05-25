package ru.netology.Packages.services;

public class StatsService {
    public int sumAllSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int avgSumSales(int[] sales) {
        return sumAllSales(sales) / sales.length;
    }

    public int sumMaxMonth(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int sumMinMonth(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int amountMonthUnderAvg(int[] sales) {
        int count = 0;
        int salesAvg = avgSumSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < salesAvg) {
                count++;
            }
        }
        return count;
    }

    public int amountMonthOverAvg(int[] sales) {
        int count = 0;
        int salesAvg = avgSumSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > salesAvg) {
                count++;
            }
        }
        return count;
    }

}
