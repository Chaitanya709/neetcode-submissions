class Solution {

    public List<List<Integer>> func(int[] nums, List<Integer> l,List<List<Integer>> sub,int index){

        if(index >= nums.length){
            //System.out.println(l);
            sub.add(new ArrayList<>(l));
            return sub;
        }
        
        //Pick
        l.add(nums[index]);
        func(nums,l,sub,index + 1);

        //Not pick
        l.remove(l.size() - 1);
        func(nums,l,sub,index+1);

        return sub;
    }
    public List<List<Integer>> subsets(int[] nums) {
        
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> subset = new ArrayList<>();
        subset = new ArrayList<>();
        return func(nums,ans,subset,0);

    }
}
