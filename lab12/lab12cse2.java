import java.util.Random;
import java.util.*;
public class lab12cse2 {

public static int [] [] raggedarray() {

int size=(int)(Math.random()*11)+10;
int [] [] ragged= new int[size][];
for(int i=0; i<size; i++ )
{
 ragged[i]=new int[(int)(Math.random()*11)+10];
 }

for(int x=0; x<size; x++)
{
for(int a=0; a<ragged[x].length; a++)
{
  ragged[x][a]=(int)(Math.random()*2001)-1000;
}
}

return ragged;
}

public static void printarray (int [] [] x)
{

 for (int i=0; i< x.length; i++)
 {
 String b="";
 for(int a=0; a< x[i].length; a++)
 {
 b=x[i][a]+" ";
 System.out.print(b);
 }
 System.out.println();
 }
}

public static int [] findlargest (int [] [] x)
{
 int largest=x[0][0];
 int numofarray=0;
 for (int i=0; i<x.length; i++) 
 {
 for(int a=0; a<x[i].length; a++)
 {
 if (x[i][a]>largest);
 {
 largest=x[i][a];
 numofarray=i;
 }
 }
 }
 System.out.println(largest);
 return x[numofarray];
}



public static int [] findSmallest (int [] [] x)
{
 int smallest=x[0][0];
 int numofarray=0;
 for (int i=0; i<x.length; i++) 
 {
 for(int a=0; a<x[i].length; a++)
 {
 if (x[i][a]<smallest);
 {
 smallest=x[i][a];
 numofarray=i;
 }
 }
 }
 System.out.println(smallest);
 return x[numofarray];
}





public static int [] mosteven (int [] [] x)
{
int [] evensperarray=new int[x.length];
 for(int b=0; b<x.length; b++)
{
int numevens=0;
for(int a=0; a<x[b].length; a++)
{
  if (x[b][a]%2==0)
  numevens++;
}
evensperarray[b]=numevens;
}
int largest=evensperarray[0];
int numoarray=0;
for(int i=0; i<evensperarray.length; i++)
{
 if(evensperarray[i]>largest)
 {
 largest=evensperarray[i];
 numoarray=i;
 }
}
return x[numoarray];
}




public static void main (String [] args)     {
int [] [] a= raggedarray();
printarray(a);
findlargest(a);    
findSmallest(a); 
 }
 
}