package StackAndQueue;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack   stack = new DynamicStack(5);

        stack.push(12);
        stack.push(34);
        stack.push(6);
        stack.push(65);
        stack.push(43);
        stack.push(89);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
