public class cyclometer {
        // main method required for every Java program
       public static void main(String[] args) {

      

    int secsTrip1=480;  // the amount of time it took to complete trip one
    int secsTrip2=3220;  // the amount of time it took to complete trip two
    int countsTrip1=1561;  // the amount of rotations the bicycle wheel made during trip one
    int countsTrip2=9037; // the amount of rotations the bicycle wheel made during trip two
    double wheelDiameter=27.0;  //diameter of the wheel in inches
    double feetPerMile=5280;  //feet in a mile
    double inchesPerFoot=12;   //inches in a foot
    double  secondsPerMinute=60;  //seconds in a minute
    double PI=3.14159;
    double distanceTrip1, distanceTrip2,totalDistance; 
    
   System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+
   countsTrip1+" counts."); //calculates and outputs the number of minutes in trip 1 and the number of wheel rotations
                 
   
   System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");
     
   distanceTrip1=wheelDiameter*PI*countsTrip1; //the distance of trip 1 in inches is counted by multiplying the circumfrence with the number of rotations
   
   distanceTrip1/=inchesPerFoot*feetPerMile;// dividing the number of inches in trip 1 by the amount of inches in a mile to find the number of miles
   
   distanceTrip2=countsTrip2*wheelDiameter*PI;//calculates distance of trip 2 in inches
   //printing output data
   
   distanceTrip2/=inchesPerFoot*feetPerMile; //dividing the number of inches in trip 2 with the number of inches in a mile to find the number of miles
   totalDistance=distanceTrip1+distanceTrip2;
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles"); 
    
    
    
   
    }  //end of main method   
} //end of class
