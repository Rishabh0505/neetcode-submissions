class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int maxLen=0;
        int[] freqArray = new int[26];
        int maxFrequency = 0;

        while(r<s.length()) {
            freqArray[s.charAt(r) - 'A']++;
            
            int currLen = r-l+1;

            maxFrequency = Math.max(maxFrequency, freqArray[s.charAt(r) - 'A']);

            if(currLen - maxFrequency > k){
                freqArray[s.charAt(l) - 'A']--;
                l++;
                currLen = r-l+1;
            }

            maxLen = Math.max(maxLen, currLen);
            r++;

        }

        return maxLen;
        
    }
}
