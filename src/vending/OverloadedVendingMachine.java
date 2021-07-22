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
        --softDrinks;
    }

    void buy(SaltySnack saltySnack) {
        --saltySnacks;
    }

    void buy(Chocolate chocolate) {
        --chocolates;
    }

    void buy(Product product) {
        --softDrinks;
        --saltySnacks;
        --chocolates;
    }

    void addStock(SoftDrink softDrink){
        ++softDrinks;
    }

    void addStock(SaltySnack saltySnack){
        ++saltySnacks;
    }

    void addStock(Chocolate chocolate){
        ++chocolates;
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
