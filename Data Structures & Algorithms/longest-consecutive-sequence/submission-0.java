class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);
        LinkedHashSet<Integer> s = new LinkedHashSet<>();

        //int num = nums[0];
       
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }

        int prev = Integer.MIN_VALUE;
        int streak = 0;
        int longest = 0;

        for(int num : s){
            if(prev!=Integer.MIN_VALUE && num == prev+1){
                streak++;
            }else{
                streak = 1;
            }

            longest = Math.max(longest,streak);
            prev = num;
        }

        return longest;
        
    }
}
