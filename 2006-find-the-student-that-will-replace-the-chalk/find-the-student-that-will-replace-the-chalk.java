class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int sum=0;
        for(int i=0;i<chalk.length;i++)
        {
            sum+=chalk[i];
            if(sum>k) return i;
        }
        return chalkReplacer(chalk, k%sum);
    }
}