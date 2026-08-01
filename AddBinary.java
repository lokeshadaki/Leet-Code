class AddBinary {
    public String addBinary(String a, String b) {
        int i,j,carry=0;
        i=a.length()-1;
        j=b.length()-1;
        StringBuilder sb=new StringBuilder();

        while(i>=0 ||j>=0 || carry==1)
        {
            int sum=carry;
            if(i>=0)
            {
                sum=sum + a.charAt(i)-'0';
                i--;
            }
            if(j>=0)
            {
                sum=sum + b.charAt(j)-'0';
                j--;
            }

            sb.append(sum%2);
            carry=sum/2;

        }

        return sb.reverse().toString();
    }
}
