import java.util.Random;
import java.util.Scanner;

public class Game {
    Player player = new Player(100, 10, 100);
    Monster monster = new Monster("Troll", 100, 8);
    Potion hpPotion = new Potion("HP Potion", 10);
    WeaponShop weaponShop = new WeaponShop();
    Scanner scanner = new Scanner(System.in);
    Random generator = new Random();
    boolean shouldContinue = true;

    public void introduceYourself() {
        player.introduceYourself();
    }

    public void drinkPotion() {
        player.drinkPotion(hpPotion.getPotionValue());
        System.out.println("Twoje HP po wypiciu mikstury to: " + player.getPlayerHp());
    }

    public void gameMenu() {
        while (shouldContinue) {
            System.out.println("1.Sprawdź ilość swojego HP, wartość ataku oraz stan złota");
            System.out.println("2.Walka");
            System.out.println("3.Wypij miksturę HP");
            System.out.println("4.Odwiedź sklep");
            System.out.println("5.Wyjdź");
            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> player.displayPlayerInformation();
                case 2 -> fight();
                case 3 -> drinkPotion();
                case 4 -> {
                    weaponShop.shopDisplayItems();
                    itemBuy();
                }
                case 5 -> shouldContinue = false;
            }
        }
    }

    public void itemBuy() {
        System.out.println("1. MIECZ");
        System.out.println("2. Nóż");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                if (player.getPlayerGold() > 0) {
                    System.out.println("Kupiłeś miecz");
                    player.buyItem(weaponShop.sword.getItemPrice(), weaponShop.sword.getAttackValue());
                } else
                    System.out.println("Masz za mało złota!");
            }
            case 2 -> {
                System.out.println("Kupiłeś nóż");
                player.buyItem(weaponShop.knife.getItemPrice(), weaponShop.knife.getAttackValue());
            }
        }
    }

    public void fight() {
        if (monster.getMonsterHp() >= 0) {

            System.out.println("Spotykasz na swojej drodze trolla. Walka!");
            while (player.getPlayerHp() >= 0 && monster.getMonsterHp() >= 0) {
                player.setPlayerAttack(generator.nextInt(10));
                monster.setMonsterAttack(generator.nextInt(8));
                String attackValues = ("Atak playera " + player.getPlayerAttack() + " Atak monstera " + monster.getMonsterAttack());
                String fightResult = "Hp gracza " + player.getPlayerHp() + " Hp monstera " + monster.getMonsterHp();
                System.out.println(fightResult);
                System.out.println(attackValues);
                player.fight(monster.getMonsterAttack());
                monster.fight(player.getPlayerAttack());
                if (monster.getMonsterHp() <= 0) {
                    System.out.println("Pokonałeś potwora!");
                }
                if (player.getPlayerHp() <= 0) {
                    System.out.println("Zostałeś pokonany!");
                }
            }
        } else {
            System.out.println(monster.getMonsterName() + " już nie żyje!");
        }
    }
}

// Klasa Game zawierać będzie obiekty innych klas, w których będą się "Spotykać"