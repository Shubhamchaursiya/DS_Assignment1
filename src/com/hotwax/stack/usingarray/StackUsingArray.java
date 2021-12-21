package com.hotwax.stack.usingarray;

public class StackUsingArray {
    static final int max=100;
    int top;
    int[] array=new int[max];

    boolean isEmpty()
    {
        return (top < 0);
    }
    StackUsingArray()
    {
        top = -1;
    }

    boolean push(int x)
    {
        if (top >= (max - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            array[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }
    int pop()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = array[top--];
            return x;
        }
    }
    void travers(){
        for(int i = top;i>-1;i--){
            System.out.print(" "+ array[i]);
        }
    }

}
