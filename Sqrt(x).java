class Sqrt(x) {
    public int mySqrt(int x) {
        int res=1;
        int low=0,high=x;
        
        if(x==0||x==1)
        {
            return x;
        }
        while(low<=high)
        {
            long mid=low+(high-low)/2;
            if(mid*mid==x)
            {
                return (int)mid;
            }
            else if(mid*mid<x)
            {
                res=(int)mid;
                low=(int)mid+1;
            }
            else
            {
                high=(int)mid-1;
            }
        }
        return res;
    }
}
