package clases;

/**
 *
 * @author Josue
 */

// Leaf
public class IndividualEmployee implements IEmployee {

    private String name;

    public IndividualEmployee(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void showDetails() {
        System.out.println("Individual Employee: " + getName());
    }
}
