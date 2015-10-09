import java.util.Scanner;
public class LabSeven{

public static void main (String [] args){
    
Scanner Seven=new Scanner (System.in); //insert scanner
System.out.println("Enter an integer between 1 and 100"); //prompt user for int
int input=Seven.nextInt(); //stores input
//loop validates input
while(input>100 || input<1)
{
    System.out.println ("Bad variable. Reenter");
    input=Seven.nextInt();
}

for (int i=0; i<input; i++) //rows-horizontal-number of loops
{
 for (int a=0; a<input; a++) //one loop per each loop in earlier loop-number of columns
 {
 if (a==i) { //column from upper right-leaves blank spaces at 1-1,2-2, etc.
 System.out.print(" "); }
 else if (a==input-i-1) { //column from upper left-if input is 5, at line 0, creates a blank not at non-existant 5th value-but at 4-because loop starts at 0, 4 is highest val of a
 System.out.print(" ");
 }
 else
 System.out.print("*"); //prints starts for all other cases
 }
 System.out.println(); //once loop goes through line-prints out blank line
}
 
 


}
}