package queue;

import stack.LinkedStack;
import utils.Employee;

public class Queue {

    public static void main(String[] args) {
        ArrayQueue stack = new ArrayQueue(3);
        Employee stanMarsh = new Employee("Stan", "Marsh", 123);
        Employee kyleBroflovski = new Employee("Kyle", "Broflovski", 456);
        Employee ericCartman = new Employee("Eric", "Cartman", 789);
        Employee kennyMcCormick = new Employee("Kenny", "McCormick", 1011);

        stack.add(kennyMcCormick);
        stack.add(ericCartman);
        stack.add(kyleBroflovski);
        stack.add(stanMarsh);

        stack.printQueue();
        System.out.println("=====================================");
        System.out.println(stack.remove());
        System.out.println("=====================================");
        stack.printQueue();
        System.out.println("=====================================");
        System.out.println(stack.peek());
    }
}
