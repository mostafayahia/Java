package net.learning.java.utils;

public class StringUtilsTest {
    public static void main(String[] args) {
        System.out.println(StringUtils.hasText(null));
        System.out.println(StringUtils.hasText(""));
        System.out.println(StringUtils.hasText(" "));
        System.out.println(StringUtils.hasText(" h"));
        System.out.println(StringUtils.hasText("hello"));
    }
}