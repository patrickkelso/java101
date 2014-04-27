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

	public Group(Cell c1, Cell c2, Cell c3, Cell c4)
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
		int total = 0;
		for (int i = 0; i < cells.length; i++)
			total += cells[i].getNumber();

		return total == 1+2+3+4;
	}

	public void print()
	{
		for (int i = 0; i < cells.length; i++)
			cells[i].print();
		System.out.println();
	}
	
	public String toString()
	{
		String s = "\n{";
		for (int i = 0; i < cells.length - 1; i++)
			s += cells[i] + ",";
		s += cells[3] + "}";
		return s;
	}
}
