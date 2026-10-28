class Solution {
    public int lengthOfLongestSubstring(String s) {
        
      if(s.length() == 0) {
        return 0;
      }

      int ans =1;

      for(int i=0;i<s.length()-1;i++) {
       int subStringlen =1;
        Set<Character> seen = new HashSet<>();
        seen.add(s.charAt(i));

        for(int j = i+1; j<s.length() ;j++) {
            if(seen.add(s.charAt(j))) {
                subStringlen++;
                ans = Math.max(ans, subStringlen);
            }
            else {
                break;

            }
        }
      }

      return ans;
        
    }
}
