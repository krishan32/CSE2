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
  