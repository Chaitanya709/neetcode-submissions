class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int[][] car = new int[position.length][2];
        
        //making pairs of psition and speed
        for(int i=0;i<position.length;i++){
            car[i][0] = position[i];
            car[i][1] = speed[i];
        }

        Arrays.sort(car, (a,b) -> b[0] - a[0]); // descending position

       Stack<Double> s = new Stack<>();

       for(int i=0;i<speed.length;i++){

        double time = (double)(target - car[i][0])/car[i][1];

        if(!s.isEmpty() && time <= s.peek()) continue;

        s.push(time);

       }

       return s.size(); 
    }
}
