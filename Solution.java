package Stack;

import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens)  {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String str=tokens[i];
            if(!isOperations(str)){
                int val=Integer.valueOf(str);
                stack.push(val);
            }else {
                int num2=stack.pop();
                int num1=stack.pop();

                switch (str){
                    case "+":
                        stack.push(num1+num2);
                        break;
                    case "-":
                        stack.push(num1-num2);
                        break;
                    case "*":
                        stack.push(num1*num2);
                        break;
                    case "/":
                        stack.push(num1/num2);
                        break;
                    default:
                }
            }
        }

        return stack.pop();
    }
    private boolean isOperations(String str){
        if(str.equals("+") || str.equals("-")||str.equals("*")||str.equals("/")){
            return true;
        }
        return false;
    }


}
