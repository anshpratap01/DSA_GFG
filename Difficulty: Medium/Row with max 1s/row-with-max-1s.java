// User function Template for Java

class Solution {
    public int rowWithMax1s(int mat[][]) {
        // code here
        int maxcnt = 0;
        int arr[] = new int[2];
        
        for(int  i = 0; i<mat.length; i++){
            int cnt = 0;
            for(int j = 0; j<mat[0].length; j++){

                if(mat[i][j] == 1){
                    cnt++;
                }


            }
            if(cnt > maxcnt){
                arr[0] = i;
                // arr[1] = cnt;
                maxcnt = cnt;
            }

        }
        //System.out.print(maxcnt);
         if(maxcnt  == 0) return -1;
        return arr[0];
    }
}