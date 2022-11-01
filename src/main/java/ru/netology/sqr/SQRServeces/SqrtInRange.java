package ru.netology.sqr.SQRServeces;

public class SqrtInRange {
    public int calkSqrt(int lowLimit, int highLimit) {
        int counter = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowLimit) {
                    if (i * i <= highLimit) {
                        counter++;
                    }
                }
            }
        return counter;
    }
}

