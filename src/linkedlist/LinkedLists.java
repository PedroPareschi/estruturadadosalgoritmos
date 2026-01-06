package linkedlist;

import utils.Employee;

public class LinkedLists {

    public static void main(String[] args) {
        Employee stanMarsh = new Employee("Stan", "Marsh", 123);
        Employee kyleBroflovski = new Employee("Kyle", "Broflovski", 456);
        Employee ericCartman = new Employee("Eric", "Cartman", 789);
        Employee kennyMcCormick = new Employee("Kenny", "McCormick", 1011);

        EmployeeLinkedList list = new EmployeeLinkedList();
        System.out.println(list.isEmpty());

        list.addToFront(stanMarsh);
        list.addToFront(kyleBroflovski);
        list.addToFront(ericCartman);
        list.addToFront(kennyMcCormick);

        System.out.println(list.getSize());

        list.printList();

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();
    }
}
