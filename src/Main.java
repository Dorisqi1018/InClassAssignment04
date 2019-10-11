public class Main {

    public static void main(String[] args) {
	// write your code here
        Receipt r = new Receipt();

        r.totalCost = "totalCost";
        r.baseCost = 300;
        r.taxPercentage = 0.08;
        r.tipPercentage = 0.18;


        System.out.println("BaseCost: " + r.baseCost);
        System.out.println("TaxPercentage: " + r.taxPercentage);
        System.out.println("TipPercentage: " + r.tipPercentage);

        System.out.println(r);
    }
}
