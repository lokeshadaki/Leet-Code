class ReverseInteger {
    public int reverse(int x) {
        int reverse=0,digit=0;
        int MAX_VALUE = 2147483647;
        int MIN_VALUE = -2147483648;
        while(x !=0)
        {
            digit=x%10;
            if(reverse > MAX_VALUE /10 || (reverse == MAX_VALUE/10 && digit>=7) )
                return 0;
            
            if (reverse < MIN_VALUE / 10 || (reverse == MIN_VALUE / 10 && digit < -8))
                return 0;        
            
            reverse=reverse*10+digit;
            x=x/10;
        }   

        return reverse;
    }
}
