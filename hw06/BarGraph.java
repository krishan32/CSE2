import java.util.Scanner;
import java.util.*;
public class BarGraph
{
public static void main (String [] args)
{
double Mondayexpenses=0, Tuesdayexpenses=0, Wednesdayexpenses=0, Thursdayexpenses=0,  Fridayexpenses=0,  Saturdayexpenses=0, Sundayexpenses=0; //declar doubles
Scanner scan=new Scanner (System.in); //instantiating scanner
int i=0; //declaring int for while loop
//while loop accepts expenses for each day
while (i<=6) 
{
if (i==0) //expenses for Monday
{
System.out.println ("Expenses for Monday:"); 
while(!scan.hasNextDouble()){ //outputs message if not a double
 String temp=scan.next();
 System.out.println ("Invalid input. Try again.");
}
Mondayexpenses=scan.nextDouble(); //if it is a double, it stores double in variable
while (Mondayexpenses<0) //checks to see if input is less than zero
{
 System.out.println ("Invalid input. Try again");
 Mondayexpenses=scan.nextDouble();
}
i++;
}


if (i==1) //if statement corresponds to Tuesday
{
System.out.println ("Expenses for Tuesday:"); //prompts user for Tuesday expenses

while (!scan.hasNextDouble() ){ //if input is invalid
String temp=scan.next(); //stores invalid input in temp
System.out.println ("Invlid input. Try again"); //outputs message for invalid input
}
Tuesdayexpenses=scan.nextDouble(); //stores valid input
while (Tuesdayexpenses<0)
{
 System.out.println ("Invalid input.Try again");
 Tuesdayexpenses=scan.nextDouble();
}
i++; //increments values so while loop reaches end
}

if (i==2 )
{
System.out.println ("Expenses for Wednesday:");
while (!scan.hasNextDouble() ){ //checks to see if input is valid
 String temp=scan.next();
System.out.println ("Invalid input. Try again");
}
 Wednesdayexpenses=scan.nextDouble();
 while (Wednesdayexpenses<0)
 {
  System.out.println ("Invalid input. Try again");
  Wednesdayexpenses=scan.nestDouble();
 }
i++;
}

if (i==3)
{
System.out.println ("Expenses for Thursday:");
while (!scan.hasNextDouble() ){
 

String temp=scan.next();
System.out.println ("Invalid input. Try again");
 
}
 Thursdayexpenses=scan.nextDouble();
 while (Thursdayexpenses<0)
 {
  System.out.println("Invalid input. Try again");
  Thursdayexpenses=scan.nextDouble();
 }
i++;
}

if (i==4)
{
System.out.println ("Expenses for Friday:");
while (!scan.hasNextDouble() ){
 String temp=scan.next();
 System.out.println ("Invalid input. Try again.");
}

 Fridayexpenses=scan.nextDouble();
 while (Fridayexpenses<0)
 { System.out.println ("Invalid input. Try again");
 Fridayexpenses=scan.nextDouble();
 }
i++;
}

if (i==5)
{
System.out.println ("Expenses for Saturday:");
while (!scan.hasNextDouble() ){
 String temp=scan.next();
System.out.println ("Invalid input. Try again");
}
 Saturdayexpenses=scan.nextDouble();
 while (Saturdayexpenses<0)
 {
  System.out.println ("Invalid input. Try again");
  Saturdayexpenses=scan.nextDouble();
 }
i++;
}

if (i==6)
{
System.out.println ("Expenses for Sunday:");
while (!scan.hasNextDouble()){
 String temp=scan.next();
System.out.println ("Invalid input. Try again");
}
Sundayexpenses=scan.nextDouble();
i++;
}
}

//modifies doubles so they can be accurately rounded
double nMonday=Mondayexpenses+0.50;
double nTuesday=Tuesdayexpenses+0.50;
double nWednesday=Wednesdayexpenses+0.50;
double nThursday=Thursdayexpenses+0.50;
double nFriday=Fridayexpenses+0.50;
double nSaturday=Saturdayexpenses+0.50;
double nSunday=Sundayexpenses+0.50;

//generates bar graphs using for loops
String Mon="";
for (int a=0; a<(int)(nMonday); a++)
{
 Mon=Mon.concat("*");
} 

String Tues="";
for (int a=0; a<(int)(nTuesday); a++)
{
 Tues=Tues.concat("*");
}    

String Weds="";
for (int a=0; a<(int)(nWednesday); a++)
{
 Weds=Weds.concat("*");
}    

String Thurs="";
for (int a=0; a<(int)(nThursday); a++)
{
 Thurs=Thurs.concat("*");
}    

String Fri="";
for (int a=0; a<(int)(nFriday); a++)
{
 Fri=Fri.concat("*");
}    

String Sat="";
for (int a=0; a<(int)(nSaturday); a++)
{
 Sat=Sat.concat("*");
}    

String Sun="";
for (int a=0; a<(int)(nSunday); a++)
{
 Sun=Sun.concat("*");
}    





//prints loops
System.out.println("Mon:"+Mon);
System.out.println("Tues: "+Tues);
System.out.println("Weds: "+Weds);
System.out.println("Thurs: "+Thurs);
System.out.println("Fri: "+Fri);
System.out.println("Sat: "+Sat);
System.out.println("Sun: "+Sun);

//calculates average
double average=(Mondayexpenses+Tuesdayexpenses+Wednesdayexpenses+Thursdayexpenses+Fridayexpenses+Saturdayexpenses+Sundayexpenses)/7.00;
System.out.printf("Average weekly expenses:"+"%.2f %n", average);    


double fouryearexpense=average;
int c=0;
//calculates four year estimate
while (c<208) //208 weeks in four years-52*4
{
double adexp=average*(((Math.random()*41)-20)/100); //creates range from .20 to .-20 that multiplies with average
double nwexp=average+adexp; //adds new value to average
fouryearexpense=fouryearexpense+nwexp; //adds other new value to average
c++;
}

System.out.printf ("Four year estimate:" +"%.2f %n", fouryearexpense); //outputs four year estimate
    
    
}
}
