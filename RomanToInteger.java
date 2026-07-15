class RomanToInteger {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        int i,j;
        
        for(i=0 ; i < first.length() ; i++ )
        {
            char ch[] = first.toCharArray();
            for( j=1 ; j < strs.length ; j++)
            {
                if(i >= strs[j].length() || strs[j].charAt(i) != ch[i])
                {
                    return first.substring(0,i);
                }
            }
        }
        return first;
    }
}
