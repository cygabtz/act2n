package P2_OwnerProps;

public class Owner {
    private String name;
    private String adress;
    private Prop[] props;
    private int numProps;

    Owner(String name, String adress){
        this.name = name;
        this.adress = adress;
        props = new Prop[5];
        this.numProps = 0;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public Prop[] getProps() {
        return props;
    }

    public int getNumProps() {
        return numProps;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setProps(Prop[] props) {
        this.props = props;
    }

    public void setNumProps(int numProps) {
        this.numProps = numProps;
    }

    public void addProp(Prop p){
        this.props[numProps] = p;
        numProps++;
    }

    public float cheapestPrice(){
        float cheap = Float.MAX_VALUE;
        for (int i = 0; i<=numProps; i++){
            if (this.props[i].getPrice()<cheap){
                cheap = props[i].getPrice();
            }
        }
        return cheap;
    }

    public float expensivePrice(){
        float expensive = Float.MIN_VALUE;
        for (int i = 0; i<=numProps; i++){
            if (this.props[i].getPrice()>expensive){
                expensive = props[i].getPrice();
            }
        }
        return expensive;
    }

    public float averagePrices(){
        float sum = 0;
        for (int i = 0; i<numProps; i++){
            sum = props[i].getPrice();
        }
        return sum/numProps;
    }

    public String cheapestProp(){
        float cheap = Float.MAX_VALUE;
        int index = 0;

        for (int i = 0; i<=numProps; i++){
            if (this.props[i].getPrice()<cheap){
                cheap = props[i].getPrice();
                index = i;
            }
        }
        return props[index].getPropID();
    }

    public void sortPropsByPrice(){
        //Bubble Sort
        Prop temp;
        boolean isSorted = false;

        while (!isSorted){
            for (int i = 0; i<numProps; i++){
                isSorted = true;
                if (props[i].getPrice()>props[i+1].getPrice()){
                    temp = props[i];
                    props[i] = props[i+1];
                    props[i+1] = temp;
                    isSorted = false;
                }
            }
        }
    }

}
