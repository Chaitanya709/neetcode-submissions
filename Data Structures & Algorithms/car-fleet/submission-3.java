class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        int[][] cars = new int[speed.length][2];

        //to bring all cars speed and postion together 
        for(int i=0;i<position.length;i++){

            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        //sort the cars based on their positions descending order
        Arrays.sort(cars,(a,b) -> b[0] - a[0]);
        
        Stack<Double> s = new Stack<>();

        for(int i=0; i<position.length; i++){

            //System.out.println("pos" + cars[i][0] + "speed" + cars[i][1]);

            double time = (double)(target - cars[i][0]) / cars[i][1];

            if(!s.isEmpty() && time<=s.peek()) continue;

           // System.out.println(time);

            s.push(time);
        }

        return s.size();

    }
}
