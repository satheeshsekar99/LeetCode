class Solution:
    def defangIPaddr(self, address: str) -> str:
        for i in range(0,len(address)):
            if address[i]==".":
                output = address.replace(".","[.]")
        return output