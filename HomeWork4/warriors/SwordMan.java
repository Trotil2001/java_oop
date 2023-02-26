package warriors;

import protection.ShieldWooden;
import weapons.Sword;

public class SwordMan extends Warrior<Sword, ShieldWooden> {
    public SwordMan(String name, Sword weapon, ShieldWooden shield) {
        super(name, weapon,shield);
    }


    @Override
    public String toString() {
        return super.toString() + " Type = SwordMan";
    }
}
