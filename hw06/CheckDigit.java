import java.util.Scanner;
public class CheckDigit {
    
public static void main (String[] args)
{

Scanner scan=new Scanner(System.in);
System.out.println ("Please enter the ten digit bar code");
if (scan.hasNextDouble()) //activates if input is double
{
double barcode=scan.nextDouble(); //stores double

double newbc=barcode/10; //find last value by dividing by 10
//double lastdigit=0, secondtolast=0, thirdtolast=0; fourthtolast=0; fifthtolast=0, sixthtolast=0, seventhtolast=0, eighthtolat=0, ninthtolast=0; last=0;
double sum=0; 

for (int i=10; i>=2; i--)
{
sum=sum+(newbc/Math.pow(10,i-1)%10*i); //sum is each digit multiplied from 10 to 2
}


System.out.println("The sum of your digits is: "+sum);

if (sum%11==(barcode%10)) //checks to see if sum is valid
System.out.println ("This is a valid ISBN");
}

if (scan.hasNext()) //activates if not double
{
 String in="";
 while (scan.next().length()>10) //rejects strings >10
 {
  System.out.println ("invalid input.Try again");
 }
  in=scan.next(); //stores string in variable
 
System.out.println (in);
for (int i=in.length()-1; i<0; i--) {
 if (in.charAt(i)=='a' || in.charAt(i)== 'b' || in.charAt(i)== 'c' || in.charAt(i)== 'd' || in.charAt(i)== 'e' || in.charAt(i)== 'f' || in.charAt(i)== 'g')) //only checks for lower case {
  System.out.println ("Invalid value. Try again");
  in=scan.next();
 }
 
 
 } 

 
   
}    
}