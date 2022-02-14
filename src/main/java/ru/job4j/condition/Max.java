package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int third) {
        int tmp = max(left, right);
        return max(tmp, third);
    }

    public static int max(int left, int right, int third, int four) {
        int tmp = max(left, right);
        tmp = max(tmp, third);
        return max(tmp, four);
    }
}
