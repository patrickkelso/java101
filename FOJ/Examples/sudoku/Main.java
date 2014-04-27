import java.util.*;

public class Main
{
    private static Scanner keyboard = new Scanner(System.in);
    private static Sudoku sudoku;

    public static void main(String[] args)
    {
        sudoku = new Sudoku();
        System.out.println("Configure puzzle");
        for (int i = 0; i < 5; i++)
            io(true);

        System.out.println("Puzzle entered. Time to solve!");
        while (!sudoku.isSolved())
            io(false);
        System.out.println("Solved!");
    }

    private static void io(boolean lock)
    {
        int region = promptInt("Region: ");
        int cell = promptInt("Cell: ");
        int number = promptInt("Number: ");
        sudoku.enterNumber(region, cell, number, lock);
        sudoku.print();
    }

    private static int promptInt(String prompt)
    {
        System.out.print(prompt);
        return keyboard.nextInt();
    }
}
