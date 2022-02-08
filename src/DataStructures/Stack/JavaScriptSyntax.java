package DataStructures.Stack;

import java.util.Stack;

/**
 * Problem :
 * create the beginnings of a JavaScript linter—that is,
 * a program that inspects a programmer’s JavaScript code and ensures that each line is syntactically correct.
 **/
public class JavaScriptSyntax {
    public static void main(String[] args) {
        checkSyntax("(var x=25;)");
    }

    private static void checkSyntax(String syntax) {
        Stack stack = new Stack();
        System.out.println(syntax);
        char[] syn = syntax.toCharArray();
        for(char c:syn){
            if(c == '(' ||c ==  '[' ||c ==  '{'){
                stack.push(c);
            }
            else if(c == ')' ||c ==  ']' ||c ==  '}'){
                stack.peek();//check if stack[TOP] is a match for closing braces
                //apply switch case
            }
        }
    }
}
