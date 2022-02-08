package DataStructures.Arrays.Problems;

import java.util.ArrayList;

/**
 * Implement Stack Operations using Array
 **/
public class Stack<T> {
    ArrayList<T> A;
    int top = -1;//Empty Stack
    int size;

    public Stack(int size) {
        this.size = size;
        this.A = new ArrayList<T>(size);
    }

    //Push Element into Stack
    private void push(T X) {
        if (top + 1 == size) System.out.println("Stack Overflow");
        else {
            top = top + 1;
            if (A.size() > top) A.set(top, X);//Override Exiting Element
            else A.add(X);//Create New Element
        }
    }

    private T top() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        } else return A.get(top);
    }

    private void pop() {
        if (top == -1) System.out.println("Stack Underflow");
        else top--;
    }

    private boolean empty() {
        return top == -1;
    }

    public String toString() {
        String ans = "";
        for (int i = 0; i < top; i++) {
            ans += String.valueOf(A.get(i)) + "->";
        }
        ans += String.valueOf(A.get(top));
        return ans;
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>(5);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println("s1 after pushing 10, 20 and 30 :\n" + s1);
        s1.pop();
        System.out.println("s1 after pop :\n" + s1);

        Stack<String> s2 = new Stack<>(3);
        s2.push("hello");
        s2.push("world");
        s2.push("java");
        System.out.println("s2 after pushing :\n" + s2);
        System.out.println("s2 after pushing 4th element :");
        s2.push("Kavish");




    }
}
