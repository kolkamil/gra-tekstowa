import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WeaponShop {
    Scanner scanner = new Scanner(System.in);
    String name;
    Set<String> item = new TreeSet<>();
    Item sword = new Item("Miecz ", 10, 50);
    Item knife = new Item("Nóż ", 3, 25);

    public void shopDisplayItems() {
        item.add(sword.toString());
        item.add(knife.toString());
        System.out.println("Przedmioty w sklepie: ");
        for (String item : item) {
            System.out.println(item);
        }
    }


//    public void itemBuy(int x, int y) {
//        System.out.println("1. MIECZ");
//        System.out.println("2. NOZ");
//        int choice = scanner.nextInt();
//        switch(choice){
//            case 1->{
//                System.out.println("Kupiłeś miecz");
//                x -= sword.getItemPrice();
//                System.out.println(x);
//
//                y += sword.getAttackValue();
//                System.out.println(y);
//            }
//            case 2 -> System.out.println("nic");
//
//        }
//    }

//    public void buyWeapon(int playerGold) {
//        System.out.println("Wpisz nazwę broni, którą chcesz kupić");
//        String userChoice = scanner.nextLine();
//
//        switch (userChoice) {
//            case "Miecz", "miecz" -> {
//                playerGold -= sword.getItemPrice();
//                item.remove(sword.toString());
////                addPlayerAttack =+10;
//            }
//            case "Nóż", "nóż", "Noz", "noz" ->{
//                playerGold -= knife.getItemPrice();
//                item.remove(knife.toString());
////                addPlayerAttack =- 3;
//            }
//        }
//    }
    }
