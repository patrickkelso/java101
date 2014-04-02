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
    private Group[] reg;
    // 4 rows
    private Group[] row;
    // and 4 columns
    private Group[] col;

    public Sudoku()
    {
        // If you use an array here, you can also easily use an array loop.
        reg = new Group[4];
        reg[0] = new Group();
        reg[1] = new Group();
        reg[2] = new Group();
        reg[3] = new Group();

        // You can use arrays here, but don't bother using a loop - it is too difficult.
        row = new Group[4];
        row[0] = new Group(reg[0], reg[1], 1, 2);
        row[1] = new Group(reg[0], reg[1], 3, 4);
        row[2] = new Group(reg[2], reg[3], 1, 2);
        row[3] = new Group(reg[2], reg[3], 3, 4);

        // You can use arrays here, but don't bother using a loop.
        col = new Group[4];
        col[0] = new Group(reg[0], reg[2], 1, 3);
        col[1] = new Group(reg[0], reg[2], 2, 4);
        col[2] = new Group(reg[1], reg[3], 1, 3);
        col[3] = new Group(reg[1], reg[3], 2, 4);
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
            case 1: return reg[0];
            case 2: return reg[1];
            case 3: return reg[2];
            case 4: return reg[3];
        }
        return null;
    }

    /**
     * This method returns true if every region, every row and
     * every column is solved (i.e. has all the numbers 1 to 4)
     */
    public boolean isSolved()
    {
        return reg[0].isSolved() && reg[1].isSolved() && reg[2].isSolved() && reg[3].isSolved()
            && row[0].isSolved() && row[1].isSolved() && row[2].isSolved() && row[3].isSolved()
            && col[0].isSolved() && col[1].isSolved() && col[2].isSolved() && col[3].isSolved();
    }

    public void print()
    {
        System.out.println();
        row[0].print();
        row[1].print();
        row[2].print();
        row[3].print();
        System.out.println();
    }
}
