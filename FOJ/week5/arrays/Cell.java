public class Cell
{
    public static final int BLANK = -1;

    private int number;
    private boolean locked;

    public Cell()
    {
        number = BLANK;
    }

    public void setNumber(int number, boolean lock)
    {
        if (!locked)
        {
            this.number = number;
            this.locked = lock;
        }
    }

    public int getNumber()
    {
        return number;
    }

    public void print()
    {
        System.out.print(number==BLANK?"  ":(number+" "));
    }
    
    public String toString()
    {
        return "" + number;
    }
}
