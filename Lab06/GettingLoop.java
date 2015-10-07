public class GettingLoop
{
public static void main (String [] args) {
    
int x=1;
System.out.println ("Step 1:");
 while (x<=7)  
 {
     System.out.print(x);
     x++;
 }
    

for (int y=0; y<=7; y++)
{
System.out.print(7);
}

System.out.print ("While Loop:");


/*for (int n=10; n<=100; n++)
{

  for (int a=2;a<=9; a++)
  {
    if ((n%a)!=0)
    {
    }
    
    }
   
    System.out.print (n+ "\t");
}
*/
int c=10;


while (c<100)
{
int factor=2;
while (c%factor!=0 && factor<=10)
{
 factor++;
 
}
if (factor==11) 
{
System.out.print (c+" ");
}
c++;
}

System.out.print ("For Loop: ");


for (int n=10; n<=100; n++)
{
  
  for (int a=2;a<=9; a++)
  {
      int b=0;
      int mob=n%a;
      
      if (mob==0)
      {
        b++;  
      }
       if( b==0 && a==9)
      {
     System.out.print (n+" ");
      }
  }
    
   
  }
  

    
}
}