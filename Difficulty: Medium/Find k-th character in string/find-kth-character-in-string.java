// User function Template for Java

class Solution {
    char kthCharacter(int m, int n, int k) {
        // code here
         String rev = Integer.toBinaryString(m);
         int idx = 0;
         //String rev = "";
         
         //reverse the whole string 
        //  for(int i = 0; i<s.length(); i++){
        //      rev = s.charAt(i) + rev;
             
        //  }
         
         while(n>0){
             String str = "";
             for(int i= 0; i<rev.length(); i++){
                 char ch = rev.charAt(i);
                 if(ch == '0'){
                 str = str+ '0';
                 str = str+ '1';
                 
                
             }else {
                 str = str+ '1';
                 str = str+ '0';
      
             }
                 
             }
             rev = str;
             n--;
            
             
             
             
             
         }
        
             
             
         
         return rev.charAt(k-1);
    }
}