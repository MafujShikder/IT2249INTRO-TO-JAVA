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
public class Course {
    //Store the course value
    private  String course;
    //Store the Creddit vlaue
    private int creddit;
    //Create a constructor function to pass in arguments 
    public Course(String course, int creddit){
         /*Assign the two variables to the 
         Instance of the classs and pass in 
         the arugments from the constructor
         */
         this.course = course;
         this.creddit = creddit;
     }
     
   //get the returned course value
    public String getCoruse(){
        return course;
    }
    //get the returned creddit value
    public int getCode(){
        return creddit;
    }
        

}
            
           
              
        
    
    

        
         

