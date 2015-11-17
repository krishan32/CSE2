import java.util.*;
import java.util.Random;

public class Transpose {
//generates 2d matrix whose member matrixes have values between 0 and 10 
public static int [] [] bigrandomMatrix (int width, int height)
{
 
 int [] [] x=new int[width][height];
 for (int i=0; i<height; i++)
 {
     for(int a=0; a<width;a++)
     {
       x[i][a]=(int)(Math.random()*11)-10;
     }
 }
 return x;
}

//generates new string for each member array-prints each string
public static void printarray (int [] [] x)
{
 int collect=0; 
 int compare=x[0].length; //length of first member array
 for (int i=0; i< x.length; i++)
 {
 System.out.println();
 String b=" ";
 if(x[i].length==compare) //collect number of member array with same length
 {
  collect++;
 }
 for(int a=0; a< x[i].length; a++)
 {
 b=x[i][a]+" ";
 System.out.print(b);
 }

 }
 if(collect!=x.length) //if member arrays have different lengths-outputs message
 {
 System.out.println("The matrix is not a rectangle");
 }
}

//create new array for transposed values    
public static int [] [] transposeMatrix(int [] [] x)    
{
 int [] [] newarray= new int[x[0].length][x.length]; //each member array is as long as number of arrays in original 2d array 
  int height=x[0].length; //number of arrays is equal to the number of elements in 1st member array
  for(int i=0; i<height;i++)
  {
  for(int a=0; a<x.length; a++)
  {
   newarray[i][a]=x[a][i];
  }
  }
  return newarray;
}    
    
public static void main(String args []) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter a height");
while(!scan.hasNextInt()) //first check to weed out string
{
 String temp=scan.next();
 System.out.println("Sorry, your answer must be an integer");
}
int height=scan.nextInt(); 
while(height<=0) //weed out non positive values
{
System.out.println("Your height must be positive");
   while(!scan.hasNextInt()) //reject strings again
   {
   String temp=scan.next();
   System.out.println("Sorry, your answer must be an integer");
   
   }
  height=scan.nextInt();
 
}

System.out.println("Enter a width"); 
while(!scan.hasNextInt())
{
 String temp=scan.next();
 System.out.println("Sorry, your answer must be an integer");
}
int width=scan.nextInt();
while(height<=0) 
{
System.out.println("Your width must be positive");
   while(!scan.hasNextInt())
   {
   String temp=scan.next();
   System.out.println("Sorry, your answer must be an integer");
   
   }
  width=scan.nextInt();
 
}

int [] [] testout=bigrandomMatrix(height, width);
printarray(testout);
System.out.println(" ");
int[] [] posed=transposeMatrix(testout); //create new array because new array was created my method
printarray(posed);
 
 

 
 
 
 
 
 
 
}
    
    
    
    
    
}