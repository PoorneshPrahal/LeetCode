class Solution {
    public void moveZeroes(int[] nums) {
        int first = 0;
        int flag = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 0)
            {
                first = i;
                flag = 1;
                break;
            }
        }
        if(flag == 0)
        {
            return;
        }
        int second = first + 1;
        System.out.println(first + " " + second);
        while(second < nums.length)
        {
            if(nums[second] != 0)
            {
                int temp = nums[first];
                nums[first] = nums[second];
                nums[second] = temp;
                first++;
            }
            second++;
        }
        
    }
}