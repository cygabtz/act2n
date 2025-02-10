package P2_T1_2n.Restaurante;

public class FoodItem {

    private String itemCode;
    private int quantity;

    public FoodItem(String x, int y) {
        itemCode = x;
        quantity = y;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
