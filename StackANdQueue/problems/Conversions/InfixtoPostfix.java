package StackANdQueue.problems.Conversions;

import java.util.*;

    class InfixtoPostfix{
        // Function to convert an infix expression to a postfix expression.
        public static String infixToPostfix(String st) {
            Stack<Character> s = new Stack<>();
            String ans="";
            for(int i=0;i<st.length();i++){

                char ch = st.charAt(i);
                if( 'Z' >= ch && ch>='A'  || 'z' >= ch && ch>='a' || '9' >= ch && ch>='0')
                    ans+=ch;
                else if(ch=='(')
                {
                    s.add(ch);
                }
                else if(ch==')')
                {
                    while(!s.isEmpty() && s.peek()!='(' )
                    {
                        ans+=s.pop();
                    }
                    if(!s.isEmpty())
                        s.pop();
                }
                else
                {
                    while(!s.isEmpty() &&s.peek()!='('  &&(pri(s.peek())>=pri(ch)) )
                    {

                        ans+=s.pop();
                    }
                    s.add(ch);
                }


            }
            while(!s.isEmpty())
            {
                ans+=s.pop();
            }
            return ans;
        }
        public static int pri(char ch)
        {
            if(ch=='+' || ch=='-')
            {
                return 1;
            }
            if(ch=='^')
                return 3;
            return 2;

        }


}
