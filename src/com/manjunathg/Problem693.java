package com.manjunathg;
/*
693. Binary Number with Alternating Bits

Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.

Example 1:
Input: 5
Output: True
Explanation:
The binary representation of 5 is: 101
Example 2:
Input: 7
Output: False
Explanation:
The binary representation of 7 is: 111.
Example 3:
Input: 11
Output: False
Explanation:
The binary representation of 11 is: 1011.
Example 4:
Input: 10
Output: True
Explanation:
The binary representation of 10 is: 1010.

 */
public class Problem693 {

    public static void execute(){
        int n = 5;
        System.out.println(hasAlternatingBits(n));
    }

    public static boolean hasAlternatingBits(int n) {
        int prevValue = -1;

        while(n>0){
            int rem = n % 2;

            if(prevValue == -1){
                //assign reminder to prevValue for the first digit
                prevValue = rem;
            } else {
                if(prevValue == rem){
                    return false; // if the new reminder is different from prev value, then return false
                } else {
                    prevValue = rem; // if reminder is different from prev value, then assign
                }
            }
            n = n/2;
        }
        return true;

    }
}
