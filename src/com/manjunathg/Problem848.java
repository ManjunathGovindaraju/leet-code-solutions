package com.manjunathg;
/*
848. Shifting Letters

https://leetcode.com/problems/shifting-letters/

We have a string S of lowercase letters, and an integer array shifts.

Call the shift of a letter, the next letter in the alphabet, (wrapping around so that 'z' becomes 'a').

For example, shift('a') = 'b', shift('t') = 'u', and shift('z') = 'a'.

Now for each shifts[i] = x, we want to shift the first i+1 letters of S, x times.

Return the final string after all such shifts to S are applied.

Example 1:

Input: S = "abc", shifts = [3,5,9]
Output: "rpl"
Explanation:
We start with "abc".
After shifting the first 1 letters of S by 3, we have "dbc".
After shifting the first 2 letters of S by 5, we have "igc".
After shifting the first 3 letters of S by 9, we have "rpl", the answer.


 */
public class Problem848 {

    public static void execute(){
        String str = "abc";
        int[] shifts = {3,5,9};
        String result = shiftingLetters(str,shifts);
        System.out.println(result);
    }

    public static String shiftingLetters(String S, int[] shifts) {

        char[] charArray = S.toCharArray();
        char[] result = new char[charArray.length];
        long sum = 0;
        for (int i = charArray.length-1; i >= 0; i--) {
            sum += shifts[i];
            result[i]= shiftCharacter(charArray[i], sum);
        }

        return new String(result);
    }

    private static char shiftCharacter(char c , long x){

        long ascii = (long)c;
        long actualUpdate = x % 26;

        ascii += actualUpdate;
        // 122  - ascii  value for 'z'
        // 97   - ascii value for 'a'
        if(ascii > 122) {
            ascii = (ascii - 123) + 97;

        }
        return (char)ascii;

    }


}
