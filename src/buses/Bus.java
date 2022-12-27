package buses;
import engines.Engine;
import seats.Seat;

public abstract class Bus {
    public Seat seat;
    public Engine engine;


    public Bus(Seat seat, Engine engine) {
        this.seat = seat;
        this.engine = engine;

    }

}
