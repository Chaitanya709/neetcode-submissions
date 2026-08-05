class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character,Integer> s1 = new HashMap<>();

       for(char c : s.toCharArray()){
        s1.put(c,s1.getOrDefault(c,0)+1);
       }

       for(char c : t.toCharArray()){

        if(!s1.containsKey(c)) return false;
        s1.put(c,s1.get(c) - 1);
        if(s1.get(c) == 0) s1.remove(c);
      } 

        return s1.isEmpty();

    }
}
