import java.util.Scanner;

public class Area {

//takes in base-height-multiplies product with half
public static double TriArea(double x, double y)
{
  double areaofTri=(x*y)/2;
  return areaofTri;
}
    
//multiplies base with height    
public static double Rect(double y, double x)
{
  double areaofRectangle=y*x;
  return areaofRectangle;
}

//multiplies radius with radius by calling rectangle method and the product with pi
public static double CircArea(double y)
{
  double areaofCircle=3.14*Rect(y, y);
  return areaofCircle;
}

//takes in Scanner input-keeps asking until double is input
public static double validate (Scanner x)
{
  double y=0;
  while (!x.hasNextDouble()) {
  String junk=x.next();
  System.out.println("Invalid input. Only accepts doubles");
}
  if (x.hasNextDouble())
  {
  y=x.nextDouble();
 
  }
   return y;
}


    
public static void main (String [] args) {

Scanner scan=new Scanner(System.in);
System.out.println("Do you want to analyze a rectangle, circle, or triangle?"); //prompts user for shape
String input=scan.next();
while (!input.equals ("triangle") && !input.equals("rectangle") && !input.equals("circle")){ //validates input
System.out.println("You can only type  triangle, circle, or rectangle");    
input=scan.next();    
}

if (input.equals("triangle")) {
System.out.println("Enter a base"); //prompts user for base

double base=validate (scan); //calls method that validates if input is double


System.out.println("Enter a height"); //prompts user for height 
double height=validate (scan); //calls method that validates if input is double
System.out.println("The area of your triangle is "+ TriArea(base, height)); 
}

if(input.equals("rectangle")){
System.out.println("Enter a base"); //prompts user for base of rectangle
double rectbase=validate (scan); //calls validation method for doubles
System.out.println("Enter a height"); //prompts user for height
double rectheight=validate (scan);
System.out.println("The area of your rectangle is "+Rect(rectbase, rectheight));
}  
//method follows same model as others-prompts uder for radius-then summons validation method-then outputs area
if(input.equals("circle")){
System.out.println("Enter a radius");
double radius=validate (scan);
System.out.println("The area of your circle is "+CircArea(radius));
}    
    
    
    
    
    
}
}