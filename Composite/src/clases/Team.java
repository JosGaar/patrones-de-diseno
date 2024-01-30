package clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Josue
 */

// Composite
public class Team implements IEmployee {

    private String name;
    private List<IEmployee> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addMember(IEmployee member) {
        members.add(member);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void showDetails() {
        System.out.println("Team: " + getName());
        System.out.println("Members:");
        for (IEmployee member : this.members) {
            member.showDetails();
        }
    }
}
