class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] ans = new int[k];


        Map<Integer, Integer> count = new HashMap<>();
        List<List<Integer>> bucket = new ArrayList<>(); //bucket


       for(int i=0;i<nums.length;i++) {
        count.put((nums[i]), count.getOrDefault(nums[i], 0) + 1);
       }

       for(int i=0;i<nums.length+1;i++){
        bucket.add(new ArrayList<>());
       }
    

        for(Map.Entry<Integer, Integer> keySet : count.entrySet()) {
            int freq = keySet.getValue();
            bucket.get(freq).add(keySet.getKey());
        }

        int max = k-1 ;

        for(int i=bucket.size() -1; i>0 && max>=0; i--){
            if(!bucket.get(i).isEmpty()) {
                for(int j=0;j<bucket.get(i).size();j++) {
                    ans[max--] = bucket.get(i).get(j);
                }
            }

        }



        return ans;


        
    }
}
