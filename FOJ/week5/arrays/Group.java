public class Group
{
    private Cell[] cells;

    public Group()
    {
        this(new Cell(), new Cell(), new Cell(), new Cell());
    }

    public Group(Group g1, Group g2, int pos1, int pos2)
    {
        this(g1.getCell(pos1), g1.getCell(pos2), g2.getCell(pos1), g2.getCell(pos2));
    }

    public Group(Cell cells[0], Cell cells[1], Cell cells[2], Cell cells[3])
    {
      cells[0] = c1;
      cells[1] = c2;
      cells[2] = c3;
      cells[3] = c4;
    }

    public void enterNumber(int cellPos, int number, boolean lock)
    {
        Cell cell = getCell(cellPos);
        cell.setNumber(number, lock);
    }

    public Cell getCell(int cellPos)
    {
      return cells[cellPos-1];
    }

    public boolean isSolved()
    {
        return cells[0].getNumber() + cells[1].getNumber() + cells[2].getNumber() + cells[3].getNumber() == 1+2+3+4;
    }

    public void print()
    {
        cells[0].print();
        cells[1].print();
        cells[2].print();
        cells[3].print();
        System.out.println();
    }
    
    public String toString()
    {
        return "\n{" + cells[0] + "," + cells[1] + "," + cells[2] + "," + cells[3] + "}";
    }
}
