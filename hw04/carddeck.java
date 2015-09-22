import java.util.Scanner;
import java.util.Random;
public class carddeck {
    
public static void main (String [] args) {
String [] multinums=new String[5];
System.out.println ("Your random card were: \n")
int x=0;
if (x<5) 
{

int identity= (int) (Math.random()*(4+1))+1;
int cardnumber=(int)  (Math.random()*(13+1))+1;


/*Scanner jim=new Scanner(System.in);
System.out.println ("Enter an identity");
int identity=jim.nextInt();
System.out.println ("Enter a number");
int cardnumber=jim.nextInt();*/

String cardidentity="";
String cardnum="";


switch (identity) {
case 1:
cardidentity="clubs";
break;
case 2:
cardidentity="hearts";
break;
case 3:
cardidentity="spades";
break;
case 4:
cardidentity="diamonds";
break;    
}    

    
 switch (cardnumber) {
case 1:
cardnum="ace";
break;
case 2:
cardnum="2";
break;
case 3:
cardnum="3";
break;
case 4:
cardnum="4";
break;
case 5:
cardnum="5";
break;
case 6:
cardnum="6";
break;
case 7:
cardnum="7";
break;
case 8:
cardnum="8";
break;       
case 9:
cardnum="9";
break;      
case 10:
cardnum="10";
break;       
case 11:
cardnum="ace";
break;   
case 12:
cardnum="12";
break;
case 13:
cardnum="king";
break;
x++;
}

multinums[x]=cardnum;
System.out.println("the "+cardnum+" of "+cardidentity+"\n");
}


for ( int i=0; i<multinums.length; i++)
{
    
   

    
    
    
}
}