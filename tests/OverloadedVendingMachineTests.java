<<<<<<< HEAD
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import vending.ExtendableVendingMachine;
import vending.OverloadedVendingMachine;
import vending.products.Chocolate;
import vending.products.Product;
import vending.products.SaltySnack;
import vending.products.SoftDrink;


public class OverloadedVendingMachineTests {
    @Test
    public void shouldBeToBuyChocolates(){
        OverloadedVendingMachine overloaded = new OverloadedVendingMachine(8, 7, 6);

        overloaded.buy(new Chocolate());
        overloaded.buy(new Chocolate());

        assertEquals(overloaded.getStock(new Chocolate()),4);
    }

    @Test
    public void shouldBeAbleToBuySoftDrinks(){
        OverloadedVendingMachine overloaded = new OverloadedVendingMachine(12, 7, 6);

        overloaded.buy(new SoftDrink());
        overloaded.buy(new SoftDrink());
        overloaded.buy(new SoftDrink());
        overloaded.buy(new SoftDrink());

        assertEquals(overloaded.getStock(new SoftDrink()), 8);
    }

    @Test
    public void shouldBeAbleToBuySaltySnacks(){
        OverloadedVendingMachine overloaded = new OverloadedVendingMachine(12, 7, 6);

        overloaded.buy(new SaltySnack());
        overloaded.buy(new SaltySnack());
        overloaded.buy(new SaltySnack());

        assertEquals(overloaded.getStock(new SaltySnack()), 4);
    }

    @Test
    public void shouldBeAbleToBuyFromEachProduct(){
        OverloadedVendingMachine overloaded = new OverloadedVendingMachine(12, 7, 6);

        overloaded.buy(new Chocolate());
        overloaded.buy(new Chocolate());
        overloaded.buy(new SoftDrink());
        overloaded.buy(new SoftDrink());
        overloaded.buy(new SoftDrink());
        overloaded.buy(new SaltySnack());
        overloaded.buy(new SaltySnack());
        overloaded.buy(new SaltySnack());
        overloaded.buy(new SaltySnack());
        overloaded.buy(new Product());

        assertEquals(overloaded.getStock(new Product()), 22);
    }

    @Test
    public void shouldBeAbleToAddSoftDrinksToTheStock(){
        OverloadedVendingMachine overloaded = new OverloadedVendingMachine(3, 5, 9);

        overloaded.addStock(new SoftDrink());

        assertEquals(overloaded.getStock(new SoftDrink()),4);
    }

    @Test
    public void shouldBeAbleToAddSaltySnacksToTheStock(){
        OverloadedVendingMachine overloaded = new OverloadedVendingMachine(3, 5, 9);

        overloaded.addStock(new SaltySnack());

        assertEquals(overloaded.getStock(new SaltySnack()),6);
    }

    @Test
    public void shouldBeAbleToAddChocolatesToTheStock(){
        OverloadedVendingMachine overloaded = new OverloadedVendingMachine(3, 5, 9);

        overloaded.addStock(new Chocolate());

        assertEquals(overloaded.getStock(new SoftDrink()),3);
    }
=======
package PACKAGE_NAME;public class OverloadedVendingMachineTests {
>>>>>>> 87c00d3485de60ea59212f8392557e1590d838aa
}
