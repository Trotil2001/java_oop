package zoo;

import zoo.Predator;
import zoo.Swimming;

public class Dolphin extends Predator implements Swimming {
    private  int swimSpeed = 50;
    public Dolphin(String name) {super(name);}

    @Override
    public String say() {return "скрипы";}

    @Override
    public int getSpeedSwim() {return this.swimSpeed;}
    @Override
    public String feed() {
        return "fish";
    }
}
