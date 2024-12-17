package com.example.project;

public class Day3 
{
      public static String[][] generateSnowflake(int size) { //you will be tested on this method
        String[][] grid = new String[size][size];
       for (int i = 0; i < size; i++)      
       {
        for(int j = 0; j < size; j++)
        {
            grid[i][j]=" ";
          }
          
        }
        
        int middle = size / 2;

        for (int j = 0; j < size; j++) {
          
          grid[middle][j]="*";
      }

        for (int i = 0; i < size; i++) {
          
            grid[i][middle]="*";
        }

        

      for (int i = 0; i < size; i++) {
        grid[i][i] = "*";  
        grid[i][size - 1 - i] = "*"; 
    }

        return grid;
       }
       
      
// Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {
      
      
    
    }
    public static void main(String[] args) {
     
    }
  }

