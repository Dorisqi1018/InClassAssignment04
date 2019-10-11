public class Receipt {
     double baseCost, taxPercentage, tipPercentage;
     String totalCost;




    public String toString(){
        return totalCost + "equals to " + baseCost * (1 + taxPercentage + tipPercentage);
    }
}
