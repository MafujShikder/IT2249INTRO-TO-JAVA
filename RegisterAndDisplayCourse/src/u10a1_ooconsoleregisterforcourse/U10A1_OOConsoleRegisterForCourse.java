/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u10a1_ooconsoleregisterforcourse;

import java.util.Scanner;

/**
 *
 * @author omora
 */
public class U10A1_OOConsoleRegisterForCourse {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Teacher's Copy");

        Scanner input = new Scanner(System.in);
        
        //Courses is an array of course objects
        //see the Course.java source code for members of Course
        Course[] courses = {
            new Course("IT1006", 6),
            new Course("IT4782", 3),
            new Course("IT4789", 3),
            new Course("IT4079", 6),
            new Course("IT2230", 3),
            new Course("IT3345", 3),
            new Course("IT2249", 6)
        };
        

        //choice is the number selected by the user
        int choice;
        int totalCredit = 0;
        String yesOrNo = "";

       
        do {

            choice = getChoice(courses, input);
   
            switch (ValidateChoice(choice, totalCredit, courses)) {
                case -1:
                    System.out.println("**Invalid** - Your selection of " + 
                            choice + " is not a recognized course.");
                    break;
                case -2:
                    System.out.println("**Invalid** - You have already registerd for this " +
                            courses[choice-1].getCode() + " course.");
                    break;
                case -3:
                    System.out.println("**Invalid** - You can not register for more than 9 credit hours.");
                    break;
                case 0:
                    System.out.println("Registration Confirmed for course " +
                            courses[choice-1].getCode() );
                    totalCredit += courses[choice-1].getCreditHour();
                    courses[choice-1].setIsRegisteredFor(true);
                    break;
            }
            
            WriteCurrentRegistration(courses, totalCredit);
 
            System.out.print("\nDo you want to try again? (Y|N)? : ");
            
            yesOrNo = input.next().toUpperCase();
            
        } while (yesOrNo.equals("Y"));

        System.out.println("Thank you for registering with us");
    }

    //This method prints out the selection menu to the user in the form of
    //[selection number]Course Code (Course Credit Hours)
    //from the courses array one per line 
    //and then prompts the user to make a number selection
    public static int getChoice(Course[] courses, Scanner input) {    
        System.out.println("Please type the number inside the [] to register for a course");
        System.out.println("The number inside the () is the credit hours for the course");
        
        // TO DO
        // loop over the courses array and print out the attributes of its
        //objects in the format of 
        //[selection number]Course Code (Course Credit Hours)
        //one per line
        
        
       //Set the count variable  to 1 
      int count=1;
      //Loop through each object in the array
      for (Course selectCourse : courses) {
          //Output final values
          System.out.println("[" + count++ + "]" + selectCourse.getCode()+ "("  + selectCourse.getCreditHour() +")");
      }

        System.out.print("Enter your choice : "); 

        return (input.nextInt());
    }
    
    //This method validates the user menu selection
    //against the given registration business rules
    //it returns the following code based on the validation result
    // -1 = invalid, unrecognized menu selection
    // -2 = invalid, alredy registered for the course
    // -3 = invalid, No more than 9 credit hours allowed
    // 0 = menu selection is valid

    public static int ValidateChoice(int choice, int totalCredit, Course[] courses) {
        if (choice < 1 || choice > 7)
            return -1;
        else if (IsRegisteredBefore(choice, courses) ) 
            return -2;
        else if ( (totalCredit + courses[choice-1].getCreditHour()) > 9)
            return -3;
        return 0;
    }
    
    //This method checks the courses array of course object to
    //see if the course has already been registered for or not
    public static boolean IsRegisteredBefore(int choice, Course[] courses) {
        for(int i = 0; i < courses.length; i++)
            if(courses[choice-1].getIsRegisteredFor() == true){
                 return true;
            }
               
        return false;
    }
    
    //This method prints the current list of registered courses thus far
    //from the courses array separated by , and enclosed inside { }
    //It also prints the total credit registered for thus far
    public static void WriteCurrentRegistration(Course[] courses, int totalCredit) {

        System.out.print("Current course registration:  { " ); 
        
        // TO DO
        // loop over the courses array, determine which courses are registered
        //for thus and print them out in the format of
        //{ list of courses separated by , }
        
        StringBuilder stringWithCommas = new StringBuilder();
         
          for (Course StringValue : courses) {
             
          //Output final values
          if(StringValue.getIsRegisteredFor()==true){
           
            StringValue.getCode().split(" ");
            
           // append number to the string in the StringBuilder
            stringWithCommas.append(StringValue.getCode());
 
            // append comma and space after each number
            stringWithCommas.append(", ");
         
           
          }
          
          
       } 
          
         
        stringWithCommas.delete(stringWithCommas.length() -2, stringWithCommas.length());
        // Convert content of StringBuilder to string for display
        System.out.print(stringWithCommas.toString());
 
        System.out.println(" }" );     

        System.out.println("Current registration total credit = " + totalCredit);
    }
    
}