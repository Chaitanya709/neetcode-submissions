class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){

            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }

        List<int[]> bucket = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){

            bucket.add(new int[]{entry.getKey(),entry.getValue()});
        }

        bucket.sort((a, b) -> b[1] - a[1]);

        int[] res = new int[k];

        for(int i=0;i<k;i++){
            
            res[i] = bucket.get(i)[0];
        }

        return res;
    }
}
