class Solution {
    public int removeDuplicates(int[] nums) {
        int arrLength = nums.length;
        int j = 0;
        for(int i=0; i < arrLength-1; i++){
            if(nums[i] != nums[i+1])
                nums[j++] = nums[i];
        }
        nums[j++] = nums[arrLength-1];

        return j;
    }
}
