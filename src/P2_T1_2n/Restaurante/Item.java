package P2_T1_2n.Restaurante;

public class Item {
    private String code; //código del pto.
    private String name;  //nombre del pto.
    private double price; //precio unidad antes impuestosç

    public Item(String c, String n, double p){
        this.code = c;
        this.name = n;
        this.price = p;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
