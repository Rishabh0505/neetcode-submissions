class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] ans = new int[k];

        HashMap <Integer, Integer> count = new HashMap <>();
       

        for(int i=0;i<nums.length; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }

        List <Map.Entry<Integer,Integer>> countList = new ArrayList<>(count.entrySet());

        countList.sort((a,b) -> b.getValue() - a.getValue());

        for(int i=0;i<k;i++) {
            ans[i] = (countList.get(i).getKey());
        }


        return ans;


        
    }
}
