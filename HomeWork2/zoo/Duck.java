package zoo;

public class Duck extends Herbivores implements Flyable, Runable, Swimming {
    private int flightSpeed = 15;
    private int flightHing = 5;
    private int runSpeed = 10;
    private int swimSpeed = 7;

    public Duck(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Krya Krya!";
    }


    @Override
    public int getSpeedFlyable() {
        return this.flightSpeed;
    }

    @Override
    public int getHigh() {
        return this.flightHing;
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }

    @Override
    public int getSpeedSwim() { return this.swimSpeed;}
}
