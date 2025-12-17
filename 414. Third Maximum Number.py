class Solution:
    def thirdMax(self, nums):
        nums = set(nums)          # remove duplicates
        nums = list(nums)
        
        if len(nums) < 3:
            return max(nums)
        
        nums.sort(reverse=True)
        return nums[2]
