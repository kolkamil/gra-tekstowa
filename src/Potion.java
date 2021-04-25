public class Potion {
    private String potionName;
    private int potionValue;

    public Potion(String potionName, int potionValue) {
        this.potionName = potionName;
        this.potionValue = potionValue;
    }

    public void setPotionName(String potionName) {
        this.potionName = potionName;
    }

    public String getPotionName() {
        return potionName;
    }

    public void setPotionValue(int potionValue) {
        this.potionValue = potionValue;
    }

    public int getPotionValue() {
        return potionValue;
    }


}
