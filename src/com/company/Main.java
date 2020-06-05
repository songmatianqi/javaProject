package com.company;

public class Main {

    public static void rotateOnce(int[] nums) {
        
    }

    public static void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++ ) {
            rotateOnce(nums);
        }
    }

    public static void main(String[] args) {
	// write your code here
        int[] a = new int[] {1,2,3,4,5,6,7};
        rotate(a,3);
    }







}
