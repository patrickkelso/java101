/**
 * Example usage:
 *
 * VendingMachine machine = new VendingMachine();
 *
 * machine.insertCoin();
 * machine.insertCoin();
 * ...
 * ...
 * if (machine.chipsReleased())
 * {
 *     Chips chips = machine.getChips();
 *     System.out.println("I got the chips: " + chips);
 * }
 */
public class VendingMachine
{
    // This is private, so the user does not know the price of chips.
    private final int PRICE_OF_CHIPS = 6;

    private int coins;

    public VendingMachine()
    {
        coins = 0;
    }

    public void insertCoin()
    {
        if (coins < PRICE_OF_CHIPS)
        {
            System.out.println("Coin inserted...");
            coins++;
        }
        else
            System.out.println("Cannot insert any more coins");
    }

    public boolean chipsReleased()
    {
        return coins == PRICE_OF_CHIPS;
    }

    public Chips getChips()
    {
        // Reset the machine
        reset();
        // Magically create new chips on demand
        return new Chips();
    }

    private void reset()
    {
        coins = 0;
    }
}
