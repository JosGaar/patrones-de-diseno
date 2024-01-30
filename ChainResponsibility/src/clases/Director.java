package clases;

/**
 *
 * @author Josue
 */

// ConcreteHandler
public class Director implements IApprover {

    @Override
    public void processRequest(Expense expense) {
        System.out.println("Expense approved by Director");
    }

    @Override
    public void setNextApprover(IApprover nextApprover) {
        // En este ejemplo, el Director es el �ltimo en la cadena y no tiene un pr�ximo aprobador
    }
}
