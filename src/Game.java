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

    public void gameStart() {
        while (shouldContinue) {
            System.out.println("1.Sprawdź ilość swojego HP, wartość ataku oraz stan złota");
            System.out.println("2.Przygoda");
            System.out.println("3.Wypij miksturę HP");
            System.out.println("4.Wyjdź");
            String userChoice = scanner.nextLine();

            switch (userChoice) {
                case "1" -> player.displayPlayerInformation();
                case "2" -> chooseLocation();
                case "3" -> drinkPotion();
                case "4" -> shouldContinue = false;

            }
        }
    }

    public void itemBuy() {
        System.out.println("1. MIECZ");
        System.out.println("2. Nóż");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1" -> {
                if (player.getPlayerGold() > 0) {
                    System.out.println("Kupiłeś miecz");
                    player.buyItem(weaponShop.sword.getItemPrice(), weaponShop.sword.getAttackValue());
                } else
                    System.out.println("Masz za mało złota!");
            }
            case "2" -> {
                System.out.println("Kupiłeś nóż");
                player.buyItem(weaponShop.knife.getItemPrice(), weaponShop.knife.getAttackValue());
            }
        }
    }

    public void fight(Monster m, Player p, int playerAttack, int monsterAttack) { //wzór dla wszystkich nowych obiektów do przeprowadzenia walki
        if (m.getMonsterHp() >= 0) {
            System.out.println("Spotykasz na swojej drodze " + m.getMonsterName() + ". Walka!");
            while (m.getMonsterHp() >= 0 && p.getPlayerHp() >= 0) {
                p.setPlayerAttack(generator.nextInt(playerAttack));
                m.setMonsterAttack(generator.nextInt(monsterAttack));
                p.fight(m.getMonsterAttack());
                m.fight(p.getPlayerAttack());
                m.monsterIsDead();
                p.playerIsDead();
                String attackValues = "Atak playera " + p.getPlayerAttack() + " Atak monstera " + m.getMonsterAttack();
                String fightResult = "Hp gracza " + p.getPlayerHp() + " Hp monstera " + m.getMonsterHp();
                System.out.println(fightResult);
                System.out.println(attackValues);
            }
        } else {
            System.out.println(m.getMonsterName() + " już nie żyje!");
        }
    }

    public void chooseLocation() {
        Monster[] monsterTable = new Monster[3];
        monsterTable[0] = new Monster("Gnom", 31, 5);
        monsterTable[1] = new Monster("Skrzat", 100, 2);
        monsterTable[2] = new Monster("Szkielet", 100, 1);
        System.out.println("Wybierz gdzie chcesz iść");
        System.out.println("1.Miasto");
        System.out.println("2.Lochy");
        String userChoice = scanner.nextLine();
        switch (userChoice) {
            case "1" -> {
                System.out.println("Wchodzisz do miasta.");
                System.out.println("1.Sklep\n2.Wyjdź");
                String userChoiceCity = scanner.nextLine();
                switch (userChoiceCity) {
                    case "1" -> itemBuy();
                    case "2" -> chooseLocation();
                }
            }
            case "2" -> {
                System.out.println("Wchodzisz do lochów. W oddali widzisz zamazaną sylwetkę\n1.Podejdź\n2.Wyjdź z lochów");
                String userChoiceDungeon = scanner.nextLine();
                switch (userChoiceDungeon) {
                    case "1" -> fight(monster, player, player.getPlayerAttack(), monster.getMonsterAttack());
                    case "2" -> chooseLocation();
                }
            }
        }
    }


}

// Klasa Game zawierać będzie obiekty innych klas, w których będą się "Spotykać"