package clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Josue
 */

// ConcreteAggregate
public class EmployeeList implements IEmployeeCollection {
    private List<Employee> employees;
    
    public EmployeeList() {
        this.employees = new ArrayList<>();
    }
    
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    
    @Override
    public IEmployeeIterator createIterator() {
        return new EmployeeListIterator(employees);
    }
}
