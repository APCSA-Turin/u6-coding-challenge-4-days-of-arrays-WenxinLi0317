
package com.example.project;
import java.util.Random;

public class Day2{
  public static String[][] nameSort(String[] names) {
    
    String[] niceList = new String[names.length];  // Max possible size
    String[] naughtyList = new String[names.length];  // Max possible size
    
    int niceCount = 0; 
    int naughtyCount = 0; 
    
    Random rand = new Random();
    
    
    for (int i = 0; i < names.length; i++) {
        if (rand.nextBoolean()) {  
            niceList[niceCount] = names[i];  
            niceCount++; 
        } else {
            naughtyList[naughtyCount] = names[i]; 
            naughtyCount++; 
        }
    }
    
    return new String[][] {niceList, naughtyList};
}

    public static void main(String[] args) {

    }
}
