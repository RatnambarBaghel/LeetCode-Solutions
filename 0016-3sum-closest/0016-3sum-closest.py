class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        n = len(nums)
        nums.sort()
        closest = nums[0]+nums[0+1]+nums[n-1]
        for i in range(n):
            left = i+1
            right = n-1
            while left < right:
                sum = nums[i] + nums[left] + nums[right]
                if abs(sum - target) < abs(closest - target):
                    closest = sum
                if sum < target:
                    left += 1
                else:
                    right -= 1
        return closest