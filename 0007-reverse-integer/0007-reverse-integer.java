class Solution {
    public int reverse(int x) {
        
        int temp = x;
        long result = 0;
        if(x<0)
        {
            temp = temp * -1;
        }
        while(temp > 0)
        {
            int rem = temp%10;
            result = (result*10)+rem;
            temp = temp/10;
            System.out.println(result);
        }
        if(result > Integer.MAX_VALUE || result<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0)
        {
            return -1*(int)result;
        }
        return (int)result;
        
    }
}