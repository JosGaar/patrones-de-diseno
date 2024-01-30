package clases;

import java.util.List;

/**
 *
 * @author Josue
 */

// ConcreteIterator
public class EmployeeListIterator implements IEmployeeIterator {
    
    private List<Employee> employees;
    private int position;
    
    public EmployeeListIterator(List<Employee> employees) {
        this.employees = employees;
        this.position = 0;
    }
    
    @Override
    public boolean hasNext() {
        return position < employees.size();
    }

    @Override
    public Employee next() {
        if (hasNext()) {
            Employee employee = employees.get(position);
            position++;
            return employee;
        }
        return null;
    }
}
