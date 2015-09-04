public class Arithmetic {
    
public static void main (String args) {


int nsocks=3;
double sockcost$=2.58;
//Number of drinking glasses
int nGlasses=6;
//Cost per glass
double glassCost$=2.29;

//Number of boxes of envelopes
int nEnvelopes=1;
//cost per box of envelopes
double envelopeCost$=3.25;
double taxPercent=0.06;

public double beforetaxcost(int amount, double unitcost) {
double totalbtax=amount*unitcost;
return totalbtax;
}

public double totalsalestax (int amount, double unitcost) {
double totalsales=taxPercent*(beforetaxcost(amount, unitcost));
return totalsales;
}

public double aftertaxcost (int amount, double unitcost) {
double totalatax=beforetaxcost(amount, unitcost)+totalsalestax(amount, unitcost);
return totalatax;
}

public String outmessage (String i, int amount, double unitcost) {
String out =("item: "+i+"\n"+"amount of item: "+amount+"\ncost per unit: "+unitcost+"\nsales tax: "+taxPercent+"\ncost before sales tax: "+beforetaxcost (amount, unitcost)+"\ntotal sales tax: "+totalsalestax (amount, unitcost)+"\nafter tax cost: "+aftertaxcost (amount, unitcost));
return out;
}

System.out.println(outmessage("socks",3,2.58)+outmessage("envelopes",1,3.25));
    


    
    
    
 } }