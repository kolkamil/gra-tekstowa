import java.util.Random;
import java.util.Scanner;

public class Game {
    Random generator = new Random();
    Player player = new Player(100, 10);
    Monster monster = new Monster("Troll", 100,10);
    boolean shouldContinue = true;
    Scanner scanner = new Scanner(System.in);


    public void introduceYourself() {
        player.introduceYourself();
    }

    public void gameMenu() {
        while (shouldContinue) {
            System.out.println("1.Sprawdź ilość swojego HP");
            System.out.println("2.Fight");
            System.out.println("3.Sprawdź wartość swojego ataku");
            System.out.println("4. Wyjdź");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> player.displayNameAndHp();
                case 2 -> fight();
                case 3 -> System.out.println("Wartość twojego ataku: " + player.getPlayerAttack());
                case 4 -> shouldContinue = false;
            }
        }
    }

    public void fight() {
        System.out.println("Spotykasz na swojej drodze trolla. Walka!");

        while (player.getPlayerHp() >= 0 && monster.getMonsterHp() >= 0) {
            player.setPlayerAttack(generator.nextInt(10));
            System.out.println("Atak playera " + player.getPlayerAttack());
            String fightResult = "Hp gracza " + player.playerHp + " " + "Hp monstera " + monster.getMonsterHp();
            System.out.println(fightResult);
            player.fight(monster.getMonsterAttack());
            monster.fight(player.getPlayerAttack());
        }
    }



}

// Klasa Game zawierać będzie obiekty innych klas, w których będą się "Spotykać"