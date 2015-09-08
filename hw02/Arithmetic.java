public class Arithmetic {
 //calculates total cost of goods before taxes are factored
 public static double beforetaxcost(int amount, double unitcost) {
double totalbtax=amount*unitcost;
return totalbtax;
}

//method that calculates sales taxes for the goods bought-inputs are the amount goods, the number of goods bought, and the tax rate
public static double totalsalestax (int amount, double unitcost, double taxPercent) {
double totalsales=taxPercent*(beforetaxcost(amount, unitcost));
return totalsales;
}

//method that takes in item, the amount of item bought, the cost per unit, and the sales tax and outputs the name of item, the cost per item, the amount bought, the cost per unit, the sales tax, the cost before taxes, the total sales taxes paid on each item, and the after tax cost, in that order
public static String outmessage (String i, int amount, double unitcost, double taxPercent) {
String out =("item: "+i+"\n"+"amount of item: "+amount+"\ncost per unit: $"+unitcost+"\nsales tax: "+taxPercent+"\ncost before sales tax: $"+beforetaxcost (amount, unitcost)+"\ntotal sales tax: $"+totalsalestax (amount, unitcost, taxPercent)+"\nafter tax cost: $"+(beforetaxcost(amount, unitcost)+totalsalestax(amount, unitcost, taxPercent))+"\n");
return out;
}   
    
    
public static void main (String [] args) {

//number of socks
int nsocks=3;
//cost per sock
double sockcost$=2.58;
//Number of drinking glasses
int nGlasses=6;
//Cost per glass
double glassCost$=2.29;

//Number of boxes of envelopes
int nEnvelopes=1;
//cost per box of envelopes
double envelopeCost$=3.25;
//tax rate
double taxPercent=0.06;


//sending each object, the number of objects bought, the price per object, and the tax rate to the method that takes in all the info
System.out.println(outmessage("socks",nsocks,sockcost$, taxPercent)+"\n"+outmessage("envelopes",nEnvelopes,envelopeCost$, taxPercent)+"\n"+outmessage("glasses",nGlasses,glassCost$, taxPercent));
    


    
    
    
 } }