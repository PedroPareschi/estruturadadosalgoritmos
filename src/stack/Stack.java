package stack;

import utils.Employee;

public class Stack {

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        Employee stanMarsh = new Employee("Stan", "Marsh", 123);
        Employee kyleBroflovski = new Employee("Kyle", "Broflovski", 456);
        Employee ericCartman = new Employee("Eric", "Cartman", 789);
        Employee kennyMcCormick = new Employee("Kenny", "McCormick", 1011);

        stack.push(kennyMcCormick);
        stack.push(ericCartman);
        stack.push(kyleBroflovski);
        stack.push(stanMarsh);

        System.out.println(stack.pop());

        System.out.println(stack.peek());
    }
}
