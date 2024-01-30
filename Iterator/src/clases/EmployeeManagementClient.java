package clases;

/**
 *
 * @author Josue
 */

// Client
public class EmployeeManagementClient {

    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();
        employeeList.addEmployee(new Employee("John Doe"));
        employeeList.addEmployee(new Employee("Jane Smith"));
        employeeList.addEmployee(new Employee("Bob Johnson"));

        // Obtener un iterador y recorrer la colección de empleados
        IEmployeeIterator iterator = employeeList.createIterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println("Employee: " + employee.getName());
        }
    }
}
