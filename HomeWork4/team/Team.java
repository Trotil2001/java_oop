package team;

import warriors.DistanceAttacker;
import warriors.Warrior;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Warrior> {
    private List<T> team = new ArrayList<>();
    private String name;

    public Team(String name) {
        this.name = name;
    }

    public Team<T> addWarrior(T warrior) {
        team.add(warrior);
        return this;
    }

    public int getMaxDistance() {
        int distance = 0;
        for (T item : team) {
            if (!(item instanceof DistanceAttacker)) {
                continue;
            }
            DistanceAttacker temp = (DistanceAttacker) item;
            if (temp.getDistance() > distance) {
                distance = temp.getDistance();
            }
        }
        return distance;
    }

    public int getTeamDamage() {
        int sum = 0;
        for (T item : team) {
            sum += item.getMaxDamage();
        }
        return sum;
    }
    public int getTeamProtect(){
        int sum = 0;
        for (T item : team) {
            sum += item.getMaxProtect();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder teamBuilder = new StringBuilder();
        for (T item : team) {
            teamBuilder.append(item.toString() + "\n");
        }
        return String.format("Team{ team= %s, maxDistance = %d, maxDamage = %d, maxProtect \n%s}", name, getMaxDistance(), getTeamDamage(), getTeamProtect(), teamBuilder);
    }
}
