class Solution {
    public int[] twoSum(int[] nums, int target) {

     HashMap <Integer, Integer> diffSet = new HashMap<>();

     for(int i=0; i<nums.length; i++) {
        int diff = target - nums[i];
        if(diffSet.containsKey(diff)) {
            return new int[]{diffSet.get(diff), i};
         }
         else {
            diffSet.put(nums[i], i);
         }
     }

     return null;
        
    }
}
