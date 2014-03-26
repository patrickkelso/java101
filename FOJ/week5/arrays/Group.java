public class Group
{
    private Cell c1,c2,c3,c4;

    public Group()
    {
        this(new Cell(), new Cell(), new Cell(), new Cell());
    }

    public Group(Group g1, Group g2, int pos1, int pos2)
    {
        this(g1.getCell(pos1), g1.getCell(pos2), g2.getCell(pos1), g2.getCell(pos2));
    }

    public Group(Cell c1, Cell c2, Cell c3, Cell c4)
    {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
    }

    public void enterNumber(int cellPos, int number, boolean lock)
    {
        Cell cell = getCell(cellPos);
        cell.setNumber(number, lock);
    }

    public Cell getCell(int cellPos)
    {
        switch (cellPos)
        {
            case 1: return c1;
            case 2: return c2;
            case 3: return c3;
            case 4: return c4;
        }
        return null;
    }

    public boolean isSolved()
    {
        return c1.getNumber() + c2.getNumber() + c3.getNumber() + c4.getNumber() == 1+2+3+4;
    }

    public void print()
    {
        c1.print();
        c2.print();
        c3.print();
        c4.print();
        System.out.println();
    }
    
    public String toString()
    {
        return "\n{" + c1 + "," + c2 + "," + c3 + "," + c4 + "}";
    }
}
