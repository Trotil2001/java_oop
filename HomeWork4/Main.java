import protection.ShieldWooden;
import warriors.Archer;
import warriors.SwordMan;
import warriors.Warrior;
import team.Team;
import weapons.Bow;
import weapons.Sword;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archerTeam = new Team<>("Archers");
        archerTeam.addWarrior(new Archer("Vasya", new Bow(), new ShieldWooden()))
                .addWarrior(new Archer("Petya", new Bow(),new ShieldWooden()))
                .addWarrior(new Archer("Misha", new Bow(),new ShieldWooden()))
                .addWarrior(new Archer("Grisha", new Bow(),new ShieldWooden()));

        System.out.println(archerTeam);

        Team<Warrior> mixTeam = new Team<>("Mixer");
        mixTeam.addWarrior(new Archer("Vasya", new Bow(),new ShieldWooden()))
                .addWarrior(new SwordMan("Petya", new Sword(),new ShieldWooden()))
                .addWarrior(new Archer("Misha", new Bow(),new ShieldWooden()))
                .addWarrior(new SwordMan("Grisha", new Sword(),new ShieldWooden()));

        System.out.println(mixTeam);

        SwordMan greg = new SwordMan("Grisha", new Sword(),new ShieldWooden());
        Archer misha = new Archer("Misha", new Bow(),new ShieldWooden());

        while (greg.getHealthPoint() > 0 && misha.getHealthPoint() > 0) {
            int damage2 = misha.hitDamage(greg);
            int damage1 = greg.hitDamage(misha);
            System.out.printf("Здоровье Гриши: %d Здоровье Миши: %d \n", greg.getHealthPoint(), misha.getHealthPoint());
        }

        if (greg.getHealthPoint()>0)
            System.out.println("Гриша победил");
        else
            System.out.println("Миша победил");
    }
}