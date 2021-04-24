import java.util.Random;
import java.util.Scanner;

public class Game {
    Random generator = new Random();
    Player player = new Player(100, 10);
    Monster monster = new Monster("Troll", 100, 8);
    boolean shouldContinue = true;
    Scanner scanner = new Scanner(System.in);
    Potion hpPotion = new Potion("HP Potion", 10);


    public void introduceYourself() {
        player.introduceYourself();
    }

    public void gameMenu() {
        while (shouldContinue) {
            System.out.println("1.Sprawdź ilość swojego HP i wartość ataku");
            System.out.println("2.Fight");
            System.out.println("3.Wypij miksturę HP");
            System.out.println("4.Wyjdź");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> player.displayNameHpAttack();
                case 2 -> fight();
                case 3 -> drinkPotion();
                case 4 -> shouldContinue = false;
            }
        }
    }

    public void fight() {
        System.out.println("Spotykasz na swojej drodze trolla. Walka!");
        while (player.getPlayerHp() >= 0 && monster.getMonsterHp() >= 0) {
            player.setPlayerAttack(generator.nextInt(10));
            monster.setMonsterAttack(generator.nextInt(8));
            System.out.println("Atak playera " + player.getPlayerAttack() + " Atak monstera " + monster.getMonsterAttack());
            String fightResult = "Hp gracza " + player.playerHp + " " + "Hp monstera " + monster.getMonsterHp();
            System.out.println(fightResult);
            player.fight(monster.getMonsterAttack());
            monster.fight(player.getPlayerAttack());
            if (monster.getMonsterHp() <= 0) {
                System.out.println("Pokonałeś potwora!");
            }
            if (player.getPlayerHp() <= 0) {
                System.out.println("Zostałeś pokonany!");
            }
        }
    }

    public void drinkPotion(){
        player.drinkPotion(hpPotion.getPotionValue());
        System.out.println("Twoje HP po wypiciu mikstury to: " + player.getPlayerHp());
    }


}



// Klasa Game zawierać będzie obiekty innych klas, w których będą się "Spotykać"