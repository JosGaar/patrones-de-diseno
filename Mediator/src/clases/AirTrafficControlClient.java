package clases;

/**
 *
 * @author Josue
 */

// Client
public class AirTrafficControlClient {

    public static void main(String[] args) {
        AirTrafficControlMediator mediator = new AirTrafficControlTower();

        Aircraft airplane1 = new Airplane(mediator, "APL001", 1000);
        Aircraft drone1 = new Drone(mediator, "DRN001", 200);

        // Cambio de altitud solicitado por una aeronave
        airplane1.requestAltitudeChange(1500);
        drone1.requestAltitudeChange(300);
    }
}
