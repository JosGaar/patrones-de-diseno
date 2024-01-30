package clases;

/**
 *
 * @author Josue
 */

// Mediator
public interface AirTrafficControlMediator {

    void registerAircraft(Aircraft aircraft);

    void notifyAircraftInDanger(Aircraft aircraft);

    void checkAirspace(Aircraft aircraft, int altitude);

}
