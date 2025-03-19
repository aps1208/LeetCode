class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=1,h=arr.length-2;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            System.out.println(mid);
            if(arr[mid-1]<=arr[mid] && arr[mid+1]<=arr[mid])
            {
                return mid;
            }
            if(arr[mid-1]<=arr[mid] && arr[mid+1]>=arr[mid])
            {
                l=mid+1;
            }
            else
            {
                h=mid-1;
            }
        }
        return -1;
    }
}