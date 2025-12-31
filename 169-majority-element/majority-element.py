class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = {}

        res , MaxCount = 0 , 0

        for n in nums:
            count[n] = 1 + count.get(n , 0)
            res = n if count[n] > MaxCount else res
            MaxCount = max(count[n] , MaxCount)
        return res    

