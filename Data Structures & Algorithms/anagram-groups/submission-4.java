class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){

            char[] a = strs[i].toCharArray();
            Arrays.sort(a);

            String s = new String(a);

            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(strs[i]);

        }

        List<List<String>> list = new ArrayList<>();

        for(Map.Entry<String,List<String>> entry : map.entrySet()){

            list.add(entry.getValue());
        }

        return list;
    }
}
