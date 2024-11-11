package P2_OwnerProps;

public class Main {
    static Owner [] allOwners;
    static int numOwners;
    static int numProps;
    public static void main(String[] args) {
        allOwners = new Owner[5];

    }

    public static void addOwner(Owner owner){
        allOwners[numOwners] = owner;
        numOwners++;
    }

    public static void addProp(String ownerId, Prop prop){
        for (int i = 0; i<numOwners; i++){
            if (allOwners[i].getName().equals(ownerId)){
                allOwners[i].addProp(prop);
                break;
            }
        }
    }

    public static int numPropsInCity(Owner[] owners, String city){
        int num = 0;
        for (int i = 0; i<numOwners; i++){
            for (int j = 0; j<allOwners[i].getNumProps(); j++){
                if (allOwners[i].getProps()[j].getCity().equals(city)){
                    num++;
                }
            }
        }
        return num;
    }

    public static String ownerCheapestProp(Owner[] owners){
        float cheapestValue = Float.MIN_VALUE;
        String cheapestProp = "";
        for (int i = 0; i<numOwners; i++){
            allOwners[i].sortPropsByPrice();

            float ownerPrice = allOwners[i].getProps()[1].getPrice();
            if (ownerPrice < cheapestValue){
                cheapestValue = ownerPrice;
                cheapestProp = allOwners[i].getName();
            }
        }
        return cheapestProp;
    }

    public static float extendPrices(Owner[] owners){
        float cheapest = Float.MAX_VALUE;
        float expensiest = Float.MIN_VALUE;

        for (int i = 0; i<numOwners; i++){
            if (allOwners[i].cheapestPrice() < cheapest){
                cheapest = allOwners[i].cheapestPrice();
            }
            if (allOwners[i].expensivePrice() > expensiest){
                expensiest = allOwners[i].expensivePrice();
            }
        }
        return (expensiest - cheapest);
    }

    public static int numHouseWithPool(Owner[] owners){
        return 1;
    }

}
