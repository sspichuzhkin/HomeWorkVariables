package ru.skypro;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        // Task1
        byte byteExample = 7;
        short shortExample = 27_072;
        int intExample = 777;
        long longExample = 7_000L;

        float floatExample = 3.14f;
        double doubleExample = 3.14;

        char charExample = 115;
        boolean booleanExample = false;


        // Task2
        double boxerOneWeight = 78.2;
        double boxerTwoWeight = 82.7;
        double boxersAllWeight = boxerOneWeight + boxerTwoWeight;
        double boxersAllWeightDifference = boxerOneWeight - boxerTwoWeight;
        double boxersAllWeightDifferenceModule = abs (boxersAllWeightDifference);
        System.out.println("Общий вес 2-х боксеров " + boxersAllWeight + " кг");
        System.out.println("Разница в весе 2-х боксеров " + boxersAllWeightDifferenceModule + " кг");


        //Task3
        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;
        double recipeWeightGrams = 5 * bananaWeight + 2 * milkWeight + 2 * iceCreamWeight + 4 * eggWeight;
        double recipeWeightKilograms = recipeWeightGrams / 1000;
        System.out.println("Вес спорт-завтрака " + recipeWeightKilograms + " кг");


        //Task4
        int targetWeightDiffKg = 7;
        int targetWeightDiffGr = targetWeightDiffKg * 1000;
        int fastWeightLoseGr = 500;
        int slowWeightLoseGr = 250;
        int fastWeightLoseProgress = targetWeightDiffGr / fastWeightLoseGr;
        int slowWeightLoseProgress = targetWeightDiffGr / slowWeightLoseGr;
        int avgWeightLoseProgress = (fastWeightLoseProgress + slowWeightLoseProgress) / 2;
        System.out.println("Наименьшее время потери веса " + fastWeightLoseProgress + " дней");
        System.out.println("Наибольшее время потери веса " + slowWeightLoseProgress + " дней");
        System.out.println("Среднее время потери веса " + avgWeightLoseProgress + " дней");


        //Task5
        double salaryMonthMasha = 67760;
        double salaryMonthDenis = 83690;
        double salaryMonthKris = 76230;
        double salaryMonthNewMasha = salaryMonthMasha + salaryMonthMasha * 0.1;
        String salaryMonthNewMashaRound = String.format("%.2f",salaryMonthNewMasha);
        double salaryMonthNewDenis = salaryMonthDenis + salaryMonthDenis * 0.1;
        String salaryMonthNewDenisRound = String.format("%.2f",salaryMonthNewMasha);
        double salaryMonthNewKris = salaryMonthKris + salaryMonthKris * 0.1;
        String salaryMonthNewKrisRound = String.format("%.2f",salaryMonthNewMasha);
        double salaryYearMasha = salaryMonthMasha * 12;
        double salaryYearDenis = salaryMonthDenis * 12;
        double salaryYearKris = salaryMonthKris * 12;
        double salaryYearNewMasha = salaryMonthNewMasha * 12;
        double salaryYearNewDenis = salaryMonthNewDenis * 12;
        double salaryYearNewKris = salaryMonthNewKris * 12;
        double salaryYearDiffMasha = salaryYearNewMasha - salaryYearMasha;
        String salaryYearDiffMashaRound = String.format("%.2f",salaryYearDiffMasha);
        double salaryYearDiffDenis = salaryYearNewDenis - salaryYearDenis;
        String salaryYearDiffDenisRound = String.format("%.2f",salaryYearDiffDenis);
        double salaryYearDiffKris = salaryYearNewKris - salaryYearKris;
        String salaryYearDiffKrisRound = String.format("%.2f",salaryYearDiffKris);
        System.out.println("Маша теперь получает " + salaryMonthNewMashaRound + " рублей. Годовой доход вырос на " + salaryYearDiffMashaRound + " рублей.");
        System.out.println("Денис теперь получает " + salaryMonthNewDenisRound + " рублей. Годовой доход вырос на " + salaryYearDiffDenisRound + " рублей.");
        System.out.println("Кристина теперь получает " + salaryMonthNewKrisRound + " рублей. Годовой доход вырос на " + salaryYearDiffKrisRound + " рублей.");


    }
}