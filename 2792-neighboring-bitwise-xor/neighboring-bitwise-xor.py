class Solution(object):
    def doesValidArrayExist(self, derived):
        """
        :type derived: List[int]
        :rtype: bool
        """
        sum=0
        for i in derived:
            sum^=i
        return sum==0