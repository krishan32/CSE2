import java.util.Scanner;
public class StringAnalysis {
public static boolean lettercheck (String x) {
int a=0;
//loop stores number of characters that are letters
for (int i=0; i<x.length(); i++)
{
 
 if (Character.isLetter(x.charAt(i))) 
 a++;
}
//returns true if number of characters that are letters is equal to size of string
 return (a==x.length());
}

public static boolean lettercheck (String x, int y) {
 boolean value=true;
//if the number of characters user wants analyzed is 0-greater than size of string-calls other method
if (y==0 || y>=x.length()) {
value=lettercheck(x); }
//returns true if number of charactaers is equal to size of string analyzed
else{
int a=0;
for (int i=0; i<y; i++)
{
 
 if (Character.isLetter(x.charAt(i))) 
 a++;
}
 value=(a==y);
}
return value;
}

public static void main (String [] args) {
Scanner scan=new Scanner(System.in); //create scanner

System.out.println("Enter a String"); //Prompts for String
String input=scan.next(); //Stores String
System.out.println("Enter the number of characters you want analyzed");//prompts user for number of characters user wants analyzed
int partofStr=scan.nextInt(); //stores number of characters user wants analyzed

System.out.println(lettercheck(input,partofStr)); //returns true or false
    
}
}