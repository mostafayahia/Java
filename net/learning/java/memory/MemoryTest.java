package net.learning.java.memory;

import net.learning.java.Test;

public class MemoryTest {
    public static void main(String[] args) {
        Test.main(null);

        final int x = 5;
        final Citizen y = new Citizen(1, 38, "yahia");
        final Citizen z = null;
    }
}