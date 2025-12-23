import java.util.*;

class Solution {
    public void nearlySorted(int[] arr, int k) {
        // Step 1: Create a Min-Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // Step 2: Add first k+1 elements to the heap
        // Kyuki smallest element pehle k+1 positions ke andar hi hoga.
        int n = arr.length;
        for (int i = 0; i <= k ; i++) {
            minHeap.add(arr[i]);
        }
        
        int index = 0;
        // Step 3: Process remaining elements
        // Naye element ko add karo aur heap se smallest nikaal kar array mein daalo.
        for (int i = k + 1; i < n; i++) {
            arr[index++] = minHeap.poll();
            minHeap.add(arr[i]);
        }
        
        // Step 4: Empty the heap
        // Jab array khatam ho jaye, heap mein bache hue elements ko line se daal do.
        while (!minHeap.isEmpty()) {
            arr[index++] = minHeap.poll();
        }
    }
}
