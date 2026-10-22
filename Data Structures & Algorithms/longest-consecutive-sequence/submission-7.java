class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) {
            return 0;
        }

        HashSet<Integer> seen = new HashSet<>();

        for(int num: nums) {
            seen.add(num);
        }

        int ans =1;

        for(int i=0;i<nums.length;i++) {
            if(!seen.contains(nums[i]-1)) {
                int loopAns = 1;
                for(int j=1; j<nums.length;j++) {
                    if(seen.contains(nums[i] + j)) {
                        loopAns++;
                    }
                    else {
                        break;
                    }
                }
               ans = loopAns > ans ? loopAns : ans;
            }
            else{ 
                continue;
            }

        }

        return ans;


        
    }
}
