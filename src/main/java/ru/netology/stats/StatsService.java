package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int averageSales(int[] sales) {

        int sum = sumSales(sales);
        int average = sum / sales.length;
        return average;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverageSales(int[] sales) {
        int belowAverage = 0;
        int average = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                belowAverage = belowAverage + 1;

            }
        }
        return belowAverage;
    }

    public int aboveAverageSales(int[] sales) {
        int aboveAverage = 0;
        int average = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                aboveAverage = aboveAverage + 1;

            }
        }
        return aboveAverage;
    }
}
