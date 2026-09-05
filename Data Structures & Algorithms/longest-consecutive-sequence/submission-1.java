class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> s = new HashSet<>();
        for(int num : nums) s.add(num);

        int streak = 0;
        int max =0;

        for(int i=0;i<nums.length;i++){

            int j = nums[i];

            if(!s.contains(nums[i] - 1)){

                while(s.contains(j++)) streak++;

            }
            max = Math.max(max,streak);
            streak = 0;
        }

        return max;
    }
}
