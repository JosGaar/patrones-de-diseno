package clases;

/**
 *
 * @author Josue
 */

// ConcreteColleague
public class Drone extends Aircraft {

    public Drone(AirTrafficControlMediator mediator, String id, int altitude) {
        super(mediator, id, altitude);
    }

    @Override
    public void requestAltitudeChange(int altitude) {
        mediator.registerAircraft(this); // Registrar la aeronave
        mediator.checkAirspace(this, altitude); // Comprobar el espacio a�reo antes de cambiar la altitud
    }
}
