/**
 * This class defines a 4x4 sudoku board.
 * To win, you must fill in the numbers so that
 * - each row contains every number 1-4
 * - each column contains every number 1-4
 * - each 2x2 region in each corner contains every number 1-4
 */
public class Sudoku
{
    // The sudoku board has 4 regions.
    private Group reg1, reg2, reg3, reg4;
    // 4 rows
    private Group row1, row2, row3, row4;
    // and 4 columns
    private Group col1, col2, col3, col4;

    public Sudoku()
    {
        // If you use an array here, you can also easily use an array loop.
        reg1 = new Group();
        reg2 = new Group();
        reg3 = new Group();
        reg4 = new Group();

        // You can use arrays here, but don't bother using a loop - it is too difficult.
        row1 = new Group(reg1, reg2, 1, 2);
        row2 = new Group(reg1, reg2, 3, 4);
        row3 = new Group(reg3, reg4, 1, 2);
        row4 = new Group(reg3, reg4, 3, 4);

        // You can use arrays here, but don't bother using a loop.
        col1 = new Group(reg1, reg3, 1, 3);
        col2 = new Group(reg1, reg3, 2, 4);
        col3 = new Group(reg2, reg4, 1, 3);
        col4 = new Group(reg2, reg4, 2, 4);
    }

    public void enterNumber(int region, int cell, int number, boolean lock)
    {
        getRegion(region).enterNumber(cell, number, lock);
    }

    // NOTE! The parameter will be in the range 1-4, not 0-3.
    private Group getRegion(int regionNumber)
    {
        switch (regionNumber)
        {
            case 1: return reg1;
            case 2: return reg2;
            case 3: return reg3;
            case 4: return reg4;
        }
        return null;
    }

    /**
     * This method returns true if every region, every row and
     * every column is solved (i.e. has all the numbers 1 to 4)
     */
    public boolean isSolved()
    {
        return reg1.isSolved() && reg2.isSolved() && reg3.isSolved() && reg4.isSolved()
            && row1.isSolved() && row2.isSolved() && row3.isSolved() && row4.isSolved()
            && col1.isSolved() && col2.isSolved() && col3.isSolved() && col4.isSolved();
    }

    public void print()
    {
        System.out.println();
        row1.print();
        row2.print();
        row3.print();
        row4.print();
        System.out.println();
    }
}
