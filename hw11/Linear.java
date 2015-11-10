import java.util.Arrays;
import java.util.*;
import java.util.Scanner;
public class Linear{

//scrambles array-randomley generates int within size of array-switches it with first element
public static void scramble (int [] q)
{
  for (int i=0; i<30; i++)
 {
 int swappoint= (int)(Math.random()*(q.length));
 int temp= q[0];
 q[0]=q[swappoint];
 q[swappoint]=temp;
 }
 String scrambled=" ";
 for(int i=0; i<q.length; i++){
 scrambled+=q[i]+" ";
 }
 System.out.println(scrambled);
 
 
}
//goes through array looking for int
public static void linearsearch (int [] a, int y)
{
 int match=0;
 for(int i=0; i<a.length; i++)
 {
  if (a[i]==y)
  match=i+1;
  else 
  match=0;
}
if(match>0)
System.out.println(y+" was found in the array.It took "+match+" many iterations.");
else
System.out.println(y+" could not be found after 15 iterations.");
}
//sorts and outputs array
public static void sorted (int [] a)
{
 Arrays.sort(a);
 String abs=" ";
 for(int i=0; i<a.length; i++){
 abs+=a[i]+" ";
 }
 System.out.println(abs);
}
//binary search
public static void binarysearch(int [] a, int y)
{
 int low=0;
 int count=0;
 int high=a.length-1;


 while(low<=high)
 {
  count++;
  int mid=(low+high)/2;
  if(a[mid]<y)
  low=mid+1;
  else if(a[mid]>y)
  high=mid-1;
  else if(a[mid]==y) {
  System.out.println("The number was found in the array at subscript "+mid+"."+"It took "+count+" many comparisons."); 
  break;
  }
  else if ((low==high) && (a[mid]!=y)) {
 System.out.println("The number was not found in the array. It took "+count+" many comparisons.");
  break;
  }  


if(low>high)
System.out.println(y+" was not on this list. It took "+count+" comparisons.");


 
 }  
}

    
public static void main (String [] args) {

Scanner Scan=new Scanner(System.in);
int[] grades=new int[15];
for(int i=0; i<15; i++)
{
 System.out.println("Enter an integer");

//validates if input is an int
 while(!Scan.hasNextInt())
 {
  String temp=Scan.next(); //stores junk
  System.out.println("Sorry, your answer must be an integer");
  }
   int input=Scan.nextInt(); 
  while(input<0 || input>100)
  {
   System.out.println("Sorry, your input should be greater than 0 and less than 100"); //rejects out of range input
  while(!Scan.hasNextInt()){ //rejects strings
  String temp=Scan.next();
  System.out.println("Sorry, your answer must be an integer");
  }
  input=Scan.nextInt();
  }
  
  
  //if (grades[i+1]<grades[i])
  //{
  //System.out.println("Sorry, your input should be greater than or equal to the previous input");
  grades[i]=input; //after checking to see if values are valid, value is stored in array
  }
  System.out.println("Sorted:");
  sorted(grades);
  
  binarysearch(grades, 10);
  System.out.println("Scrambled:");
  scramble(grades);
  
  linearsearch(grades, 10);
  
  
  
}
    
}
