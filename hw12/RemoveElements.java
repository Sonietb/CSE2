/* Soniet Berrios CSE2 hw12
This program creates an array of size 10 and fills it with random arrays from 0-9. It then asks the user for a number and deletes that member of the array.
After that, it asks the user for another number and finds all the members that have that number value and remove all of those.
*/
import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    int newArray1[];
    int newArray2[];
    int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
    System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
  
  public static int[] randomInput(){ //This method fills the array with random numbers 
    int[] ranArray= new int[10];
    for(int i=0; i<10; i++){
    int n=(int)(Math.random()*10);
    ranArray[i]=n;
  }
  return ranArray;
  }
  
    public static int[] delete(int[] lis,int pos){ //This method deletes a specific member of the array 
        int l=lis.length-1;
        int[] delArray= new int[l];
        if(pos>=0 && pos<=10){
        for(int j=0; j<l;j++){
           if(pos==j || j>pos){
            delArray[j]=lis[j+1];      
           }
           else{
             delArray[j]=lis[j];  
           }
        }
        }
        else{
        System.out.println("The index is not valid.");
        return lis;
        }
        return delArray;
      
  }
    public static int[] remove(int[] list,int target){//This method removes all the members that have a specific number saved to them 
        int l=list.length;
        int i=0;
        int b=0;
        for(int a=0; a<l;a++){
            if(list[a]==target){
            i++; //counts how many time the number is in the array
            }

        }
        
        if(i==0){ 
        System.out.println("Element "+target+" was not found");
        return list;
        }
        else{
        System.out.println("Element "+target+" has been found");    
        }
        
        int newL=list.length-i; //length of new array
        int[] remArray=new int[newL];
        int f=0;
        for(int a=0; a<l;a++){
            if(list[a]==target){
              
            }
            else{
            remArray[f]=list[a];
            f++;
            }
        }
        return remArray;
    
  }
  
}
