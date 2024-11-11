package marato;

public class Team {
    private String name;
    private Runner runners[];
    private int numRunners;
    private boolean international;

    public Team(String name, boolean international){
        this.name = name;
        this.runners = new Runner[5];
        this.numRunners = 0;
        this.international = international;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumRunners(int numRunners) {
        this.numRunners = numRunners;
    }

    public void setInternational(boolean international) {
        this.international = international;
    }

    public String getName() {
        return name;
    }

    public int getNumRunners() {
        return numRunners;
    }
    public Runner[] getRunners(){
        return this.runners;
    }

    public boolean isInternational() {
        return international;
    }

    public void addRunner(Runner runner){
        this.runners[numRunners] = runner;
        numRunners++;
    }

    public float averageTimes(){
        float sum = 0;
        if (numRunners==0){return 0;}
        else{
            for(int i = 0; i<numRunners; i++){
                sum+=this.runners[i].averageTimes();
            }
        }
        return sum/this.numRunners;
    }

    public int getNumProfessionals(){
        int num = 0;
        for(int i = 0; i<numRunners; i++){
            if(runners[i].isProfessional()){
                num++;
            }
        }
        return num;
    }

    public boolean areAllProfessional(){
        for (int i = 0; i<numRunners; i++){
            if (!runners[i].isProfessional()){
                return false;
            }
        }
        return true;
    }
}
