// User function Template for Java


import java.util.Arrays;

class Solution {
    public int characterReplacement(String s, int k) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int[] charCount = new int[26]; 
        int left = 0;          
        int maxLength = 0;     
        int maxFreq = 0;       

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            charCount[currentChar - 'A']++;

            maxFreq = Math.max(maxFreq, charCount[currentChar - 'A']);

            int windowLength = right - left + 1;

            if (windowLength - maxFreq > k) {
                char charToRemove = s.charAt(left);
                charCount[charToRemove - 'A']--;
                left++;
            } else {
                maxLength = Math.max(maxLength, windowLength);
            }
        }

        return maxLength;
    }
}

