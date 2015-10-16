import java.util.Scanner;
public class newTwisty{
    public static void main (String [] args) {
  Scanner scan=new Scanner (System.in); //create scanner
  Double length; //length
  Double width; //width
  System.out.println ("Enter your desired length"); //prompts user for length
  //validates if input is double
  while(!scan.hasNextDouble()){
  String junk=scan.next();
  System.out.println("Invalid input.Try again");
  }
  length=scan.nextDouble();
  //validates if width is double
  System.out.println ("Enter your desired width");
  while(!scan.hasNextDouble()){
  String junk=scan.next();
  System.out.println("Invalid input.Try again");
  }
  width=scan.nextDouble();
 //validates if width is less than length
  if (width>=length)
  {
  System.out.println ("Error. Width must be less than length");
  width=scan.nextDouble();
  }
  
  for (double i=1; i<=width; i++){
    for (double a=1; a<=length; a++)
    {
    //if (a==i)
    //System.out.print ("#");
    double position=a % (2* (width)); 
    //if (a==width-(i-1))
   //System.out.print ("/"); //prints out forward slashes
   if (position==(width+i) || (position==0 && i==width) ) { //prints out back slashes
   System.out.print("\\"); }
   else if (a%(2*width)==i || position==(2*width)-(i-1)) {//prints out hash tags diagonally
   System.out.print("#"); }
    else if (position==width-(i-1)) {
   System.out.print ("/"); }
  
   
   else {
   System.out.print(" "); }
    
    }
        
        
     System.out.println();   
        
    }
  
  
    }
}