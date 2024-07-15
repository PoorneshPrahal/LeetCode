class Solution {
    public void moveZeroes(int[] nums) {
        int first = 0;
        int second;
        int flag = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 0)
            {
                flag = 1;
                first = i;
                break;
            }
        }
        
        if(flag == 0)
        {
            return;
        }
        
        second = first + 1;
        
        for(int i=second;i<nums.length;i++)
        {
            if(nums[second] != 0 && nums[first] == 0)
            {
                int temp = nums[second];
                nums[second] = nums[first];
                nums[first] = temp;
                first++;
                second++;
            }
            else if(nums[first] == 0 && nums[second] == 0)
            {
                second++;
            }
        }
        
    }
}