class Solution {
    public int removeElement(int[] nums, int val) {
        int cnt=0;
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(val!=nums[i])
            {
                cnt++;
                nums[j]=nums[i];
                j++;
                
               
                
            }
            
            
        }
        
        return cnt;

    }
}
