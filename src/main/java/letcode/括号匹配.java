package letcode;

import org.junit.Test;

import java.util.Stack;

/**
 * @Description: 20 有效的括号
 * @Author: boolean
 * @Date: 2019/11/29 15:10
 */
public class 括号匹配 {
    public boolean isValid(String s) {
        if (null == s){
            return true;
        }
        if (s.length()%2==1){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char index = s.charAt(i);
            if(index == '(' || index == '{' || index =='['){
                stack.push(s.charAt(i));
            }else{
                if (stack.empty()){
                    return false;
                }
                if(index == ')'&& stack.pop()!='('){
                    return false;
                }
                if(index == '}'&& stack.pop()!='{'){
                    return false;
                }
                if(index == ']'&& stack.pop()!='['){
                    return false;
                }
                if (index != ']' && index == '}'&& index == ')'){
                    return false;
                }

            }
        }
        return true;
    }

    @Test
    public void test(){
        System.out.println(isValid("{"));
    }
}



