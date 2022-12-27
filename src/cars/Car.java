package cars;

import beepers.Beeper;
import bodies.Body;
import engines.Engine;
import wheels.Wheel;

public abstract class Car {

    public Beeper beeper;
    public Engine engine;
    public Wheel wheel;
    public Body body;


    public Car(Beeper beeper, Engine engine, Wheel wheel, Body body) {
        this.beeper = beeper;
        this.engine = engine;
        this.wheel = wheel;
        this.body = body;
    }

}
