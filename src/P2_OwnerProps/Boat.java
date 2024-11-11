package P2_OwnerProps;

public class Boat extends Prop {
    private float lenght;
    private boolean navigable;

    public Boat(String id, String adress, String city, float lenght){
        super(id, adress, city);
        this.lenght = lenght;
        this.navigable = true;
    }

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    public void setNavigable(boolean navigable) {
        this.navigable = navigable;
    }

    public float getLenght() {
        return lenght;
    }

    public boolean isNavigable() {
        return navigable;
    }
}
