package ru.netology.sqr.SQRServeces;

public class SqrtInRange {
    public int calkSqrt(int x, int y) {
        for (int a = 10; a <= 99; a++) {
            if (a * a >= x) {
                for (int b = a, c = 0; b <= 99; b++, c++) {
                    if (b * b > y) {
                        return c;
                    }
                }
                return -1;
            }
        }
        return -1;
    }
}

