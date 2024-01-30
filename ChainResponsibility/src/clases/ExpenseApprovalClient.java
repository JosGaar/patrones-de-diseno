package clases;

/**
 *
 * @author Josue
 */

// Client
public class ExpenseApprovalClient {

    public static void main(String[] args) {

        // Construir la cadena de aprobadores
        IApprover supervisor = new Supervisor();
        IApprover manager = new Manager();
        IApprover director = new Director();

        supervisor.setNextApprover(manager);
        manager.setNextApprover(director);

        // Cliente inicia una solicitud de aprobación
        Expense expense1 = new Expense(80);
        supervisor.processRequest(expense1);

        System.out.println();

        Expense expense2 = new Expense(200);
        supervisor.processRequest(expense2);

        System.out.println();

        Expense expense3 = new Expense(600);
        supervisor.processRequest(expense3);
    }
}
