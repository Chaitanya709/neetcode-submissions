class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {

            if (s.isEmpty())
                s.push(i);

            while (!s.isEmpty() && temperatures[s.peek()] < temperatures[i]) {
                int x = s.pop();
                res[x] = i - x;
            }

            s.push(i);
        }

        return res;
    }
}
