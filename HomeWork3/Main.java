package HomeWork3;

//import trash.MyLinkedList;
import HomeWork3.List.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new List<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for (Integer item : list) {
            System.out.println(item);
        }
    }
}