import java.util.LinkedList;

public class Item {
    String itemName;

    int attackValue;

    public Item(String itemName, int attackValue) {
        this.itemName = itemName;
        this.attackValue = attackValue;
    }

    public String getItemName() {
        return itemName;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public String toString() {
        return getItemName() + getAttackValue();
    }


}
