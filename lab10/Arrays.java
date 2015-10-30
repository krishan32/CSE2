import java.util.*;
import java.util.Scanner;
public class Arrays {
    
public static void main(String [] args){ 
Scanner scan=new Scanner(System.in); //create scanner
Random gen=new Random();   //create generator
int size=gen.nextInt((5)+1)+5; //generate number between 10 and 5
String [] students=new String[size]; //create an array of the randomley generated size
for(int i=0; i<size;i++)
{
  System.out.println("Enter the name of a student"); //prompt user for name of students 
  students[i]=scan.next();
}  
//create new array of grades
int [] grades=new int[size];
//assign each student a randomley generated grade
for(int i=0; i<size;i++)
{
  grades[i]=gen.nextInt(100+1);
}    

//output results
System.out.println("Here are the midterm grades of the "+size+" students above: ");
for(int i=0; i<size;i++) {
System.out.println (students[i] +":"+grades[i]);
}
   
}
}