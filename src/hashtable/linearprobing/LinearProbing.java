package hashtable.linearprobing;

import utils.Employee;

public class LinearProbing {

    public static void main(String[] args) {
        Employee stanMarsh = new Employee("Stan", "Marsh", 123);
        Employee kyleBroflovski = new Employee("Kyle", "Broflovski", 456);
        Employee ericCartman = new Employee("Eric", "Cartman", 789);
        Employee kennyMcCormick = new Employee("Kenny", "McCormick", 1011);
        Employee tolkienBlack = new Employee("Tolkien", "Black", 1213);

        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put("Marsh", stanMarsh);
        hashTable.put("Broflovski", kyleBroflovski);
        hashTable.put("Cartman", ericCartman);
        hashTable.put("McCormick", kennyMcCormick);
        hashTable.put("Black", tolkienBlack);


        hashTable.remove("Marsh");

        hashTable.printHashTable();

    }
}
