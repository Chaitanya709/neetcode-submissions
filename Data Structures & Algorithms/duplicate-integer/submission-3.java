class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> s =  new HashSet<>();

        for(int i : nums){
            s.add(i);
        }

        if(s.size() == nums.length) return false;

        return true;
    }
}