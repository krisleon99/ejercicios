package com.indigo.christian;
/*
 * 1. Largest product in a series.
 * Find the greatest product of k consecutive digits in the N digit number.
 * 
 * */
public class LargestProduct {

	public void searchNumber(int k, String t) {
		int largestProduct = 0;

        for (int i = 0; i < t.length() - k; i ++) {
            int product = 1;

            for (int j = i; j < i + k; j++) {
                product *= Integer.parseInt(t.substring(j, j + 1));
            }
            if (product > largestProduct) largestProduct = product;
        }
        System.out.println(largestProduct);
	}
	public static void main(String[] args) {
		//class instance
		LargestProduct product = new LargestProduct();
		//test case 1 k = 5, N = 3675356291
		product.searchNumber(5, "3675356291");
		//test case 2 k = 5, N = 2709360626
		product.searchNumber(5, "2709360626");
	    }
}
