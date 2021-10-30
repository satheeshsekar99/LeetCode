class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:
        x=0
        for op in operations:
            if (op== "++X" or op=="X++"):
                x=x+1
            elif (op== "--X" or op=="X--"):
                x=x-1
            else:
                pass
        return x
        