package clases;

/**
 *
 * @author Josue
 */

// ConcreteHandler
public class Manager implements IApprover {

    private IApprover nextApprover;

    @Override
    public void processRequest(Expense expense) {
        if (expense.getAmount() <= 500) {
            System.out.println("Expense approved by Manager");
        } else if (nextApprover != null) {
            nextApprover.processRequest(expense);
        }
    }

    @Override
    public void setNextApprover(IApprover nextApprover) {
        this.nextApprover = nextApprover;
    }
}
