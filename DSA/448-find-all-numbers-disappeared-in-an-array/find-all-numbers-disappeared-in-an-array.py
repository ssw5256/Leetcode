from typing import List

class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        n = len(nums)
        all_nums = set(range(1, n + 1))   # {1, 2, 3, ..., n}
        return list(all_nums - set(nums)) # missing numbers
