// User function Template for Java

class Solution {
    public static String reverseString(String s) {
      String r = "";
      for(int i = 0; i<s.length(); i++){
          char ch = s.charAt(i);
          r = ch+r;
      }
      return r;
        
    }
}