package clases;

/**
 *
 * @author Josue
 */

// Colleague
public abstract class Aircraft {

    protected AirTrafficControlMediator mediator;
    protected String id;
    protected int altitude;

    public Aircraft(AirTrafficControlMediator mediator, String id, int altitude) {
        this.mediator = mediator;
        this.id = id;
        this.altitude = altitude;
    }
    
    public abstract void requestAltitudeChange(int altitude);

    public String getId() {
        return id;
    }

    public int getAltitude() {
        return altitude;
    }
}
