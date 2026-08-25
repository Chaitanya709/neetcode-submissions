class Solution {

    public void func(int index,int[] nums,List<Integer> num,List<List<Integer>> res){

        if(index >nums.length -1){

            return;
        }

        for(int i=index;i<nums.length;i++){
            if(i > index && nums[i] == nums[i-1]) continue;

            num.add(nums[i]);
            res.add(new ArrayList<>(num)); 
            func(i + 1, nums, num, res);  
            num.remove(num.size() -1);
        }

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<Integer> num  = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
         res.add(new ArrayList<>(num));
         Arrays.sort(nums);
        func(0,nums,num,res);
        return res;
        
    }
}
