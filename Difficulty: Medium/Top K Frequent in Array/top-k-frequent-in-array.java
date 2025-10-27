import java.util.*;

class Solution {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(mp.entrySet());

        // Sort: higher frequency first, and if same -> higher number first
        Collections.sort(list, (a, b) -> {
            if (!b.getValue().equals(a.getValue()))
                return b.getValue() - a.getValue();
            else
                return b.getKey() - a.getKey();
        });

        for (int i = 0; i < k && i < list.size(); i++) {
            ans.add(list.get(i).getKey());
        }

        return ans;
    }
}
