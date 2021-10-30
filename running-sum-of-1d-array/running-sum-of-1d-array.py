class Solution(object):
    def runningSum(self, nums):
        sum = [nums[0]]
        for i in range(1,len(nums)):
            nums[i]=nums[i]+nums[i-1]
            sum.append(nums[i])
        return sum

        """
        :type nums: List[int]
        :rtype: List[int]
        """