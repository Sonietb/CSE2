//Soniet Berrios CSE2 hw02 Arithmetic 
//Due 2/9/16
public class Arithmetic{
   public static void main(String[] args){
       //Number of pairs of pants 
       int numPants = 3;
       //Cost per pair of pants
       double pantsPrice = 34.98;
        //Cost of 3 pants before tax
       double pantsTotal= numPants*pantsPrice;

       //Number of sweatshirts
       int numShirts = 2;
       //Cost per shirt
       double shirtPrice=24.99;
        //Cost of 2 shirts before tax
        double shirtsTotal=numShirts*shirtPrice;

       //Number of belts 
       int numBelts = 1;
       //cost per box of belts? 
       double beltCost= 33.99;
        //Cost of 1 belt before tax
        double beltsTotal=numBelts*beltCost; 
        
         //the tax rate 
       double paSalesTax= 0.06;

        //Cost of all items before tax
        double totalBeforeTax=pantsTotal+shirtsTotal+beltsTotal;
        //Total sales tax 
        double totalSalesTax=totalBeforeTax*paSalesTax;
        //Cost of all items with tax
        double totalAfterTax= totalBeforeTax+totalSalesTax;
        
        //The costs are explicitly casts to int then double so the result would have two decimal places 
        System.out.println("The total price for pants is $"+pantsTotal+
        " with the total tax on pants being $"+(double) ((int) (pantsTotal*paSalesTax*100))/100);
        System.out.println("The total price for shirts is $"+shirtsTotal+
        " with the total tax on shirts being $"+(double) ((int) (shirtsTotal*paSalesTax*100))/100);
        System.out.println("The total price for belts is $"+beltsTotal+
        " with the total tax on belts being $"+(double) ((int) (beltsTotal*paSalesTax*100))/100);
        System.out.println("The total before tax is $"+(double) ((int) (totalBeforeTax*100))/100);
        System.out.println("The total sales tax is $"+(double) ((int) (totalSalesTax*100))/100);
        System.out.println("The total with taxes is $"+(double) ((int) (totalAfterTax*100))/100);
   }
}

