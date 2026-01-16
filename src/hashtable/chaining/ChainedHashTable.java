package hashtable.chaining;

import hashtable.linearprobing.StoredEmployee;
import utils.Employee;

import java.util.LinkedList;

public class ChainedHashTable {

    private final LinkedList<StoredEmployee>[] hashTable;

    public ChainedHashTable() {
        hashTable = new LinkedList[10];
        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = new LinkedList<>();
        }
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        hashTable[hashedKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        LinkedList<StoredEmployee> iterator = hashTable[hashedKey];
        for (StoredEmployee employee: iterator) {
            if (employee.key().equals(key)) {
                return employee.value();
            }
        }
        return null;
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);
        LinkedList<StoredEmployee> iterator = hashTable[hashedKey];
        int index = 0;
        for (StoredEmployee employee: iterator) {
            if (employee.key().equals(key)) {
                hashTable[hashedKey].remove(index);
                return employee.value();
            }
            index++;
        }
        return null;
    }

    private int hashKey(String key) {
        return Math.abs(key.hashCode() % hashTable.length);
    }

    public void printHashTable() {
        for (LinkedList<StoredEmployee> employees: hashTable) {
            if (!employees.isEmpty()) {
                System.out.println(employees);
            }
        }
    }
}
