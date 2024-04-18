class Solution {
    public int majorityElement(int[] nums) {
        int winCandidate = nums[0], size = nums.length, candVotes = 0;
        for(var num : nums){
           if(num == winCandidate)candVotes++;
           else{
               candVotes--;
               if(candVotes == 0){
                   candVotes = 1;
                   winCandidate = num;
               }
           }
        }
        return winCandidate;
    }
}
