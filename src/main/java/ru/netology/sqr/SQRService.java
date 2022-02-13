package ru.netology.sqr;

public class SQRService {

    public int squaresNumber(int lowerBound, int upperBound) {
        int j = 0;
        for (int i = 10; i < 100; i++) {
            if ((i * i >= lowerBound) & (i * i <= upperBound)) {
                j = j + 1;
            }
        }
        return j;
    }
}
