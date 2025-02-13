class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        int count=0;
        for(int i:nums)
        {
            if(i<=k) pq.add((long) i);
        }
        while(pq.size()>=2 && pq.peek()<k)
        {
            long i=pq.poll(),j=pq.poll();
            long val=Math.min(i,j)*2+Math.max(i,j);
            pq.add(val);
            count++;
        }
        return count;
    }
}