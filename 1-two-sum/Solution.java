class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> numMap = new HashMap<>();
        int[] result = new int[2];

        for(int i=0; i<n;i++){
            int value = target - nums[i];
            if(numMap.containsKey(value)){
                result[0] = numMap.get(value);
                result[1] = i;
            } else {
                numMap.put(nums[i],i);
            }
        }

        return result;
    }
}
