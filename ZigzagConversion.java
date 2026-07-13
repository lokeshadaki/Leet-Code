class ZigzagConversion {
    public String convert(String s, int numRows) {
        
        if(numRows==1 || numRows>=s.length())
        {
            return s;
        }

        StringBuilder[] rows=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++)
        {
            rows[i]=new StringBuilder();
        }

        int currentRows=0;
        boolean goingDown=true;

        for(char ch : s.toCharArray())
        {
            rows[currentRows].append(ch);

            if(currentRows==numRows-1)
                goingDown=false;
            else if(currentRows==0)
                goingDown=true;

            if(goingDown)
                currentRows++;
            else
                currentRows--;
            
        }


        StringBuilder result=new StringBuilder();

        for(StringBuilder row:rows)
            result.append(row);


        return result.toString();
    }
}
