package vending;

import vending.products.*;

public class ExtendableVendingMachine {
    int softDrinks, saltySnacks, chocolates, sweets, stock, qty;

    public ExtendableVendingMachine(int SoftDrinks, int SaltySnacks, int Chocolates, int Sweets) {
        this.softDrinks = SoftDrinks;
        this.saltySnacks = SaltySnacks;
        this.chocolates = Chocolates;
        this.sweets = Sweets;
    }

    public void buy(Product product) {
        if (product instanceof SoftDrink) {
            softDrinks--;
        }

        if (product instanceof SaltySnack) {
            this.saltySnacks--;
        }

        if (product instanceof Chocolate) {
            this.chocolates--;
        }

        if (product instanceof Sweet) {
            this.sweets--;
        }
    }

//********************************************************************************************

    public void addStock(Product product) {
        if (product instanceof SoftDrink) {
            softDrinks += 3;
            softDrinks = softDrinks + qty;
            if (softDrinks >= 3) {
                System.out.println(softDrinks + " chocolates has been added to stock!");
            }
        }

        if (product instanceof SaltySnack) {
            saltySnacks += 3;
            saltySnacks = saltySnacks + qty;

            if (saltySnacks >= 3) {
                System.out.println(saltySnacks + " chocolates has been added to stock!");
            }
        }

        if (product instanceof Chocolate) {
            chocolates += 3;
            chocolates = chocolates + qty;

            if (chocolates >= 3) {
                System.out.println(saltySnacks + " chocolates has been added to stock!");
            }
        }

        if (product instanceof Sweet) {
            sweets += 3;
            sweets = sweets + qty;

            if (sweets >= 3) {
                System.out.println(sweets + " sweets has been added to stock!");
            }
        }

    }

//********************************************************************************************

    public int getStock(SoftDrink softDrink) {
        if (softDrinks > 0) {
            System.out.println("Number of soft drinks in stock: " + softDrinks);
        } else if (softDrinks < 0) {
            System.out.println(("Sorry, we are out of stock!"));
        }
        return softDrinks;
    }

    public int getStock(SaltySnack saltySnack) {
         if (saltySnacks > 0) {
                System.out.println("Number of salty snacks in stock: " + saltySnacks);
            } else if (saltySnacks < 0) {
                System.out.println(("Sorry, we are out of stock!"));
            }
         return softDrinks;
        }

    public int getStock(Chocolate chocolate) {
            if (chocolates > 0) {
                System.out.println("Number of chocolates in stock: " + chocolates);
            } else if (chocolates < 0) {
                System.out.println(("Sorry, we are out of stock!"));
            }
            return chocolates;
        }

    public int getStock(Sweet sweet) {
            stock = stock + sweets;
            if (sweets > 0) {
                System.out.println("Number of sweets in stock: " + sweets);
            } else if (sweets < 0) {
                System.out.println(("Sorry, we are out of stock!"));
            }
        return sweets;
    }


    public int getStock(Product product) {
        stock = 0;
        stock = chocolates +softDrinks + sweets + saltySnacks;
        if (stock > 0) {
            System.out.println("Total number of products in stock: " + stock);
        } else if (stock < 0) {
            System.out.println(("Sorry, we are out of stock!"));
        }
        return stock;
    }

//********************************************************************************************

    public void buy(Product product, int qty) {
        if (product instanceof Chocolate) {
            chocolates = chocolates - qty;
        }
        if (product instanceof SaltySnack) {
            saltySnacks = saltySnacks - qty;
        }
        if (product instanceof SoftDrink) {
            softDrinks = softDrinks - qty;
        }
    }