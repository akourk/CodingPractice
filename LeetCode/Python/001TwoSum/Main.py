# Given an array of integers, return indices of the
# two numbers such that they add up to a specific
# target.
# You may assume that each input would have exactly
# one solution, and you may not use the same
# element twice.

class Solution:
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """

        placeHolder = dict()
        for i, x in enumerate(nums):
            if target - x in placeHolder:
                return placeHolder[target - x], i

            placeHolder[x] = i

        return false



s = Solution()
print(s.twoSum([2, 7, 11, 15], 9))



# bad solution:
#
# class Solution:
#     def twoSum(self, nums, target):
#         """
#         :type nums: List[int]
#         :type target: int
#         :rtype: List[int]
#         """
#
#         for i in range(0, len(nums)):
#             for k in range(i+1, len(nums)):
#                 if nums[i]+nums[k] == target:
#                     return [i, k]
#
#
#
# s = Solution()
# print(s.twoSum([2, 7, 11, 15], 9))
# print("hello world")