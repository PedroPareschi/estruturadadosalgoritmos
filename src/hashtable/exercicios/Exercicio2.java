package hashtable.exercicios;

import utils.Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Exercicio2 {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        HashMap<Integer, Employee> hashMap = new HashMap<>();
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (!hashMap.containsKey(employee.id())) {
                hashMap.put(employee.id(), employee);
            } else {
                iterator.remove();
            }
        }
        employees.forEach(System.out::println);
    }
}
