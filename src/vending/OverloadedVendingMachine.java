package vending;

import vending.products.*;
public class OverloadedVendingMachine {
    int softDrinks, saltySnacks, chocolates;

    OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolateQty) {
        softDrinks = softDrinkQty;
        saltySnacks = saltySnacksQty;
        chocolates = chocolateQty;
    }

    void buy(SoftDrink softDrink) {
        softDrinks -= 1;
    }

    void buy(SaltySnack saltySnack) {
        saltySnacks -= 1;
    }

    void buy(Chocolate chocolate) {
        chocolates -= 1;
    }

    void buy(Product product) {
        softDrinks -= 1;
        saltySnacks -= 1;
        saltySnacks -= 1;
    }

    void addStock(SoftDrink softDrink){
        softDrinks += 1;
    }

    void addStock(SaltySnack saltySnack){
        saltySnacks += 1;
    }

    void addStock(Chocolate chocolate){
        chocolates += 1;
    }

    void addStock(Product product){
        softDrinks += 3;
        saltySnacks += 3;
        chocolates += 3;
    }

    int getStock(SoftDrink softDrink){
        return softDrinks;
    }

    int getStock(SaltySnack saltySnack){
        return saltySnacks;
    }

    int getStock(Chocolate chocolate){
        return chocolates;
    }

    int getStock(Product product){
        softDrinks += 3;
        saltySnacks += 3;
        chocolates += 3;

        return softDrinks + saltySnacks + chocolates;
    }
}
