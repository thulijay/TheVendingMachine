import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import vending.ExtendableVendingMachine;
import vending.products.*;


public class ExtendableVendingMachineTests {

    @Test
    public void shouldBeAbleToBuySoftDrinks() {
        ExtendableVendingMachine extendable = new ExtendableVendingMachine(3, 5, 9, 6);

        extendable.buy(new SoftDrink());
        extendable.buy(new SoftDrink());


        assertEquals(extendable.getStock(new SoftDrink()), 1);
    }

    @Test
    public void shouldBeAbleToAlertCustomerIfOutOfSoftDrinks() {
        ExtendableVendingMachine extendable = new ExtendableVendingMachine(3, 5, 9, 6);

        extendable.buy(new SoftDrink());
        extendable.buy(new SoftDrink());
        extendable.buy(new SoftDrink());
        extendable.buy(new SoftDrink());


        assertEquals(extendable.getStock(new SoftDrink()), -1);
    }

    @Test
    public void shouldBeAbleToBuySaltySnacks() {
        ExtendableVendingMachine extendable = new ExtendableVendingMachine(3, 5, 9, 6);

        extendable.buy(new SaltySnack());
        extendable.buy(new SaltySnack());

        assertEquals(extendable.getStock(new SaltySnack()), 3);
    }

    @Test
    public void shouldBeAbleToBuyChocolate() {
        ExtendableVendingMachine extendable = new ExtendableVendingMachine(3, 5, 9, 6);

        extendable.buy(new Chocolate());
        extendable.buy(new Chocolate());
        extendable.buy(new Chocolate());
        extendable.buy(new Chocolate());
        extendable.buy(new Chocolate());


        assertEquals(extendable.getStock(new Chocolate()), 4);
    }

    @Test
    public void shouldBeAbleToBuySweets() {
        ExtendableVendingMachine extendable = new ExtendableVendingMachine(3, 5, 9, 6);

        extendable.buy(new Sweet());

        assertEquals(extendable.getStock(new Sweet()), 5);
    }

    @Test
    public void shouldBeABleToBuyAllProducts() {
        ExtendableVendingMachine extendable = new ExtendableVendingMachine(3, 5, 9, 6);

        extendable.buy(new Sweet());
        extendable.buy(new Chocolate());
        extendable.buy(new SaltySnack());
        extendable.buy(new SoftDrink());

        assertEquals(extendable.getStock(new Product()), 19);

    }

    @Test
    public void shouldBeAbleToAddAllProductsToStock() {
        ExtendableVendingMachine extendable = new ExtendableVendingMachine(3, 5, 9, 6);

        extendable.addStock(new Sweet());
        extendable.addStock(new Chocolate());
        extendable.addStock(new SaltySnack());
        extendable.addStock(new SoftDrink());

        assertEquals(extendable.getStock(new Product()), 35);

    }
}