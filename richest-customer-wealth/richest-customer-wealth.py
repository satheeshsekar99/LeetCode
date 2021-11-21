class Solution(object):
    def maximumWealth(self, accounts):
        arr = []
        x = len(accounts)
        for i in accounts:
            y = sum(i)
            arr.append(y)
        return max(arr)
        """
        :type accounts: List[List[int]]
        :rtype: int
        """
        