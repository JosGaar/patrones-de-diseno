package clases;

/**
 *
 * @author Josue
 */
// Client
public class OrganizationClient {

    public static void main(String[] args) {

        Team developmentTeam = new Team("Development Team");
        developmentTeam.addMember(new IndividualEmployee("John Doe"));
        developmentTeam.addMember(new IndividualEmployee("Jane Smith"));

        // Crear otro equipo y agregarlo al equipo principal
        Team marketingTeam = new Team("Marketing Team");
        marketingTeam.addMember(new IndividualEmployee("Alice Johnson"));
        marketingTeam.addMember(new IndividualEmployee("Bob Williams"));

        developmentTeam.addMember(marketingTeam);

        // Mostrar detalles de la organización
        developmentTeam.showDetails();
    }
}
