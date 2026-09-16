class Solution {

    // public boolean numberHasEvenDigits(int num){
    //     int digitsCount = 0;

    //     while(num != 0){
    //         num = num / 10;
    //         digitsCount++;
    //     }

    //     return digitsCount % 2 == 0;
    // }

    // public int findNumbers(int[] nums) {
    //     // APPROACH 1

    //     int evenCount = 0;

    //     for(int i = 0; i<nums.length; i++){
    //         if(numberHasEvenDigits(nums[i])){
    //             evenCount++;
    //         }
    //     }

    //     return evenCount;
    // }

    public int findNumbers(int[] nums){

        // APPROACH 2

        // int evenCount = 0;

        // for(int num: nums){
        //     int len = String.valueOf(num).length();

        //     if(len % 2 == 0){
        //         evenCount++;
        //     }
        // }

        // return evenCount;



        //APPROACH 3


        // int evenCount = 0;

        // for(int num: nums){
        //     int digitCount = (int) Math.floor(Math.log10(num)) + 1;

        //     if(digitCount % 2 == 0){
        //         evenCount++;
        //     }
        // }

        // return evenCount;





        //APPROACH 4

        int evenCount = 0;

        for(int num: nums){
            if((num >= 10 && num <= 99) || (num >= 1000 && num <= 9999) || num == 100000){
                evenCount++;
            }
        }

        return evenCount;
    }
    

}
