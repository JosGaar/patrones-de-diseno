package clases;

/**
 *
 * @author Josue
 */

// Handler
public interface IApprover {

    void processRequest(Expense expense);

    void setNextApprover(IApprover nextApprover);
}
