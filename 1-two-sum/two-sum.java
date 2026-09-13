class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        //T: O(n), s: O(n)

        //[2,7,11,15]

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }

        //{2: 0, 7: 1, 11: 2, 15: 3}
        //[2,7,11,15]
        // .
        //lun = 7

        for(int i = 0; i< nums.length; i++){
            int lookupNumber = target - nums[i];

            if(map.containsKey(lookupNumber) && map.get(lookupNumber) != i){
                return new int[]{
                    map.get(lookupNumber),
                    i
                };
            }
        }

        return new int[] {-1, -1};
    }
}