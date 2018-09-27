package com.indigo.christian;

/*
 * 2. Largest palindrome product.
 * A palindromic number reads the same both ways. The smallest 6 palindrome 
 * made from the product of two 3-digit numbers is 101101 = 143 x 707.
 * 
 *  Find the largest palindrome made from the product of two 3-digit numbers }
 *  which is less than N
 *
 * */
public class PalindromicNumber {

	public static void main(String[] args) {
		PalindromicNumber p = new PalindromicNumber();
		p.largestPalindrome(10, 100);
		p.largestPalindrome(10, 1000);
	}
public void largestPalindrome(int t, int n) {
	int palindrome = 0;
	for (int x = t; x < n; x++) {
		for (int y = t; y < n; y++) {
			int value = x * y;
			if(isPalindrome(value) && value > palindrome) {
				palindrome = value;
			}
		}	
	}
	System.out.println(palindrome);
}

private boolean isPalindrome(int num) {
	StringBuffer sb = new StringBuffer(Integer.toString(num));
	return Integer.toString(num).equalsIgnoreCase(sb.reverse().toString());
}
}
