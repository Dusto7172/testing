package junitcase3;

public class PalindromeCheck {

	boolean palindromeCheck(String str) {
		str = str.toLowerCase();
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1))
				return false;
		}
		return true;
	}

}
