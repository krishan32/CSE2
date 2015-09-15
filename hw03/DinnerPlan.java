import java.util.Scanner;
public class DinnerPlan {

public static void main (String [] args) {


 Scanner myscanner=new Scanner (System.in);
 
  System.out.println ("Enter the current time:"); //current time
  int time=myscanner.nextInt(); //takes in time
  System.out.println ("Enter the time you will be eating dinner:"); //time you will be eating dinner
  int newtime=myscanner.nextInt(); //scanner reads when he will be eating dinner
  int difference=newtime-time; //finds difference in times
  int hours=(newtime-time)/100; //extracts hours
  int minutes=(newtime-time)%100; //uses remainder to find minutes
  System.out.println ("You have "+hours+" hours and "+minutes+" minutes until dinner");
  
}}
  
  