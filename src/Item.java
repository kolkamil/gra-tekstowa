import java.util.LinkedList;

public class Item {
    String itemName;
    int itemPrice;
    int attackValue;

    public Item(String itemName, int attackValue, int itemPrice) {
        this.itemName = itemName;
        this.attackValue = attackValue;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public String toString() {
        return getItemName() + "Wartość ataku " + getAttackValue() + " Cena: " + getItemPrice();
    }

}
