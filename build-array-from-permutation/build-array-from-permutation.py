class Solution(object):
    def buildArray(self, nums):
        ans = list(range(0,len(nums)))
        for i in range(0, len(ans)):
            for j in range(0, len(nums)):
                ans[i] = nums[nums[i]]
        return ans
            
        