package ru.netology.stats;

public class StatsService {

    public int Sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int Avg(int[] sales) {
        return Sum(sales) / sales.length;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
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

    public int amountOfMonthsMinSales(int[] sales) {
        int count = 0;
        int sumAvg = Sum(sales) / sales.length;
        for (int sale : sales) {
            if (sale < sumAvg) {
                count++;
            }
        }
        return count;
    }

    public int amountOfMonthsMaxSales(int[] sales) {
        int count = 0;
        int sumAvg = Sum(sales) / sales.length;
        for (int sale : sales) {
            if (sale > sumAvg) {
                count++;
            }
        }
        return count;
    }

}

