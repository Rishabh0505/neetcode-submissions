class Solution {
    public int longestConsecutive(int[] nums) {

        //Brute Force 
     if(nums.length == 0) {
        return 0;
     }
     if(nums.length == 1) {
        return 1;
     }   
      Arrays.sort(nums);

  


    int ans = 1;
    int current=1;

    

     for(int i=1;i<nums.length;i++) {
         if(nums[i] == nums[i-1]) {
            continue;
         }
         else if(nums[i] == nums[i-1] + 1)
         {
            current++;
         }
         else {
            current = 1;

         }

        ans = (ans > current) ? ans : current;
     }

     return ans;
        
    }
}
