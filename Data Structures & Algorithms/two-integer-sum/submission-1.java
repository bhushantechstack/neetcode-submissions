class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap();
        for(int i =0;i < nums.length; i++)
        {
            int intial = nums[i];
            int needed = target - intial;
            if(map.containsKey(needed))
            {
                return new int [] {map.get(needed), i};
            }
            map.put(intial,i);
        }
        return null;
        
    }
}
