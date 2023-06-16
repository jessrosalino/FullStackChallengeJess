/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parentesis;

/**
 *
 * @author macbook
 */
import java.util.Stack;

public class Parentesis {
    public static boolean balance(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String balancedStr = "((({{{[[[]]]}}})))";
        System.out.println(balance(balancedStr)); // ciertos

        String unbalancedStr = ")((()))()()";
        System.out.println(balance(unbalancedStr)); // falsos

    }
}
