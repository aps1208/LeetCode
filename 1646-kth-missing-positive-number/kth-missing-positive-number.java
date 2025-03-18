class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int missing=arr[n-1]-n;
        if(missing<k) return arr[n-1]+(k-missing);
        int l=0,h=n-1,idx=-1;
        missing=0;
        while(l<=h)
        {
            int mid=(l+h)/2;
            int miss=arr[mid]-(mid+1);
            if(miss<k) l=mid+1;
            else 
            {
                missing=miss;
                idx=mid;
                h=mid-1;
            }
        }
        int ans=arr[idx]-(missing-k)-1;
        return ans;
    }
}