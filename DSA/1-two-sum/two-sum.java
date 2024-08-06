class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = {};
        if (nums.length == 0){
            return ans; 
        }

        for(int i = 0; i< nums.length-1; ++i) {
            for (int j = i+1 ; j< nums.length; ++j ) {
                if (nums[i]+nums[j]== target) {
                    int []res = {i,j};
                    return res;
                }
            }
        }
        return ans;
    }
}