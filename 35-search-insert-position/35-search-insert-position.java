class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while (l<=r)
        {
            int x = (l+r)/2;
            if(nums[x]==target)
            {
                return x;
            }
            else if(nums[x]>target)
            {
                r = x-1;
            }
            else if(nums[x]<target)
            {
                l = x+1;
            }
        }

        return l;
    }
}