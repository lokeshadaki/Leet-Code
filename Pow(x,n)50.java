class Pow(x,n)50 {
    public double myPow(double x, int n) {
        double res=1;
        long expo=n;
        double base=x;
        if(expo<0)
        {
            base=1/base;
            expo=-expo;
        }
        while(expo>0)
        {
            if (expo%2 !=0)
            {
                res=res*base;
                expo--;
            }
            else
            {
                base=base*base;
                expo/=2;
            }
        }
        return res;
    }
}
