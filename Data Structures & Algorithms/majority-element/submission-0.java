class Solution {
    public int majorityElement(int[] nums) {
        int maxele = nums[0];
        int fq = 1;
        for(int i = 1; i<nums.length; i++){
            if(fq==0){
                maxele = nums[i];
                fq = 1;
            }
            else if(nums[i]==maxele){
                fq++;
            }
            else{
                fq--;
            }
        }
        return maxele;
    }
}