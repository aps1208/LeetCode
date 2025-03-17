class Solution {
    public int singleNonDuplicate(int[] nums) {
        int sum=0;
        for(int i:nums) sum^=i;
        return sum;
    }
}