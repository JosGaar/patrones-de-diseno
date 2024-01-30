package clases;

/**
 *
 * @author Josue
 */

// ConcreteHandler
public class Supervisor implements IApprover {

    private IApprover nextApprover;

    @Override
    public void processRequest(Expense expense) {
        if (expense.getAmount() <= 100) {
            System.out.println("Expense approved by Supervisor.");
        } else if (nextApprover != null) {
            nextApprover.processRequest(expense);
        }
    }

    @Override
    public void setNextApprover(IApprover nextApprover) {
        this.nextApprover = nextApprover;
    }
}
