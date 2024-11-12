package P2_OwnerProps;

public class Main {
    static Owner [] allOwners;
    static int numOwners;
    static int numProps;
    public static void main(String[] args) {
        allOwners = new Owner[5];
        test();
    }
    public static void test(){
        House h1 = new House("H1", "Major 1", "Manacor", 3);
        House h2 = new House("H2", "Principal 23", "Palma", 4);

        h1.setPrice(3000);
        h2.setPrice(1500);

        Boat b1 = new Boat("B1", "Moll 15", "Palma", 2.5f);
        Boat b2 = new Boat("B2", "Moll 13", "Palma", 4.0f);

        b1.setPrice(300);
        b2.setPrice(2000);

        Owner p1 = new Owner("Paco", "Major 1, Manacor");
        Owner p2 = new Owner("Bel", "Principal 23, Palma");

        addOwner(p1);
        addOwner(p2);

        addProp("Paco", h1);
        addProp("Paco", b2);

        addProp("Bel", b1);
        addProp("Bel", h2);

        int numPalma = numPropsInCity(allOwners, "Palma");
        System.out.printf("%d props in %s. \n", numPalma, "Palma");

        String name = ownerCheapestProp(allOwners);
        System.out.printf("Owner cheapest prop: %s. \n", name);

        float extend = extendPrices (allOwners);
        System.out.printf("Extend prices: %f. \n", extend);

        int numBoats = numBoatsMinLength(3.0f, allOwners);
        System.out.printf("%d Boats larger than %f. \n", numBoats, 3.0f);

        int numPools = numHousesWithPool (allOwners);
        System.out.printf("%d Pools. \n", numPools);
    }

    public static void addOwner(Owner owner){
        allOwners[numOwners] = owner;
        numOwners++;
    }

    public static void addProp(String ownerId, Prop prop){
        for (int i = 0; i<numOwners; i++){
            if (allOwners[i].getName().equals(ownerId)){
                allOwners[i].addProp(prop);
                System.out.println("Added prop "+ prop.getPropID()+ " to owner "+ownerId);
                break;
            }
        }
    }

    public static int numPropsInCity(Owner[] owners, String city){
        int num = 0;
        for (int i = 0; i<owners.length; i++){
            if(owners[i]!=null) {
                for (int j = 0; j < owners[i].getNumProps(); j++) {
                    if (owners[i].getProps()[j].getCity().equals(city)) {
                        num++;
                    }
                }
            }
        }
        return num;
    }

    public static String ownerCheapestProp(Owner[] owners){
        float minPrice = Float.MAX_VALUE;
        String ownerName = "";
        for (int i = 0; i<owners.length; i++){
            Owner owner = owners[i];

            if (owner!=null){
                if (owner.cheapestPrice() < minPrice){
                    minPrice = owner.cheapestPrice();
                    ownerName = owners[i].getName();
                }
            }
        }
        return ownerName;
    }

    public static float extendPrices(Owner[] owners){
        float minPrice = Float.MAX_VALUE;
        float maxPrice = Float.MIN_VALUE;

        for (int i = 0; i<owners.length; i++){
            Owner owner = owners[i];
            if (owner!=null){
                if (owner.cheapestPrice() < minPrice){
                    minPrice = allOwners[i].cheapestPrice();
                }
                if (owner.expensivePrice() > maxPrice){
                    maxPrice = allOwners[i].expensivePrice();
                }
            }

        }
        return (maxPrice - minPrice);
    }

    public static int numBoatsMinLength(float min, Owner[] owners){
        int total = 0;

        for (int i = 0; i<owners.length; i++){
            Owner owner = owners[i];
            if (owner!=null){
                for (int j = 0; j<owner.getNumProps(); j++){
                    //Checks if Prop is a Boat and instances a Boat
                    if (owner.getProps()[j] instanceof Boat boat){
                        if (boat.getLenght() >= min){
                            total++;
                        }
                    }

                }
            }
        }
        return total;
    }

    public static int numHousesWithPool(Owner[] owners){
        int total = 0;

        for (int i = 0; i<owners.length; i++){
            Owner owner = owners[i];
            if (owner!=null){
                for (int j = 0; j<owner.getNumProps(); j++){

                    if (owner.getProps()[j] instanceof House house){
                        if (house.isSwimmingPool()){
                            total++;
                        }
                    }
                }
            }
        }

        return total;
    }

}
