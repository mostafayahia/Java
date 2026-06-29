package net.learning.java.memory;

import net.learning.java.Test;

public class MemoryTest extends Test {
    private int ww;

    public MemoryTest() {
        ww = w;
    }

    public static void main(String[] args) {
        Test.main(null);

        final int x = 5;
        final Citizen y = new Citizen(1, 38, "yahia");
        final Citizen z = null;

        final MemoryTest test = new MemoryTest();
        System.out.println(test.ww);
    }
}