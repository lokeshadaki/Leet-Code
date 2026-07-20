class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
       
        if(dividend == Integer.MIN_VALUE && divisor==-1)
            return Integer.MAX_VALUE;

        boolean negative=(dividend < 0) ^ (divisor < 0);

        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        
        int quotient=0;

        while (a >= b)
        {
            long temp=b;
            int mul=1;
            
            while (a >= temp+temp)
            {
                temp +=temp;//Value check for nearly equal to dividend and then add
                mul +=mul;//Step count 
            }
            a = a - temp;
            quotient = quotient + mul;
        }
        if (negative)
            return (int)-quotient;
        else
            return (int)quotient;
    }
}
