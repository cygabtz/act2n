package marato;

public class Runner {
    private String name;
    private String team;
    private String[] raceIDs;
    private float[]  times;
    private int numRaces;
    private boolean professional;

    public Runner(String name){
        this.name = name;
        this.team = "sense equip";
        this.raceIDs = new String[5];
        this.times = new float[5];
        this.numRaces = 0;
        this.professional = false;
    }
    public Runner(String name, String team, boolean professional){
        this.name = name;
        this.team = team;
        this.raceIDs = new String[5];
        this.times = new float[5];
        this.numRaces = 0;
        this.professional = professional;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setNumRaces(int numRaces) {
        this.numRaces = numRaces;
    }

    public void setProfessional(boolean professional) {
        this.professional = professional;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public String[] getRaceIDs() {
        return raceIDs;
    }

    public float[] getTimes() {
        return times;
    }

    public int getNumRaces() {
        return numRaces;
    }

    public boolean isProfessional() {
        return professional;
    }

    public void addRace(String raceID){
        if(numRaces<5){
            this.raceIDs[numRaces] = raceID;
            numRaces++;
        }
        else {
            System.out.println("Màxim esgotat de carreres.");
        }
    }

    public void addTime(float time){
        if(numRaces<5){
            this.times[numRaces-1] = time;
        }
        else {
            System.out.println("Màxim esgotat de carreres.");
        }
    }

    public float bestTime(){
        float min = Float.MAX_VALUE;
        for(int i = 0; i<numRaces; i++){
            if (times[i]<min){
                min=this.times[i];
            }
        }
        return min;
    }

    public float averageTimes(){
        float sum = 0;
        if(numRaces==0){
            return 0;
        }
        else{
            for(int i = 0; i<numRaces; i++){
                sum+=this.times[i];
            }
            return sum/this.numRaces;
        }
    }

    public String bestRace(){
        float min = Float.MAX_VALUE;
        int minID = -1;
        for(int i = 0; i<numRaces; i++){
            if (times[i]<min){
                min=this.times[i];
                minID = i;
            }
        }
        return raceIDs[minID];
    }

}
