import java.util.*;
class Solution {
    public int kthSmallest(int[] arr, int k) {
     PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
     
      for(int i = 0; i<arr.length; i++){
          max.add(arr[i]);
          if(max.size()>k){
              max.poll();
          }
      }
      return max.peek();
        
    }
}
