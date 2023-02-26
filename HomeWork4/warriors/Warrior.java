package warriors;

import protection.Protect;
import weapons.Weapon;

import java.util.Random;

public abstract class Warrior<T extends Weapon, E extends Protect> {
    private String name;
    protected T weapon;
    protected E protect;
    protected Random rnd = new Random();
    private int healthPoint;


    public Warrior(String name, T weapon, E protect) {
        this.name = name;
        this.weapon = weapon;
        this.protect = protect;
        healthPoint = 100;


    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void reduceHealthPoint(int damage) {
        this.healthPoint -= damage;
    }

    public int hitDamage(Warrior enemy) {
        int damage = rnd.nextInt(weapon.damage());
        enemy.reduceHealthPoint(damage);
        return damage;
    }

    public int getMaxDamage() {
        return weapon.damage();
    }
    public int getMaxProtect() {
        return protect.protects();
    }
    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", weapon=" + weapon +
                ", healthPoint=" + healthPoint +
                '}';
    }
}
