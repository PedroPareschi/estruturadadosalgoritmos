package hashtable.linearprobing;

import utils.Employee;

public class SimpleHashTable {
    private StoredEmployee[] hashTable;

    public SimpleHashTable() {
        hashTable = new StoredEmployee[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if (isOccupied(hashedKey)) {
            int stopIndex = hashedKey;
            if (hashedKey == hashTable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }

            while (isOccupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashedKey;
            }
            if (isOccupied(hashedKey)) {
                System.out.println("Erro: hash table cheio");
                return;
            }
        }
        hashTable[hashedKey] = new StoredEmployee(key, employee);
    }

    public Employee get(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        }
        return hashTable[hashedKey].value();
    }

    public Employee remove(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        }
        Employee employee = hashTable[hashedKey].value();
        hashTable[hashedKey] = null;
        StoredEmployee[] oldHashTable = hashTable;
        hashTable = new StoredEmployee[oldHashTable.length];
        for(StoredEmployee storedEmployee: oldHashTable) {
            if (storedEmployee != null) {
                put(storedEmployee.key(), storedEmployee.value());
            }
        }
        return employee;
    }

    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if (hashTable[hashedKey] != null &&
                hashTable[hashedKey].key().equals(key)) {
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if (hashedKey == hashTable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashedKey != stopIndex && hashTable[hashedKey] != null && !hashTable[hashedKey].key().equals(key)) {
            hashedKey = (hashedKey + 1) % hashedKey;
        }

        if (hashTable[hashedKey] != null && hashTable[hashedKey].key().equals(key)) return hashedKey;
        return -1;
    }

    private boolean isOccupied(int index) {
        return hashTable[index] != null;
    }

    public void printHashTable() {
        System.out.println("===========================");
        for (StoredEmployee storedEmployee : hashTable) {
            if (storedEmployee != null) {
                System.out.println(storedEmployee.value());
            } else {
                System.out.println("Empty slot");
            }
        }
        System.out.println("===========================");
    }
}
