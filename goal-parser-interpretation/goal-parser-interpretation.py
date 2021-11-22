class Solution(object):
    def interpret(self, command):
        sdict = {"()":"o", "(al)":"al"}
        for k in sdict:
            command = command.replace(k, sdict[k])
        return command
        """
        :type command: str
        :rtype: str
        """
        