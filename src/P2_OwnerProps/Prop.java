package P2_OwnerProps;

import java.util.Objects;

public class Prop {
    private String propID;
    private String adress;
    private String city;
    private float price;

    public Prop(String id, String adress, String city){
        this.propID = id;
        this.adress = adress;
        this.price = 0.0f;
    }

    public void setPropID(String propID) {
        this.propID = propID;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPropID() {
        return propID;
    }

    public String getAdress() {
        return adress;
    }

    public String getCity() {
        return city;
    }

    public float getPrice() {
        return price;
    }

    public boolean isCheaperThan(Prop other){
        return this.price < other.getPrice();
    }

    public boolean sameCity(Prop other){
        return this.city.equals(other.getCity());
    }
}
