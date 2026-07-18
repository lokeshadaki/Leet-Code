import java.util.*;
class ValidParenthese {
    public boolean isValid(String s) {
        Deque<Character> stack=new ArrayDeque<>();

        for(char ch : s.toCharArray())
        {
            if(ch=='(' || ch=='{' ||ch=='[')
            {
                stack.push(ch);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }

                char top =(char) stack.pop();

                if(ch==')' && top!='(')
                {
                    return false;
                }
                if(ch=='}' && top!='{')
                {
                    return false;
                }
                if(ch==']' && top!='[')
                {
                    return false;
                }
            }
        }

        if(stack.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
