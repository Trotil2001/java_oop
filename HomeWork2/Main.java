import zoo.Dolphin;
import zoo.*;
import zoo.radio.Radio;
import zoo.radio.Sayable;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animalsList = List.of(
                new Cow("Мурка"),
                new Crocodile("Гена"),
                new Leo("Симба - Леопольд"),
                new Goat("Маруська"),
                new Duck("Дональд Дак"),
                new Dolphin("Флиппер")

        );
        Zoo zoo = new Zoo(animalsList, new Radio());

        for (Sayable animal : zoo.getSayable()) {
            System.out.println(animal.say());
        }
        System.out.println("______________________");
        System.out.println();
        System.out.println("__________Бегающие____________");

        for (Runable animal : zoo.getRunableList()) {
            System.out.printf("Имя: %s, Говорю: %s, Скорость: %d \n" ,((Animal)animal).getName(),
                    ((Animal)animal).say(), animal.getSpeedRun());
//            System.out.println(((Animal)animal).getName());
//            System.out.println(((Animal)animal).say());
//            System.out.println(animal.getSpeedRun() + "\n");
        }
        System.out.println("______________________");
        System.out.println();
        System.out.println("___________Летающие___________");
        for (Flyable animal : zoo.getFlyableList()) {
            System.out.printf("Имя: %s, Говорю: %s, Скорость: %d, Высота полета: %d \n" ,((Animal)animal).getName(),
                    ((Animal)animal).say(), animal.getSpeedFlyable(), animal.getHigh());
//            System.out.println(((Animal)animal).getName());
//            System.out.println(((Animal)animal).say());
//            System.out.println(animal.getSpeedFlyable());
//            System.out.println(animal.getHigh() + "\n");
        }
        System.out.println("______________________");
        System.out.println();
        System.out.println("___________Плавающие___________");
        for (Swimming animal : zoo.getSwimmingList()){
            System.out.printf("Имя: %s, Говорю: %s, Скорость: %d \n" ,((Animal)animal).getName(),
                    ((Animal)animal).say(), animal.getSpeedSwim());
//            System.out.println(((Animal) animal).getName());
//            System.out.println(animal.getSpeedSwim());
        }
        System.out.println("______________________");


        System.out.println();
        System.out.println("____Определяем чемпиона по бегу_____");
        System.out.println(zoo.getRunChampion());
        System.out.println("____Определяем чемпиона по полётам_______");
        System.out.println(zoo.getFlightChampion());
        System.out.println("____Определяем чемпиона по плаванию_______");
        System.out.println(zoo.getSwimChampion());

    }
}