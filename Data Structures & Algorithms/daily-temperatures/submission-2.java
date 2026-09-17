class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer> s = new Stack<>();
        s.add(0);
        int[] res = new int[temperatures.length];

        for(int i=1;i<temperatures.length;i++){

            while(!s.isEmpty() && temperatures[i] > temperatures[s.peek()]){

                int index = i - s.peek();
                res[s.peek()] = index;
                s.pop();
            }
            s.add(i);
        }
        return res;
    }
}
