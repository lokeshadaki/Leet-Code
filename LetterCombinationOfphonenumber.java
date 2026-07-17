import java.util.*;
class LetterCombinationOfphonenumber {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        Map<Character , String> mapping=Map.of(
            '2',"abc",
            '3',"def",
            '4',"ghi",
            '5',"jkl",
            '6',"mno",
            '7',"pqrs",
            '8',"tuv",
            '9',"wxyz"
        );

        if(digits.length()==0)
        {
            return result;
        }

        backTrack(digits , 0 , new StringBuilder() , result , mapping);

        return result;
    }

    protected void backTrack(String digits , int index , StringBuilder comb , List<String> result , Map<Character , String> mapping)
    {
        if(index == digits.length())
        {
            result.add(comb.toString());
            return ;
        }
        
        String letters = mapping.get(digits.charAt(index));
        for(char letter : letters.toCharArray())
        {
            comb.append(letter);
            backTrack(digits , index+1 , comb , result , mapping);
            comb.deleteCharAt(comb.length()-1);
        }
    }
}
