package marato;

public class Main {
    public static String bestProfessionalRunnerOfTeam(Team team){
        float minTime = Float.MAX_VALUE;
        String minName = "";
        for (int i = 0; i<team.getNumRunners(); i++){
            Runner r = team.getRunners()[i];
            if(r.isProfessional()){
                float time = r.bestTime();
                if(time < minTime){
                    minTime = time;
                    minName = r.getName();
                }
            }
        }
        return minName;
    }
    public static String bestTeam(Team[] teams){
        int index = -1;
        float minTime = Float.MAX_VALUE;
        for (int i = 0; i<teams.length; i++){
            if (teams[i].averageTimes() < minTime) {
                index = i;
            }
        }
        return teams[index].getName();
    }
    public Runner[] classifiedRunners(Race race, String idTeam){
        Runner[] classified = new Runner[race.getNumRunners()];
        int numClassified = 0;
        for(int i=0; i<race.getNumRunners(); i++){
            Runner runner = race.getRunners()[i];
            float time = race.getTimes()[i];
            if(time < race.getClassificationTime() && runner.getTeam()== idTeam){
                classified[numClassified] = runner;
                numClassified++;
            }
        }
        return classified;
    }

    public static boolean hasImproved(Runner r, Race[] races){
        float lastTime = Float.MAX_VALUE;

        for (int i = 0; i<races.length; i++){

            for (int nr = 0; nr<races[i].getNumRunners(); nr++){
                if(races[i].getRunners()[nr]==r){
                    float time = races[i].getTimes()[nr];
                    if (time > lastTime){
                        return false;
                    }
                    else{
                        lastTime = time;
                    }
                }
            }
        }

        return true;
    }

    public static boolean everClassified(Runner r, Race[] races){

        for (int i = 0; i<races.length; i++){
            for (int nr = 0; nr<races[i].getNumRunners(); nr++){
                if(races[i].getRunners()[nr]==r
                        && races[i].getTimes()[nr] > races[i].getClassificationTime()){
                        return false;
                }
            }
        }
        return true;
    }
    public static float averageRunners(Race[] races){
        float sum = 0;
        int totalRunners = 0;
        for (int i = 0; i<races.length; i++){
            sum+=races[i].getNumRunners();
            totalRunners++;
        }
        return sum/totalRunners;
    }
    public static float averageTimes(Race[] races){
        float sum = 0;
        for (int i = 0; i<races.length; i++){
            sum+=races[i].averageTimes();
        }
        return sum/races.length;
    }
    public String[] racesWhereWinnerIsNotProfessional(Race[] races){
        String[] racesNames = new String[races.length];
        int index = 0;

        for (int i = 0; i<races.length; i++){
            String bestRunnerName = races[i].bestRunner();

            //Checking in races[i].runners[]
            for (int j = 0; j<races[i].getNumRunners(); j++){
                Runner runner = races[i].getRunners()[j];

                if(runner.getName() == bestRunnerName && !runner.isProfessional()){
                    racesNames[index] = races[i].getRaceID();
                    index++;
                    break;
                }
            }

        }
        return racesNames;
    }
    public static void main(String[] args) {
        // Objectes de classe Runner
        Runner r1, r2;

        // Constructor(s) de la classe Runner
        r1 = new Runner("Paco");
        r2 = new Runner("Bel", "Maravillas", true);

        // Mètodes de la classe Runner
        r1.addRace("Palma");
        r1.addTime(12.5f);

        r1.addRace("Inca");
        r1.addTime(12.24f);

        System.out.printf("Millor carrera de %s va ser a %s amb temps %.2f. \n",
                r1.getName(), r1.bestRace(), r1.bestTime());


        // Objectes de la classe Team
        Team t1, t2;

        // Constructor(s) de la classe Team
        t1 = new Team("Equip A", true);
        t2 = new Team("Equip B", false);

        // Mètodes de la classe Team
        t1.addRunner(r1);
        t1.addRunner(r2);

        System.out.printf("Temps mig de l'equip %s és %.2f. \n", t1.getName(), t1.averageTimes());

        // Objectes de la classe Race
        Race c1, c2;

        // Constructor(s) de la classe Race
        c1 = new Race("Carrera 1", false, 12);

        // Mètodes de la classe Race
        c1.addRunner(r1);
        c1.addTimeToRunner(r1, 12.5f);

        c1.addRunner(r2);
        c1.addTimeToRunner(r2, 14.3f);

        System.out.printf("Millor corredor/a de la carrea %s és %s amb temps %.2f. \n",
                c1.getRaceID(), c1.bestRunner(), c1.bestTime());
    }
}
