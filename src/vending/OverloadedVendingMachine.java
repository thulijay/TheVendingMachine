package vending;

import vending.products.*;
public class OverloadedVendingMachine {
    int softDrinks, saltySnacks, chocolates, total;

    public OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolateQty) {
        softDrinks = softDrinkQty;
        saltySnacks = saltySnacksQty;
        chocolates = chocolateQty;
    }

    //***************************************************************************************************************************

    public   void buy(SoftDrink softDrink) {
        softDrinks -= 1;
    }

    public void buy(SaltySnack saltySnack) {
        saltySnacks -= 1;
    }

    public void buy(Chocolate chocolate) {
        chocolates -= 1;
    }

    public  void buy(Product product) {
        softDrinks -= 1;
        saltySnacks -= 1;
        saltySnacks -= 1;
    }

    //***************************************************************************************************************************


    public  void addStock(SoftDrink softDrink){
        softDrinks += 1;
    }

    public  void addStock(SaltySnack saltySnack){
        saltySnacks += 1;
    }

    public void addStock(Chocolate chocolate){
        chocolates += 1;
    }

    public  void addStock(Product product){
        softDrinks += 3;
        saltySnacks += 3;
        chocolates += 3;
    }

    //***************************************************************************************************************************


    public   int getStock(SoftDrink softDrink){
        return softDrinks;
    }

    public  int getStock(SaltySnack saltySnack){
        return saltySnacks;
    }

    public  int getStock(Chocolate chocolate){
        return chocolates;
    }

    public  int getStock(Product product){
        softDrinks += 3;
        saltySnacks += 3;
        chocolates += 3;

        total =  softDrinks + saltySnacks + chocolates;

        return total;
    }

    public static void Main(String ...args){
        OverloadedVendingMachine overloaded = new OverloadedVendingMachine(5, 7, 10);

    }
}
