package com.manjunathg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
884. Uncommon Words from Two Sentences


https://leetcode.com/problems/uncommon-words-from-two-sentences/


We are given two sentences A and B.  (A sentence is a string of space separated words.  Each word consists only of lowercase letters.)

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Return a list of all uncommon words.

You may return the list in any order.



Example 1:

Input: A = "this apple is sweet", B = "this apple is sour"
Output: ["sweet","sour"]
Example 2:

Input: A = "apple apple", B = "banana"
Output: ["banana"]
 */
public class Problem884 {

    public static void execute(){

        String str1 = "this apple is sweet";
        String str2 = "this apple is sour";
        String[] result = Problem884.uncommonFromSentences(str1,str2);
        Utilities.print(result);


        str1 = "apple apple";
        str2 = "banana";
        result = Problem884.uncommonFromSentences(str1,str2);
        Utilities.print(result);
    }

    public static String[] uncommonFromSentences(String A, String B) {
        String concatinatedString = A + " " + B;
        String[] splitStringArray  = concatinatedString.split( " ");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(String word : splitStringArray){
            if(!hashMap.containsKey(word)){
                hashMap.put(word, 1); // Mark as 1 entry
            }else {
                hashMap.put(word, 2); // If there is duplicate , mark as 2

            }
        }


        List<String> result = new ArrayList<>();
        for(String word: hashMap.keySet()){
            if(hashMap.get(word) == 1){
                result.add(word);
            }
        }

        String[] resultStr = new String[result.size()];
        return result.toArray(resultStr);


    }


}
