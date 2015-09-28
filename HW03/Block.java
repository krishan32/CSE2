import java.util.Scanner;
public class Block {

public static void main (String [] args) {


 Scanner myscanner=new Scanner (System.in); //instantiate scanner
 
  System.out.println ("Enter the length of the block:"); //prompt user for length of block
  double length=myscanner.nextDouble(); //scanner reads input
  
  System.out.println ("Enter the width of the block:"); //prompt user for width
  double width=myscanner.nextDouble(); //scanner reads width
  
  System.out.println ("Enter the height of the block:"); //prompt user for height
  double height=myscanner.nextDouble(); /scanner reads height
 
  
  double volume=height*width*length; //calculate volume
  double sa=(width*height*2)+(length*height*2)+(width*length*2); //calculate surface area
  System.out.println("The volume of the block of dimensions "+length+" x "+width+" x "+height +" is "+volume+". The surface area of the block is "+sa+"."); //outputs volume and surface area
  
    } 

        }
  
  
  