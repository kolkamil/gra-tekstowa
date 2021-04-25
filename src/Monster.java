public class Monster {
    private String monsterName;
    private int monsterHp;
    private int monsterAttack;

    public Monster(String monsterName, int monsterHp, int monsterAttack) {
        this.monsterName = monsterName;
        this.monsterHp = monsterHp;
        this.monsterAttack = monsterAttack;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterHp(int monsterHp) {
        this.monsterHp = monsterHp;
    }

    public int getMonsterHp() {
        return monsterHp;
    }

    public void setMonsterAttack(int monsterAttack) {
        this.monsterAttack = monsterAttack;
    }

    public int getMonsterAttack() {
        return monsterAttack;
    }

    public void fight(int playerAttack) {
        monsterHp -= playerAttack;
    }

}
