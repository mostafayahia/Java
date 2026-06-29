package net.learning.java.utils;

public class StringUtils {

    public static boolean hasText(CharSequence str) {
		if (str == null) {
			return false;
		}

		int strLen = str.length();
		if (strLen == 0) {
			return false;
		}

		for (int i = 0; i < strLen; i++) {
			if (!Character.isWhitespace(str.charAt(i))) {
				return true;
			}
		}
		return false;
	}
}