package Part_1;

public class Prectical_9 {
    private int[][] solve_sudoku; 
    public Prectical_9() {
        solve_sudoku = new int[9][9];
    }
    public Prectical_9(int solve_sudoku[][]) {
        this.solve_sudoku = solve_sudoku;
    }

    private boolean InRow(int row, int number) {    //check all elements of whole row.

        for (int i = 0; i < 9; i++) {
            if (solve_sudoku[row][i] == number) {

                return false;
            }
        }
        return true;
    }

    private boolean InCol(int col, int number) {    //check all elements of whole collum.

        for (int i = 0; i < 9; i++) {

            if (solve_sudoku[i][col] == number) {

                return false;
            }
        }
        return true;
    }

    private boolean InBox(int row, int col, int number) {  //check all elements of all 3x3 box.

        int r = row - row % 3;
        int c = col - col % 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (solve_sudoku[i][j] == number) {
                    return false;
                }
            }

        }
        return true;
    }

    private boolean right(int row, int col, int number) {
        boolean check_Col = InCol(col, number);
        boolean check_box = InBox(row, col, number);
        boolean check_Row = InRow(row, number);

        return !(check_box || check_Col || check_Row);
    }

    public static void main(String ar[]) {
        int temp = 0;

        int[][] solution = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 },    //given solution in question.
                { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
                { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                { 3, 4, 5, 2, 8, 6, 1, 7, 9 }
        };
        Prectical_9 a = new Prectical_9(solution);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                boolean c = a.right(i, j, solution[i][j]);
                if (c == true) {
                    temp++;
                }
            }
        }
        if (temp == 81) {
            System.out.println("Given soiution is Valid");
        } else {
            System.out.println("Given soution is not Invalid");
        }
        System.out.println("**THIS PROGRAM IS PREPARED BY DIVY_21CE134**");
    }
}
