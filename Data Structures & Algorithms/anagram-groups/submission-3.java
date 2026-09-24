class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> s = new HashMap<>();
        
        for(int i=0;i<strs.length;i++){

            char[] cha = strs[i].toCharArray();
            Arrays.sort(cha);

            String key = new String(cha);

            if(!s.containsKey(key)){

                s.put(key,new ArrayList<>());
            }

            s.get(key).add(strs[i]);

        }

        return new ArrayList(s.values());

    }
}
