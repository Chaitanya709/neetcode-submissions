class Solution {
    public int characterReplacement(String s, int k) {

        int left = 0;
        int right = 0;
        int[] freq = new int[26];
        int max = 0;
        int maxfreq = 0;
        
        while(right<s.length()){

            freq[s.charAt(right) - 'A']++; //updating freq of char

            maxfreq = Math.max(maxfreq,freq[s.charAt(right) - 'A']); //finding maxfrequent char

            //checking if the replacment char exceeds k
            if((right - left + 1) - maxfreq > k){

                freq[s.charAt(left) - 'A']--;

                left = left + 1;
            }

            if((right - left + 1) - maxfreq <= k){

                max = Math.max(max,(right - left + 1));
                right++;
            }
            
        }

        return max;
    }
}
