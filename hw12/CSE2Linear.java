/* Soniet Berrios CSE2 hw12
This program will let the user input 15 grades and stores then in an array. It then uses binary search to search 
for a number inputted and then linear search to look for another number inputted. 

P.S. the directions for this homework were somewhat confusing so I did both a linear and a binary search because 
that is what was done in the sample output but in the directions it said linear.
*/
import java.util.Scanner;
public class CSE2Linear{
    public static void main(String[] args){
        int l=15;
        int[] grades= new int[l];
        Scanner myScanner= new Scanner( System.in );   
        System.out.print("Please enter 15 grades between 0-100 and in order from least to greatest.");
        int b=0;
        int x=0;
        //This checks to see if the array is correct
        for(int a=0; a<l;a++){
            if (myScanner.hasNextInt()) { // checking if input is an int
                grades[a]=myScanner.nextInt();
                if (grades[a]>=0 && grades[a]<=100) { //checking to see if input is between 0-100
                    if(grades[a] >= b){ //checking to see if input is in order from least to greatest
                     b=grades[x];   
                    }
                    else{
                    System.out.println("Error. Grades must be in order from least to greatest."); 
                    System.exit(1); //leaves program
                    }
                }
                else{
                System.out.println("Error. Grades must be between 0-100."); 
                System.exit(1); // leaves program
                }
                x++;
                
            }
            else{
            System.out.println("Error. All grades must be integers.");    
            System.exit(1); //leaves program
            }
        }
        
        //Prints sorted method 
         System.out.println("Sorted:");
         for(int y=0; y<grades.length; y++){
            System.out.print(grades[y]+" ");
        }
        
        //asks the user for input
        int findInt;
        while (true){
        System.out.print("Enter a grade to search for.");
            if(myScanner.hasNextInt()){  //checking to see if input is an int
            findInt=myScanner.nextInt();
            break; //leaves loop
            }
            else{
            System.out.println("Error. Please enter an integer.");
            }
        }
         binary(grades,findInt); //calls the binary method
         
        /*for(int y=0; y<grades.length; y++){
        System.out.print(grades[y]+" ");
        }*/
        
        //Scrambles the numbers in the method and then prints out the scrambled method
         scrambler(grades);
         System.out.println("Scrambled:");
         for(int y=0; y<grades.length; y++){
            System.out.print(grades[y]+" ");
        }      
        
        //asks user for input
        int look=0;
        while (true){
        System.out.print("Enter a grade to search for.");
            if(myScanner.hasNextInt()){
            look=myScanner.nextInt();
            break;
            }
            else{
            System.out.println("Error. Please enter an integer.");
            }
    }
         linear(grades,look); //calls linear method 
         
         
        
    }

public static void linear(int[] x, int look){ //linear method searches for a number by going through the whole array
    boolean foundIt=false;
    int i=1;
    for(int a=0; a<15;a++){
        if(x[a]==look){ //checks to see if the number is equal to a member of the array
        foundIt=true;
         break; 
        }
        else{
        i++; //counts the iterations
        }
        
    }
    
    if(foundIt==true){ //if the number was found print this
    System.out.println(look+" was found in the list with "+i+" iterations.");
    }
    else{ //if it wasnt found print this
    System.out.println(look+" was not found in the list with "+i+" iterations.");    
    }
}
    
public static void scrambler(int[] x){ //scrambles the members of the array
    for (int i=0; i<15; i++) {
    //find a random member to swap with
    int target = (int) (Math.random()*15 );

    //swap the values
    int temp = x[target];
    x[target] = x[i];
    x[i] = temp;
    }
    
}

    public static void binary(int[] x, int findInt){ //does binary search to look for the inputted number
        boolean foundIt=false;
        int l=x.length;
        int min=0;
        int max=l;
        int c=0;
        int a=(int)(l*.5); //half of the array
        int i=1;
        while(true){
            if(a==0){ //if a is 0 then it didnt find the number
                break;
            }
            if(x[a]==findInt){ // if it finds the value then foundIt becomes true
             foundIt=true;
             break;
            }
            if(x[a]>findInt){ //tries to find the number in the upper half of the array
             max=a;
             a=(max+min)/2;
             i++;
            }
            if(x[a]<findInt){ //tries to find the number in the lower half of the array
             min=a;
             a=(max+min)/2;
             i++;
            }
        }
        if(foundIt==true){ //if its found print this
        System.out.println(findInt+" was found in the list with "+i+" iterations.");
        }
        else{ //if its not found print this
        System.out.println(findInt+" was not found in the list with "+i+" iterations.");    
        }
    }
        
    
}