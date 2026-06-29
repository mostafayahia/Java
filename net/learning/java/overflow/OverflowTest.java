package net.learning.java.overflow;

public class OverflowTest {
    public static void main(String[] args) {
        byte x = 0;

        for (int i = 0; i < 130; i++) {
            x += 1;
            System.out.println(x);
        }
    }
}