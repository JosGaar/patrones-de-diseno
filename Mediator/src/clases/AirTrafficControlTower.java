package clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Josue
 */

// ConcreteMediator
public class AirTrafficControlTower implements AirTrafficControlMediator {

    private List<Aircraft> registeredAircraft;

    public AirTrafficControlTower() {
        this.registeredAircraft = new ArrayList<>();
    }

    @Override
    public void registerAircraft(Aircraft aircraft) {
        registeredAircraft.add(aircraft);
    }

    @Override
    public void notifyAircraftInDanger(Aircraft aircraft) {
        System.out.println("Air Traffic Control Tower: Aircraft " + aircraft.getId() + " is in danger! Take evasive action!");
    }

    @Override
    public void checkAirspace(Aircraft aircraft, int altitude) {
        // Simulación de lógica para verificar el espacio aéreo y notificar a los aviones en peligro
        if (altitude > aircraft.getAltitude()) {
            notifyAircraftInDanger(aircraft);
        }
    }
}
