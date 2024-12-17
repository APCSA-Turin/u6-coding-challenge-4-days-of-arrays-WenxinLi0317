package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        private String name;
        private int speed;
        private int runDuration;
        private int restDuration;
        private int distanceTraveled = 0;
        private int timeLeftInRun;  
    private int timeLeftInRest;
    private boolean isRunning;


        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name=name;
            this.speed=speed;
            this.runDuration=runDuration;
            this.restDuration=restDuration;
            this.timeLeftInRun = runDuration;
            this.timeLeftInRest = 0;
            this.isRunning = true; 
        }

        public int getDistanceTraveled(){ 
            return distanceTraveled;
        }

        public String getName(){
            return name;
        }
        

        public void simulateSecond() {
            if (isRunning) {
             
                distanceTraveled += speed;
                timeLeftInRun--;  

                if (timeLeftInRun == 0) {
                    isRunning = false;  
                    timeLeftInRest = restDuration;
                }
            } else {
               
                timeLeftInRest--; 

                if (timeLeftInRest == 0) {
                    isRunning = true;  
                    timeLeftInRun = runDuration; 
                }
            }
        }
    }

    public static String simulateRace(int time, Reindeer[] reindeers){ 
        //you will be tested on this method
        for (int t = 0; t < time; t++) {
            for (int i = 0; i < reindeers.length; i++) {
                reindeers[i].simulateSecond();  
            }
        }

        String name = "";
    int num = 0;
    int max = 0;
    for (int i = 0; i < reindeers.length; i++) {  
        num = reindeers[i].getDistanceTraveled();
        if (num > max) {
            max = num;
            name = reindeers[i].getName();
        }
    }
    return name;
    }

    
    public static void main(String[] args) { // for testing purposed

    }

 
}




