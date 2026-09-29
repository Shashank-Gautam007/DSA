class Solution {
   public int trap(int[] height) {
       int n = height.length;


       if (n == 0) {
           return 0;
       }


       int[] left_max = new int[n];
       left_max[0] = height[0];


       // Fill left_max array
       for (int i = 1; i < n; i++) {
           left_max[i] = Math.max(left_max[i - 1], height[i]);
       }


       int[] right_max = new int[n];
       right_max[n - 1] = height[n - 1];


       // Fill right_max array
       for (int j = n - 2; j >= 0; j--) {
           right_max[j] = Math.max(right_max[j + 1], height[j]);
       }


       int ans = 0;


       // Calculate trapped water
       for (int i = 1; i < n - 1; i++) {
           ans += Math.min(left_max[i], right_max[i]) - height[i];
       }
       return ans;
   }
}
