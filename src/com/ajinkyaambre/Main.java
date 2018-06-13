package com.ajinkyaambre;

import java.util.Stack;

public class Main {

    public static void stackPush(Stack<Integer> stack){

        for(int i = 0; i < 5; i++){

            stack.push(i);

        }


    }

    public static void stackPop(Stack<Integer> stack){

        System.out.print("Pop: ");

        for(int i = 0; i < 5; i++){

            Integer pop = (Integer) stack.pop();
            System.out.println(pop);


        }

    }

    public static void stackPeek(Stack<Integer> stack){


            Integer peek = (Integer) stack.peek();
            System.out.println("Element on top is: " + peek);


    }

    public static void stackSearch(Stack<Integer> stack, int element){

            Integer search = (Integer) stack.search(element);

            if (search == -1){
                System.out.println("Element not found. Stack is empty.");
            } else {

                System.out.println("Element found is: " + search);
            }






    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();

        stackPush(stack);
        stackPop(stack);
        stackPush(stack);
        stackPeek(stack);
        stackSearch(stack, 2);
        stackSearch(stack, 6);


    }
}
