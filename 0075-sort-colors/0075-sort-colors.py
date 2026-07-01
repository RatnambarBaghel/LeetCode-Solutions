class Solution:
    def sortColors(self, nums: List[int]) -> None:
        i =0
        zero = 0
        two = len(nums)-1
        while i<=two:
            if nums[i] == 0:
                temp = nums[zero]
                nums[zero] = nums[i]
                nums[i] = temp
                zero +=1
                i += 1
            elif nums[i] == 2:
                temp = nums[two]
                nums[two] = nums[i] 
                nums[i] = temp
                two -=1
            else:
                i +=1
        return

        