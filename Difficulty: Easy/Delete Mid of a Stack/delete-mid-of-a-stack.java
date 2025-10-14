class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        int size = s.size();
        deleteHelper(s, 0, size);
    }

    private void deleteHelper(Stack<Integer> s, int current, int size) {
        // base condition: if we reached the middle
        if (current == size / 2) {
            s.pop(); // remove middle element
            return;
        }

        // store top element
        int top = s.pop();

        // recursive call
        deleteHelper(s, current + 1, size);

        // push back the element
        s.push(top);
    }
}
