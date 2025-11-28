package solution.hot100.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
20. 有效的括号

给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
每个右括号都有一个对应的相同类型的左括号。
 */
public class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}','{');
        map.put(']','[');

        int n = s.length();
        if (n % 2 == 1){
            return false;
        }
        for (int i = 0; i < n; i++){
            char c = s.charAt(i);
            if (!map.containsKey(c)){
                stack.push(c);
            }else{
                if (stack.isEmpty()){
                    return false;
                }else if (stack.peek() != map.get(c)){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
