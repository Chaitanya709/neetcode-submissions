class Solution {
    public int[] twoSum(int[] nums, int target) {
        
       HashMap<Integer,Integer> s = new HashMap<>();

       for(int i=0;i<nums.length;i++){
        
        int diff = target - nums[i];

        if(s.containsKey(diff)){
            return new int[] { s.get(diff) , i};
        }

        s.put(nums[i],i);
       }
        return new int[] {};
    }
}
