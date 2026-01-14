package queue;

import stack.LinkedStack;
import utils.Employee;

public class Queue {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(4);
        Employee stanMarsh = new Employee("Stan", "Marsh", 123);
        Employee kyleBroflovski = new Employee("Kyle", "Broflovski", 456);
        Employee ericCartman = new Employee("Eric", "Cartman", 789);
        Employee kennyMcCormick = new Employee("Kenny", "McCormick", 1011);

        queue.add(kennyMcCormick);
        queue.add(ericCartman);
        queue.remove();
        queue.add(kyleBroflovski);
        queue.remove();
        queue.add(stanMarsh);
        queue.remove();
        queue.add(kennyMcCormick);
        queue.remove();
        queue.add(ericCartman);

        queue.printQueue();


    }
}
