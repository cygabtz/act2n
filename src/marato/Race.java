package marato;

public class Race {
    private String raceID;
    private Runner[] runners;
    private float[] times;
    private boolean isFinals;
    private int numRunners;
    private float classificationTime; //Minimum time to qualify

    public Race(String raceID){
        this.raceID = raceID;
        this.runners = new Runner[8];
        this.times = new float[8];
    }
    public Race(String raceID, boolean isFinal, float clasTime){
        this(raceID);//Calls the first contructor
        this.isFinals = isFinal;
        this.numRunners = 0;
        this.classificationTime = clasTime;
    }

    public void setRaceID(String raceID) {
        this.raceID = raceID;
    }

    public void setFinals(boolean finals) {
        isFinals = finals;
    }

    public void setClassificationTime(float classificationTime) {
        this.classificationTime = classificationTime;
    }

    public String getRaceID() {
        return raceID;
    }

    public Runner[] getRunners(){
        return this.runners;
    }
    public float[] getTimes(){
        return times;
    }

    public boolean isFinals() {
        return isFinals;
    }

    public int getNumRunners() {
        return numRunners;
    }

    public float getClassificationTime() {
        return classificationTime;
    }

    public void addRunner(Runner runner){
        this.runners[numRunners] = runner;
        numRunners++;
    }

    public void addTimeToRunner(Runner runner, float time){
        for(int i = 0; i<numRunners; i++) {
            if (runners[i]==runner){
                times[i] = time;
                break;
            }
        }
    }
    public float bestTime(){
        float minTime = Float.MAX_VALUE;
        for(int i = 0; i<numRunners; i++){
            if (this.times[i]<minTime){
                minTime=this.times[i];
            }
        }
        return minTime;
    }
    public String bestRunner(){
        float min = Float.MAX_VALUE;
        int minRunner = -1;
        for(int i = 0; i<numRunners; i++){
            if (this.times[i]<min){
                min=this.times[i];
                minRunner = i;
            }
        }
        return runners[minRunner].getName();
    }
    public float averageTimes(){
        float sum = 0;
        if(numRunners==0){return 0;}
        else {
            for(int i = 0; i<numRunners; i++){
                sum+=this.times[i];
            }
            return sum/this.numRunners;
        }
    }
    public float worstTime(){
        float maxTime = 0;
        for(int i = 0; i<numRunners; i++){
            if (this.times[i]>maxTime){
                maxTime=this.times[i];
            }
        }
        return maxTime;
    }
    public float differenceBestFromWorst(){
        return worstTime() - bestTime();
    }

}
