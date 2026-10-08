class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        int max = 0;

        for(int i : nums){

            set.add(i);
        }

        for(int i=0; i<nums.length; i++){

            int j = nums[i];
            int count = 0;

            if(!set.contains(j-1)){

                while(set.contains(j)){
                    j++;
                    count++;
                }
            }
            max = Math.max(max,count);
        }
        return max;
    }
}
