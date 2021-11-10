class Solution(object):
    def longestCommonPrefix(self, strs):
        if len(strs) == 0:
            return ""

        current = strs[0]
        for i in range(1, len(strs)):
            ret = ""
            if len(current) == 0:
                break

            for j in range(len(strs[i])):
                if j < len(current) and current[j] == strs[i][j]:
                    ret = ret+current[j]
                else:
                    break
            current = ret
        return current
    
        """
        :type strs: List[str]
        :rtype: str
        """
        