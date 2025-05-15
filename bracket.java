import java.util.*;
public class bracket {
    static boolean bracketparenthesis(String str){
        Deque <Character> stack = new ArrayDeque<Character>();
        int n = str.length();
        for (int i =0;i<n;i++){
            char x = str.charAt(i);

            if(x =='[' || x=='(' || x=='}'){
                stack.push(x);
                continue;
            }
            if(stack.isEmpty()){
                return false;
            }
            char check;
            switch(x){
                case ')':
                check = stack.pop();
                if(check=='{' || check =='[')
                    return false;
                    break;
                
                case ']':
                check = stack.pop();
                if(check=='{' || check =='(')
                    return false;
                    break;
                
                case '}':
                check = stack.pop();
                if(check=='(' || check =='[')
                    return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }
    public static void main(String[] args)
	{
		String expr = "([{}])";

		if (bracketparenthesis(expr))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}
}
