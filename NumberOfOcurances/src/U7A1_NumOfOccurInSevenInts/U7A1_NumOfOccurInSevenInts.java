/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U7A1_NumOfOccurInSevenInts;

import java.util.Scanner;


import java.util.Scanner;

public class U7A1_NumOfOccurInSevenInts {
    
    
    public static void main(String[] args) {
        //Set the max value for the array
        final int Max_Input_Range = 7;
        //Set the array to hold 7 values
        int[] inputArray = new int[Max_Input_Range];
        
        //Set the max count value for the seconed array
        int max=0;
        
        //Prompt the user to enter 7 numbers
        System.out.print("Enter seven Numbers: ");
        
        //Declare user input method
        Scanner input = new Scanner(System.in);
        
        //Loop through the first array to get 7 input values
        //And set the max count to the value of the number of values enterd
        for(int i=0; i<inputArray.length; i++){
            int numbers = input.nextInt();
            inputArray[i] = numbers;
            //Check if the values in the first array are greater than 0;
            if(inputArray[i]>max){
                //Set the max count
                max = inputArray[i];
                
            }
        }
        
        //Create seconed array to hold the max amount of duplicate values
        //increment it plus one since arrays count from 0
        int[] count = new int[max+1];
        
        //Loop through seconed array
        for(int i=0; i<Max_Input_Range; i++){
            //Get the index of the first array to get the value from the seconed count array
            // Since the seconed count array holds the max of 7 values
            //It will hold 7 0's
            //When we search at the specific index using the first array
            //We get the zero at that index and increment by 1.
            count[inputArray[i]]++;
        }
        
        //Loop and print out final values
        for(int i=0; i<max+1;i++){
            if(count[i] >0 ){
                System.out.println("Number " + " " + i + " " + "Occurs " + count[i] + " " + "times");
            }
        }
    }
    
}
