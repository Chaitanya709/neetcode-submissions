class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> s = new HashMap<>();

        for(int i=0; i<strs.length;i++){

            char[] a = strs[i].toCharArray();
            Arrays.sort(a);
            String sorted = new String(a);

            if(!s.containsKey(sorted)){
                s.put(sorted,new ArrayList<>());
            }
            s.get(sorted).add(strs[i]);
        }

        return new ArrayList(s.values());
    }
}
