

import java.util.Arrays;
import java.util.Scanner;

public class mynote1
{
    public static void main(String[] args) 
    {
        //menu options
         System.out.println("Enter 1 to set the max number");

         System.out.println("Enter 2 to create a new node");

         System.out.println("Enter 3 to delete a note");

         System.out.println("Enter 4 to print the notes");

         System.out.println("Enter 5 to exit the program ");

         //user input
         Scanner user = new Scanner(System.in);
         
         int option = 0;
         
        //create an array 
         String[] array = new String[6];
         
         //read the option     
        while(option != 5)
        {
            System.out.println("Enter a number");

            option = user.nextInt();
            user.nextLine();
         //option 1 is maximum  number of the array
            if(option == 1) 
            { 
              System.out.println("Enter your new maximum number (int): " + array.length);
            }
            //option 2 is create a note

            else if(option == 2)
            {
                System.out.println("Enter the Note:");
                for(int i = 0; i < 6; i++)
                {
                    array[i] = user.nextLine();
                    
                }
            }
            //delete the any index number

            else if(option == 3)
            {

            //print the array 
             for(int i = 0; i < 6; i++)
               {
                  System.out.println("Note Number:[" + i + "] = " + array[i]);

               }
               //enter the user input choose the delete index number
               int indexToDelete = user.nextInt();
               user.nextLine();
               array[indexToDelete] = null;
               
            }
           //print the array list
            else if(option == 4)
            {
                System.out.println("print the strings:");
               for(int i = 0; i < 6; i++)
               {
                  System.out.println("Note Number:[" + i + "] = " + array[i]);
               }
                
            }
            //exit the program
            else if(option == 5)
            {
                System.out.println("Exit the program:");
                
            }
           //user can choose the correct number 
            else
            {
                System.out.println("Choose the correct number(1-5)");
            }
        }
    } 
}