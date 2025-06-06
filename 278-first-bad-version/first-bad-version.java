/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1;
        int h=n;
        if(n==1)
        {
            return 1;
        }
        while(l<=h)
        {
            int m=(l+(h-l)/2);
            if (isBadVersion(m))
            {
                if(isBadVersion(m-1)==false)
                {
                    return m;
                }
                h=m;
            }
            else
            {
                l=m+1;
            }
        }
        return l;
    }
}