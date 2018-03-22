/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclassweek9;

/**
 *
 * @author alexgwartney
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       //Set the array of objects to hold 7 values      
       Course[] name = new Course[7];
       
        //Output the instructions to the user 
        System.out.println(
                "Course Objects each have a code (e.g IT1006) and credit hours (e.g. 6)." + "\n"
                + "The number inside the [] is the display order number." + "\n"
                +  "The number inside the () is the credit  hours for the course." + "\n"); 
       
       //set and create new course objects and store into each array index
       name[0] = new Course( "IT1006", 6);
       name[1] =  new Course( "IT4782",3);
       name[2] = new Course( "IT4789", 7);
       name[3] = new Course( "IT4079", 6);
       name[4] = new Course( "IT2230",  3);
       name[5] = new Course( "IT3345", 3);
       name[6] = new Course( "IT2249", 8);
      
       //Set the count variable  to 1 
      int count=1;
      //Loop through each object in the array
      for (Course a : name) {
          //Output final values
          System.out.println("[" + count++ + "]" + a.getCoruse() + "("  + a.getCode() +")");
      }
      
      
      
      
       
      
      
       
       
       
       
       
       
      
      
      
      
      
      
      
      
      
      
   
   
   
   
   
   
 
 
 
 
 
 
 
 
 
   
 
 
    }
    
         }


  


