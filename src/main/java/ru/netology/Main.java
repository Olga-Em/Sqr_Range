package ru.netology;

import ru.netology.sqr.SQRServeces.SqrtInRange;

public class Main {
    public static void main(String[] args) {

        SqrtInRange service = new SqrtInRange();
        System.out.println(service.calkSqrt(100, 200));

    }
}