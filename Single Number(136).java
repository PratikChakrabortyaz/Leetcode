import java.util.HashMap;
import java.util.Map;
class Solution {
    public int singleNumber(int[] nums) {
         Map<Integer, Integer> map = new HashMap<>();
         int n=0;
         for(int num:nums)
         {
             map.put(num,map.getOrDefault(num,0)+1);
         }
         for (Map.Entry<Integer, Integer> entry : map.entrySet())
         {
             if(entry.getValue()==1)
             {
                 n=entry.getKey();
             }
         }
         return n;
        
    }
}
