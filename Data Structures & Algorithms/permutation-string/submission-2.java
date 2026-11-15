class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) {
            return false;
        }

        int[] s1Frequency = new int[26];
        int[] s2Frequency = new int[26];
        int l=0;
        int r=s1.length()-1;

        for(int i=0; i<s1.length();i++) {
            s1Frequency[s1.charAt(i) - 'a']++;
            s2Frequency[s2.charAt(i) - 'a']++;

        }


        while(r<s2.length()) {
            if(Arrays.equals(s2Frequency, s1Frequency)){
                return true;
            }
            s2Frequency[s2.charAt(l) - 'a']--;
            r++;
            l++;
           if(r < s2.length()) {
            s2Frequency[s2.charAt(r) - 'a']++;
           }
        }
        return false;

        
    }
}
