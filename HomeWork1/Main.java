import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Product("Lays", 100));
        machine.addProduct(new Product("Mars", 70));
        machine.addProduct(new Product("Twix", 70.99));
        machine.addProduct(new Drink("Алёнка", 90, 1.5));
        machine.addProduct(new Drink("Колокольчик", 85, 1));
        machine.addProduct(new Perishable("Молоко Бурёнка", 85, new Date(123, 1, 25)));
        machine.addProduct(new Perishable("Молоко Коровка", 85, new Date(123, 1, 25)));
        machine.addProduct(new Perishable("Молоко Василёк", 85, new Date(123, 1, 25)));


        System.out.println(machine);
        System.out.println("__________________________________");
        System.out.println(machine.findProduct("Молоко"));
        System.out.println(machine.findProduct("Алёнка"));
        System.out.println(machine.findProduct("Пиво"));
        System.out.println("__________________________________");
        System.out.println("продан: " + machine.sellProduct(machine.findProduct("Twix").get(0)));
        System.out.println("__________________________________");
        System.out.println(machine);
//        System.out.println((new Date(123,2,25) + " " + new Date(123,1,25)));
//        System.out.println(machine.overdueProduct(new Date(123,2,25),new Date(123,1,25)));


    }
}