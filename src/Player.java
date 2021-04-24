import java.util.Scanner;

public class Player {
    private String playerName;
    int playerHp;
    int playerAttack;

    public void setPlayerAttack(int playerAttack) {
        this.playerAttack = playerAttack;

    }

    Scanner scanner = new Scanner(System.in);

    public Player(int playerHp, int playerAttack) {
        this.playerHp = playerHp;
        this.playerAttack = playerAttack;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerHp() {
        return playerHp;
    }

    public int getPlayerAttack() {
        return playerAttack;
    }

    String introduceYourself() {
        System.out.println("Witaj poszukiwaczu, jak się nazywasz? ");
        playerName = scanner.nextLine();
        return playerName;
    }

    public void displayNameHpAttack() {
        System.out.println(getPlayerName() + " Twoje HP: " + getPlayerHp() + " Wartość ataku: " + getPlayerAttack() + "\n");
    }

    public void fight(int enemyAttack) {
        playerHp -= enemyAttack;
    }


}
