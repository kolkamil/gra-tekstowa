import java.util.Scanner;

public class Player {
    private String playerName;
    private int playerHp;
    private int playerAttack;

    Scanner scanner = new Scanner(System.in);

    public Player(int playerHp, int playerAttack) {
        this.playerHp = playerHp;
        this.playerAttack = playerAttack;
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
