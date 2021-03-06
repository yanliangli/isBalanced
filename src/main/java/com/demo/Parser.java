package com.demo;

import java.util.Stack;

public class Parser {

    /**
     * Given a strings of bracket characters: {}(), check if the string is balanced.
     * @param s - a string of characters to check for balance. S consists only of the characters {, }, (, and ). S.length() < 50.
     * @return a boolean that denotes whether the string is balanced : true if string is balanced, or false if it is not.
     */
    public boolean isBalanced(String s) {
        Stack<Character> myStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{') {
                myStack.push('}');
            } else if (c == '(') {
                myStack.push(')');
            } else {
                if (myStack.isEmpty() || myStack.pop() != c) {
                    return false;
                }
            }
        }
        return myStack.isEmpty();
    }
}
