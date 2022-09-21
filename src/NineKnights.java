import java.util.Scanner;

public class NineKnights {
    public static void main(String[] args) {
        if (populateGrid()) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }

    static int[][] grid = new int[5][5];

    static boolean populateGrid() {
        Scanner in = new Scanner(System.in);
        int counter = 0;
        for (int i = 0; i < 5; i++) {
            String row = in.next();
            if (row.length() != 5) {
                return false;
            }
            for (int j = 0; j < 5; j++) {
                char index = row.charAt(j);
                if (index == 'k' && !validPlacement(i, j)) {
                    return false;
                }
                if (validPlacement(i, j) && index == 'k') {
                    grid[i][j] = 1;
                    counter++;
                }
            }
        }
        return counter == 9;
    }

    private static boolean validPlacement(int i, int j) {
        try {
            if (grid[i][j] == 1) {
                return false;
            } else if (grid[i - 2][j - 1] == 1) {
                return false;
            } else if (grid[i - 2][j + 1] == 1) {
                return false;
            } else if (grid[i + 2][j - 1] == 1) {
                return false;
            } else if (grid[i - 1][j - 2] == 1) {
                return false;
            } else if (grid[i - 1][j + 2] == 1) {
                return false;
            } else if (grid[i + 1][j + 2] == 1) {
                return false;
            } else if (grid[i + 1][j - 2] == 1) {
                return false;
            }


        } catch (IndexOutOfBoundsException e) {
            return true;
        }
        return true;
    }
}
