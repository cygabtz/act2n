package P2_T1_2n.Restaurante;

public class Payment {
    private FoodItem[] fi = new FoodItem[100];
    private int fiCount;
    private static double foodTax = 0.2;
    // 20% de impuestos se agrega a todos los precios de comidas

    private DrinkItem[] di = new DrinkItem[100];
    private int diCount;
    private static double drinkTax = 0.1;
    // 10% de impuestos se agrega a todos los precios de bebidas

    Item[] pl = new Item[200];

    public Payment() {
        fiCount = 0;
        diCount = 0;
    }

    //SETTERS AND GETTERS
    public FoodItem[] getFi() {
        return fi;
    }

    public void setFi(FoodItem[] fi) {
        this.fi = fi;
    }

    public int getFiCount() {
        return fiCount;
    }

    public void setFiCount(int fiCount) {
        this.fiCount = fiCount;
    }

    public static double getFoodTax() {
        return foodTax;
    }

    public static void setFoodTax(double foodTax) {
        Payment.foodTax = foodTax;
    }

    public DrinkItem[] getDi() {
        return di;
    }

    public void setDi(DrinkItem[] di) {
        this.di = di;
    }

    public int getDiCount() {
        return diCount;
    }

    public void setDiCount(int diCount) {
        this.diCount = diCount;
    }

    public static double getDrinkTax() {
        return drinkTax;
    }

    public static void setDrinkTax(double drinkTax) {
        Payment.drinkTax = drinkTax;
    }

    //OTHERS

    public DrinkItem getDi(int x) {
        return di[x];
    }

    public void addFoodItem(FoodItem item){
        this.fi[fiCount] = item;
        fiCount++;
    }

    public void addDrinkItem(DrinkItem item){
        this.di[diCount] = item;
        diCount++;
    }

    public static double findPrice( Item[ ] pl, String c ) {
        for (int i = 0; i < pl.length; i++) {
            if (pl[i].getCode() == c) {
                return pl[i].getPrice();
            }
        }
        return 0; //?
    }

        // calculateBill() – Este método devuelve la cuenta (el valor total de
    // los artículos consumidos por una mesa en particular)
}
