import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WeaponShop {
    Scanner scanner = new Scanner(System.in);
    String name;
    Set<String> item = new TreeSet<>();
    Item sword = new Item("Miecz ", 10);
    Item knife = new Item("Nóż ", 3);

    public void shopMenu() {
        item.add(sword.toString());
        item.add(knife.toString());
        boolean shouldContinue = true;

        while (shouldContinue) {
            System.out.println("1.Wyświetl przedmioty w sklepie");
            System.out.println("2.Wyjdź ze sklepu");

            int userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1 -> {
                    for (String item : item) {
                        System.out.println(item);
                    }
                }
                case 2 -> shouldContinue = false;

            }


        }
    }


}
