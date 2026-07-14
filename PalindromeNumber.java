class PalindromeNumber {
    public boolean isPalindrome(int x) {
    int rem=0,sum=0,temp=x;
        while(x>0){
            rem=x%10;
            sum=(sum*10)+rem;
            x=x/10;
        }
        if(temp==sum){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String args[]){
        PalindromeNumber s=new PalindromeNumber();
        int no=121;
        boolean res;
        res=s.isPalindrome(no);
        System.out.println(res);
    }
}
