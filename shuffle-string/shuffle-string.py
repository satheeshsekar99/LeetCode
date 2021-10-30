class Solution(object):
    def restoreString(self, s, indices):
        ans = ''
        for i in range(0,len(s)):
            index = indices.index(i)
            ans = ans + s[index:index+1]
        return ans
            
            
        """
        :type s: str
        :type indices: List[int]
        :rtype: str
        """
        