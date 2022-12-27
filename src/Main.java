import beepers.Beeper;
import beepers.Horn;
import beepers.MagicSound;
import bodies.Body;
import bodies.Hatchback;
import bodies.Sedan;
import buses.Ikarus;
import buses.Pazik;
import cars.Lamba;
import cars.Priora;
import engines.Engine;
import engines.EngineV12;
import engines.EngineV6;
import seats.Seat;
import seats.SeatEquals20;
import seats.SeatEquals40;
import wheels.Diameter22;
import wheels.Diameter15;
import wheels.Wheel;

public class Main {
    public static void main(String[] args) {

        Beeper horn = new Horn();
        Engine engineV12 = new EngineV12();
        Wheel diameter22 = new Diameter22();
        Body hatchback = new Hatchback();

        Lamba lamba = new Lamba(horn, engineV12, diameter22, hatchback);

        System.out.println("Характеристики Ламбы:");
        System.out.println(lamba.beeper.makeSound());
        System.out.println(lamba.engine.getSpeed());
        System.out.println(lamba.wheel.getDiameter());
        System.out.println(lamba.body.getBody());
        System.out.println(" ");

        Beeper magicSound = new MagicSound();
        Engine engineV6 = new EngineV6();
        Wheel diameter15 = new Diameter15();
        Body sedan = new Sedan();

        Priora priora = new Priora(magicSound, engineV6, diameter15, sedan);

        System.out.println("Характеристики Приоры:");
        System.out.println(priora.beeper.makeSound());
        System.out.println(priora.engine.getSpeed());
        System.out.println(priora.wheel.getDiameter());
        System.out.println(priora.body.getBody());
        System.out.println(" ");

        Seat seat40 = new SeatEquals40();

        Ikarus ikarus = new Ikarus(seat40, engineV6);

        System.out.println("Характеристики Икаруса:");
        System.out.println(ikarus.seat.getSeat());
        System.out.println(ikarus.engine.getSpeed());
        System.out.println(" ");

        Seat seat20 = new SeatEquals20();

        Pazik pazik = new Pazik(seat20, engineV6);

        System.out.println("Характеристики Пазика:");
        System.out.println(pazik.seat.getSeat());
        System.out.println(pazik.engine.getSpeed());
        System.out.println(" ");
    }
}