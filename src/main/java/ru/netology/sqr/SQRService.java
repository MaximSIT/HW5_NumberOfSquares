package ru.netology.sqr;

public class SQRService {
    public int numberOfSquares(int down, int up) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if ((down <= i * i) && (i * i <= up)) {
                count = count + 1;
            }
        }
        return count;
    }
}