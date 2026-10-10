class Solution {
    public boolean isAnagram(String s, String t) {
        Map <Character, Integer> SMap = new HashMap<>();
        Map <Character, Integer> TMap = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for(int i=0; i<s.length(); i++) {
            SMap.put(s.charAt(i), SMap.getOrDefault(s.charAt(i), 0) + 1);

        }

        for(int i=0; i<t.length(); i++) {
            TMap.put(t.charAt(i), TMap.getOrDefault(t.charAt(i), 0) + 1);
        }

        return SMap.equals(TMap);



       
    }
}
