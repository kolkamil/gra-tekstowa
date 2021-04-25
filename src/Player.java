import java.util.Scanner;

public class Player {
    private String playerName;
    private int playerHp;
    private int playerAttack;
    private int playerGold;


    Scanner scanner = new Scanner(System.in);

    public Player(int playerHp, int playerAttack, int playerGold) {
        this.playerHp = playerHp;
        this.playerAttack = playerAttack;
        this.playerGold = playerGold;
    }

    public void setPlayerAttack(int playerAttack) {
        this.playerAttack = playerAttack;

    }

    public int getPlayerAttack() {
        return playerAttack;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerHp() {
        return playerHp;
    }

    public int getPlayerGold() {
        return playerGold;
    }

    public void setPlayerGold(int playerGold) {
        this.playerGold = playerGold;
    }

    public void displayNameHpAttack() {
        System.out.println(getPlayerName() + " Twoje HP: " + getPlayerHp() + " Wartość ataku: " + getPlayerAttack() + "\n");
    }

    String introduceYourself() {
        System.out.println("Witaj poszukiwaczu, jak się nazywasz? ");
        playerName = scanner.nextLine();
        return playerName;
    }

    public void fight(int enemyAttack) {
        playerHp -= enemyAttack;
    }

    public void drinkPotion(int potion) {
        playerHp += potion;
    }


}
