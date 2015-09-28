    import java.util.Random; //import random to enable randomly generated numbers
    public class newcarddeck {
        
    public static void main (String [] args) {
    
    System.out.println ("Your random cards were: \n"); //string announces randomly picked cards
    //variables of program
    String cardidentity=""; //changes based on generated int
    String cardnum=""; //determines identity
    String num1=""; //stores first identity-needed to determine pairs
    String num2=""; //stores second identity-needed to determine pairs
    String num3="";  //stores third
    String num4=""; //stores fourth
    String num5=""; //stores fifth
    int paircount=0; //counts number of pairs
    
    /*Scanner jim=new Scanner(System.in);
    System.out.println ("Enter an identity");
    int identity=jim.nextInt();
    System.out.println ("Enter a number");
    int cardnumber=jim.nextInt();*/
    int identity=0; //initialize identity
    int cardnumber=0; //initialize number of card picked
   
    
    identity= (int) (Math.random()*(4+1))+1; //generate number that corresponds to identity from list
    cardnumber=(int)  (Math.random()*(13+1))+1; //generate card number out of 13
      
    
    switch (identity) {
    case 1:
    cardidentity="clubs"; //if identity is equal to one, card is a club
    break;
    case 2: //if identity is equal to two, card is a heart
    cardidentity="hearts";
    break;
    case 3: //if identity is equal to three, card is a spade
    cardidentity="spades";
    break;
    case 4: //if identity is equal to four, card is a diamond
    cardidentity="diamonds";
    break;    
    }    
    
     //assign card numbers based on generated ints   
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
    cardnum="jack";
    break;   
    case 12:
    cardnum="12";
    break;
    case 13:
    cardnum="king";
    break;
     }
        
        
    //output card 
    System.out.println("the "+cardnum+" of "+cardidentity+"\n");
    num1=cardnum; //stores identity of card drawn
    
    //repeat
     identity= (int) (Math.random()*(4+1))+1;
     cardnumber=(int)  (Math.random()*(13+1))+1;
    
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
    cardnum="jack";
    break;   
    case 12:
    cardnum="12";
    break;
    case 13:
    cardnum="king";
    break;
     }
        
        
    
    System.out.println("the "+cardnum+" of "+cardidentity+"\n");
    num2=cardnum; //stores identity of card drawn
    
     identity= (int) (Math.random()*(4+1))+1;
     cardnumber=(int)  (Math.random()*(13+1))+1;
    
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
    cardnum="jack";
    break;   
    case 12:
    cardnum="12";
    break;
    case 13:
    cardnum="king";
    break;
     }
        
        
    
    System.out.println("the "+cardnum+" of "+cardidentity+"\n");
     num3=cardnum; //stores identity of card drawn
    
      identity= (int) (Math.random()*(4+1))+1;
     cardnumber=(int)  (Math.random()*(13+1))+1;
    
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
    cardnum="jack";
    break;   
    case 12:
    cardnum="12";
    break;
    case 13:
    cardnum="king";
    break;
     }
        
        
    
    System.out.println("the "+cardnum+" of "+cardidentity+"\n");
    num4=cardnum; //stores identity of card drawn
    
     identity= (int) (Math.random()*(4+1))+1;
     cardnumber=(int)  (Math.random()*(13+1))+1;
    
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
    cardnum="jack";
    break;   
    case 12:
    cardnum="12";
    break;
    case 13:
    cardnum="king";
    break;
     }
        
        
    
    System.out.println("the "+cardnum+" of "+cardidentity+"\n");
    num5=cardnum; //stores identity of card drawn
    
    //
    if (num1.equals(num2))
    {
     if (num2.equals(num3) || num2.equals(num4)  || num2.equals(num5))
     {
     System.out.println ("We have three of a kind");
     }
     else
     System.out.println ("We have a pair");
     paircount++;
     }
    
    else if (num1.equals(num3))
    {
     if (num3.equals(num4) || num3.equals(num5))
     {
     System.out.println ("We have three of a kind");
     }
    else
    System.out.println ("We have a pair");
    paircount++;
    }
    
    else if (num1.equals(num4))
    {
     if (num4.equals(num5))
     {
     System.out.println ("We have three of a kind");
     }
    else
    System.out.println ("We have a pair");
    paircount++;
    }
    
    else if (num1.equals(num5))
    {
    System.out.println ("We have a pair");
    paircount++;
    }
    
    else if (num2.equals(num3))
    {
     if(num3.equals(num4) || num3.equals(num5))
     {
      System.out.println ("We have three of a kind");
     }
     else
     System.out.println("We have a pair");
     
     paircount++;
    }
     
     
    else if (num2.equals(num4))
    {
     if (num4.equals(num5))
     {
      System.out.println("We have three of a kind");
     }
     else
     System.out.println("We have a pair");
     paircount++;
    }
     
         
    else if (num2.equals(num5))
    {
    System.out.println ("We have a pair");
    paircount++;
    }

     
     
     else if(num3.equals(num4))
     {
      if(num4.equals(num5))
      {
       System.out.println("We have three of a kind");
      }
      else
      System.out.println("We have a pair");
      paircount++;
     }
     
      else if (num3.equals(num5))
     {
      System.out.println("We have a pair");
      paircount++;
     }
     
     else if (num4.equals(num5))
     {
      System.out.println ("We have a pair");
      paircount++;
     }
     
     else{
       System.out.println ("You have a high card hand");
      }
     
     //if the number of pairs is greater than or equal to 2, we have two pair
     if (paircount>=2)
     {
      System.out.println("We have two pair");
     }
     
    }
    }