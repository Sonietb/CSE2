/* Soniet Berrios 2/5/16 CSE2
This program is a cylometer. 
Given time and rotation this program will:
1.Print the number of minutes for each trip
2.Print the number of counts for each trip
3.Print the distance of each trip in miles
4.Print the distance for the two trips combined.
*/
// This is the class aka a container for code
public class Cyclometer{
//Now we add the main method required for every Java program
    public static void main(String[] args){
//Input data
    int secsTrip1=480;  //Seconds for Trip1
    int secsTrip2=3220; //Seconds for Trip2
    int countsTrip1=1561;   //Rotation counts for Trip1
    int countsTrip2=9037;   //Rotation counts for Trip2
//our intermediate values and output data 
    double wheelDiameter=27,    //sets wheelDiameter as a double
    PI=3.14159, //gives the identifier PI a variable
    feetPerMile=5280, //gives the identifier feetPerMile a variable
    inchesPerFoot=12,  //gives the identifier inchesPerFoot a variable
    secondsPerMinute=60;    //gives the identifier secondsPerMinute a variable
    double distanceTrip1, distanceTrip2, totalDistance; //sets all of these as doubles
    
    System.out.println("Trip1 took "+
    (secsTrip1/secondsPerMinute)+"minutes and had "+
    countsTrip1+" counts.");
    System.out.println("Trip2 took "+
    (secsTrip2/secondsPerMinute)+" minutes and had "+
    countsTrip2+" counts.");
    //Calculations
    distanceTrip1=countsTrip1*wheelDiameter*PI;     //gives distance in inches
    distanceTrip1=inchesPerFoot*feetPerMile;        //gives ditance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;

//Printing out the Data
System.out.println("Trip1 was "+distanceTrip1+" miles");
System.out.println("Trip2 was "+distanceTrip2+" miles");
System.out.println("The total distance was "+totalDistance+" miles");

    }
}
