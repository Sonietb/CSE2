//Soniet Berrios CSE2 HW13 
//This code is a start at understanding the concepts of holoportation
import java.util.Scanner;
public class Holoportation{
    public static void main(String[] args){
    String[][][] firstarray=soRandom(); //makes the array
    print(firstarray); //calls the print method
    String[][][] secarray=soRandom(); //makes the second array
    secarray=holoport(firstarray,secarray); //calls holoport
    System.out.println("secarray");
    print(secarray);
    Scanner myScanner= new Scanner( System.in ); 
    String search="";
    while(true){ //checking to see if the input is valid
    System.out.print("Enter a valid input to search for in the form XXYYYY: ");
    search=myScanner.next();
    if(Character.isLetter(search.charAt(0))==true){// if its a letter then good
        if(Character.isLetter(search.charAt(1))==true){
            if(Character.isDigit(search.charAt(2))==true){//if its a number then good
                if(Character.isDigit(search.charAt(3))==true){
                    if(Character.isDigit(search.charAt(4))==true){
                        if(Character.isDigit(search.charAt(5))==true){
                         break;   
                        }
                        else{
                        System.out.println("nope");
                         myScanner.nextLine();
                        }
                    }
                    else{
                        System.out.println("nope");
                         myScanner.nextLine();
                        }
                    
                }
                else{
                System.out.println("nope");
                myScanner.nextLine();
                }
            }
            else{
            System.out.println("nope");
            myScanner.nextLine();
            }
        }
        else{
        System.out.println("nope");
        myScanner.nextLine();
        }
    }
    else{
    System.out.println("nope");
    myScanner.nextLine();
    }
    }
    sampling(secarray,search); //calling sampling method
    percentage(firstarray,secarray); //calling percentage method
    frankenstein(firstarray);   //calling frankenstein method
    System.out.println("Sorted Frankenstein");
    print(firstarray);
    
    }
    
    public static String[][][] soRandom(){ //makes the random lenghts of the arrays
    int length1=(int)((Math.random()*10)+1);
    String[][][] array = new String[length1][][];
     //makes the random lenghts of the arrays
    for(int d=0; d<length1 ; d++){
    int length2=(int)((Math.random()*10)+1);
    array[d]=new String[length2][];
        for(int a =0; a<length2; a++){
        int length3=(int)((Math.random()*10)+1);
        array[d][a]=new String[length3];   
        }
    }
    //fills the array with stuff from coder
            for(int d=0; d<array.length; d++){
        for(int i=0; i<array[d].length;i++){
            for(int j=0; j<array[d][i].length; j++){
            array[d][i][j]=coder();    
            }
        }
    }
    
    return array; //returns the new array
    }
    
    public static String coder(){//fills arrays with stuff
        String a="";
        char randomChar1=(char)(((Math.random()*26)+65));
        char randomChar2=(char)(((Math.random()*26)+65));
        char randomInt1=(char)(((Math.random()*10)+48));
        char randomInt2=(char)(((Math.random()*10)+48));
        char randomInt3=(char)(((Math.random()*10)+48));
        char randomInt4=(char)(((Math.random()*10)+48)); 
        //adds the random numbers and letters together to make the XXYYYY
        String molecule=a+randomChar1+randomChar2+randomInt1+randomInt2+randomInt3+randomInt4;   
        return molecule; //returns the XXYYYY
    
    }
    
    public static void print(String[][][] input){//Prints the array
    for(int x=0; x<input.length; x++){
        for(int y=0; y<input[x].length; y++){
            System.out.print("[");
            for(int w=0; w<input[x][y].length; w++){
            System.out.print(input[x][y][w]);
            if(w !=input[x][y].length-1){
             System.out.print(",");   
            }
            }
            System.out.print("]");
            if(y !=input[x].length-1){
            System.out.print("|");    
            }
        }
            if(x!=input.length-1 ){
            System.out.print("---");    
            }
    }
    System.out.println();
        
    }
    public static String[][][] holoport(String[][][] array1, String [][][] array2){//This copies everything from array1 to array2
    
    for(int d=0; d<array2.length; d++){
        if(d<array1.length){// checking if array length is bigger  
        for(int i=0; i<array2[d].length;i++){
            if(i<array1[d].length){// checking if inner array length is bigger  
            for(int j=0; j<array2[d][i].length; j++){
                if(j<array1[d][i].length){// checking if inner inner array length is bigger  
                    array2[d][i][j]=array1[d][i][j]; 
                }
                else{
                 array2[d][i][j]="$$$$$$";    
                }
            }
            }
            else{
                for(int j=0; j<array2[d][i].length; j++){
                array2[d][i][j]="$$$$$$";    
                }
            }
        }
        }
        else{
            for(int i=0; i<array2[d].length;i++){
                for(int j=0; j<array2[d][i].length; j++){
                 array2[d][i][j]="$$$$$$";   
                }
            }
        }
        }
    return array2; //returns the copied array
    }

    public static void sampling(String[][][] input,String s){//takes an array and string in and looks for it
    boolean foundIt=false;
    int x=0;
    int y=0;
    int z=0;
    int c=0;
    for(int d=0; d<input.length; d++){
        for(int i=0; i<input[d].length;i++){
            for(int j=0; j<input[d][i].length; j++){
            if(input[d][i][j].equals(s) && c==0){
                foundIt=true;
                x=d;
                y=i;
                z=j;
                c=1;
            }
            }    
        }
    }
    
    //prints the location if found
    if(foundIt==true){
    System.out.println("The location is ("+x+","+y+","+z+")");    
    }
    else{
    System.out.println("Code not found");    
    }
    }
    public static void percentage(String[][][] firstInput,String [][][] secInput){
        double firstL=firstInput.length;
        double secL=secInput.length;
        //finding the percentage 
        double percent=(firstL-secL/firstL);
        System.out.println("The percentage is "+percent+"%");
        
    }
        public static void frankenstein(String[][][] array){
            //I know this isn't totally right but I tried. The rest of the hw
            //should be working though.

         for(int i=0; i<array.length;i++){
             for(int a=0; i<array[i].length;i++){
            int smallest=i;
            for(int j=a; j<array[i].length; j++){
                if(array[i][a].length<array[i][j].length){
                smallest=j;
                 //swap smallest
                String[] temp=array[i][a];
                array[i][a]=array[i][smallest];
                 array[i][smallest]=temp;
                } 
            }
        }
    }
    
}
}