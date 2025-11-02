import java.util.*;
class Solution {
    public int helper(int n, int k, int index, List<Integer> ans) {
        if (ans.size() == 1) {
            return ans.get(0); // last remaining person
        }

        index = (index + k - 1) % ans.size(); // find index to remove
        ans.remove(index); // eliminate that person

        return helper(n, k, index, ans); // recursive call
    }

    public int josephus(int n, int k) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) ans.add(i); // fill list with people 1..n

        int index = 0;
        return helper(n, k, index, ans); // start recursion
    }
}
