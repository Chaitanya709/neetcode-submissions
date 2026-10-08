class Solution {
    public int characterReplacement(String s, int k) {
     
      /* 
        1) cal freq of the char;
        2)check the maxfreq char;
        3)check if the chars to change <=k nd incresase right++;
        4)if it is >k decrese freq of the char -- and increse left;
        */

        int left = 0;
        int right =0;
        int[] hasharray = new int[26];

        int max = 0;
        int maxfreq = 0;

        while(right < s.length()){

            //cal the freq of char;

            hasharray[s.charAt(right) - 'A']++;

            int x =  hasharray[s.charAt(right) - 'A'];

            //cal the mostfreq char freq
            maxfreq = Math.max(maxfreq , x );

            //condtion check
            if(( (right - left) + 1) - maxfreq >k){

                hasharray[s.charAt(left) - 'A'] --;
                left++;
            }

            //cal max
            max = Math.max(max, (right - left) + 1);
            right++;
        }

        return max;
    
    }
}
