package StackAndQueue.Questions;

import java.util.*;
public class ValidParentheses {
    public static void main(String[] args) {
        String str = "[()]{}{[()()]()}";
        System.out.println(isValidParenthesis(str));
    }
    public static boolean isValidParenthesis(String expression) {
        Stack<Character> stack = new Stack<>();

        int n = expression.length();

        for(int i = 0;i < n;i++){
            char ch = expression.charAt(i);
            
            if(ch == '(' || ch == '{' || ch == '[' ){
                stack.push(ch);
            }else {
                if(ch == ')'){
                    if(stack.isEmpty() || stack.pop() != '(' ){
                        return false;
                    }
                }
                if(ch == '}'){
                    if(stack.isEmpty() || stack.pop() != '{'){
                        return false;
                    }
                }
                if(ch == ']'){
                    if(stack.isEmpty() || stack.pop() != '['){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}