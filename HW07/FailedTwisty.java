
import java.util.Scanner;
public class Twisty{
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
  
  //number of characters on line
  double spread=length/width;
  
  int spre=(int) (spread+0.50);
  //master loop
  for(int b=0; b<spre; b++)
  {
  if (b%2==0) //every other "x" generated
  {
   for (int i=0; i<width;i++)
  {
  for (int a=0; a<width; i++)
  {
   if (a==i) { 
   System.out.print("/");
  }
   if (a==width-i-1){
   System.out.print ("#");
  }
  System.out.println();   
  }
  }
  System.out.print();
  }
  else //generates "x" patterns with reversed chars
  {
  for (int i=0; i<width;i++)
  {
  for (int a=0; a<width; i++)
  {
   if (a==i) { 
   System.out.print("#");
  }
   if (a==width-i-1){
   System.out.print ("/");
  }
  System.out.println();
  }
  }
  }
  }
  
  
  
        
        
    }
}