//给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
//有效字符串需满足：
//左括号必须用相同类型的右括号闭合。
//左括号必须以正确的顺序闭合。

//输入：s = "()"
//输出：true

//输入：s = "()[]{}"
//输出：true

//输入：s = "([)]"
//输出：false

//输入：s = "{[]}"
//输出：true

import java.util.Stack;

public class ValidParentheses {
    public static boolean solution(String s){
        Stack<Character> stack = new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='(') stack.push(')');
            else if(c=='[') stack.push(']');
            else if(c=='{') stack.push('}');
            else if(stack.isEmpty()||c!=stack.pop()) return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){
        String s = "(((((())))){{[()]}}";
        Boolean result = solution(s);
        System.out.println(result);
    }
}
