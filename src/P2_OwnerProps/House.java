package P2_OwnerProps;

public class House extends Prop{
    private int numRooms;
    private boolean swimmingPool;

    public House(String id, String adress, String city, int numRoooms){
        super(id, adress, city);
        this.numRooms = numRoooms;
        this.swimmingPool = false;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public boolean isSwimmingPool() {
        return swimmingPool;
    }

    public void setNumRooms(int numRooms){
        this.numRooms = numRooms;
    }

    public void setSwimmingPool(boolean b){
        this.swimmingPool = b;
    }
}
