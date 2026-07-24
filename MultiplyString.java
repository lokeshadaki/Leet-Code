class MultiplyString {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))
            return "0";

        int m=num1.length();
        int n=num2.length();
        int result[]=new int[m+n];
        char n1[]=num1.toCharArray();
        char n2[]=num2.toCharArray();

        int i,j,digit1,digit2,product,sum;
        for(i=m-1;i>=0;i--)
        {
            digit1=n1[i]-'0';
            for(j=n-1;j>=0;j--)
            {
                digit2=n2[j]-'0';
                product=digit1*digit2;
                sum=product+result[i+j+1];
                result[i+j+1]=sum%10;
                result[i+j] +=sum/10;
            }
        }
        
        StringBuilder sb=new StringBuilder();
        int l=0;
        while(l<result.length &&result[l]==0)
        {
            l++;
        }
        while(l<result.length)
        {
            sb.append(result[l]);
            l++;
        }
        String answer=sb.toString();
        return answer;
    }
}
