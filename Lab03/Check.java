import java.util.Scanner; //import scanner

public class Check{
    public static void main (String [] args) {
    
        Scanner myscanner=new Scanner (System.in); //instantiating a scanner
        
        System.out.print ("Enter the original cost of the check in the form xx.xx:"); //original cost of check
        double check=myscanner.nextDouble(); //the cost of the check is processed by the scanner
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx)"); //percent of check paid as tip 
        double percentage=myscanner.nextDouble();
        System.out.print ("Enter the number of people who went out to dinner:"); //number of people who ate
        int people=myscanner.nextInt(); //scanner reads value
        double costperperson=((check+((percentage/100)*check))/(int)people); //cost of check and tip are split by the number of people who ate out
        int dimes=(int) (costperperson*10)%10;
        int dollars=(int) (costperperson);
        int pennies=(int) (costperperson*100)%100;
        
        System.out.println ("Each person owes $"+dollars+"."+dimes+""+pennies); //cost per person

    }
    
}

