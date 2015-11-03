

import java.util.*;
public class Shuffling{
    
//prints array-concatenates every element of array to empty string    
public static void printArray(String [] input){
String comesout="";
for(int i=0; i<input.length; i++)
{
 comesout+=input[i]+" ";
}
System.out.println(comesout);
}

//every run of for loop creates new random int in array-swaps it with first element in array
public static void shuffle(String [] q)
{
 //String [] x= new String [a.length];
//for(int b=0; b<a.length; b++)
//{
 //x[b]=a[b];
//}

 for (int i=0; i<60; i++)
 {
 int swappoint= (int)(Math.random()*52);
 String temp= q[0];
 q[0]=q[swappoint];
 q[swappoint]=temp;
 }

}

//picks 5 random elements in array two put in string
public static String [] randomizeHand(String [] x)
{
 String [] hand=new String [5];
 for (int i=0; i<hand.length; i++)
 {
     int a=(int)(Math.random()*52);
     hand[i]=x[a];
 }
 return hand;   
    
}



  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
    //suits club, heart, spade or diamond
     String[] suitNames={"C","H","S","D"};   
String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
String[] cards = new String[52]; //create array of 52 elements
String[] hand = new String[5]; //create array of 5 elements
for (int i=0; i<52; i++){
  cards[i]=rankNames[i%13]+suitNames[i/13];
  System.out.print(cards[i]+" ");
}
//prints original array
printArray(cards);
//shuffles array
shuffle(cards); 
System.out.println("Shuffled");
//changes made to array in shuffle method still apply-no need to create new array for shuffled array
printArray(cards);
System.out.println("randomized hand");
//need to create new array because the array created in method has 5 elements
hand = randomizeHand(cards);
printArray(hand);
  }
}
