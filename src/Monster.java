public class Monster {
    public String monsterName;
    public int monsterHp;
    public int monsterAttack;

    public Monster(String monsterName, int monsterHp, int monsterAttack) {
        this.monsterName = monsterName;
        this.monsterHp = monsterHp;
        this.monsterAttack = monsterAttack;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public int getMonsterHp() {
        return monsterHp;
    }

    public int getMonsterAttack() {
        return monsterAttack;
    }

    public void fight(int playerAttack){
        monsterHp-=playerAttack;
    }

}
