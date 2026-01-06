package linkedlist.doublylinkedlist;

import utils.Employee;

public class DoublyLinkedLists {

    public static void main(String[] args) {
        Employee stanMarsh = new Employee("Stan", "Marsh", 123);
        Employee kyleBroflovski = new Employee("Kyle", "Broflovski", 456);
        Employee ericCartman = new Employee("Eric", "Cartman", 789);
        Employee kennyMcCormick = new Employee("Kenny", "McCormick", 1011);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(stanMarsh);
        list.addToFront(kyleBroflovski);
        list.addToFront(ericCartman);
        list.addToFront(kennyMcCormick);

        list.printList();
        System.out.println(list.getSize());

        Employee buttersStotch = new Employee("Butters", "Stotch", 1213);

        list.addToEnd(buttersStotch);

        list.printList();
        System.out.println(list.getSize());
        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());

        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());
    }
}
