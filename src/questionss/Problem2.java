package questionss;


/*
*Question: Maximum Coins Collection in a Grid
You are given a 2D grid where each cell contains some coins. You start at the bottom-left corner of the grid and can only move north (↑) or east (→). Your goal is to reach the top-right corner while collecting the maximum number of coins along the way.

Input:
A grid of size m × n, where grid[i][j] represents the number of coins at position (i, j).

You start at the bottom-left corner (m-1, 0).

You can only move north (↑) or east (→).

Output:
Return the maximum number of coins that can be collected by following an optimal path.

Example 1:
Input:
java
Copy
Edit
int[][] grid = {
    {0, 3, 1, 1},
    {2, 0, 0, 4},
    {1, 5, 3, 1}
};
Output:
Copy
Edit
12
*
* */
public class Problem2 {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 3},
                {4, 6, 5},
                {7, 8, 9}
        };


//        int path = findPath(2, 0, grid);
        int path = findMaxCoins(grid,2,0);
        System.out.println("path: " + path);

        String s= "sss";
//        s.equalsIgnoreCase()

    }

    private static int findPath(int i, int j, int[][] grid) {
        if (i < 0 || j >= grid[0].length) {
//            System.out.println(grid[i][j]);
            return 0;
        }
        System.out.println("i: " + i + ", j: " + j);
        int moveRight = findPath(i, j+1, grid);
        int moveUp = findPath(i-1, j, grid);
        return grid[i][j] + Math.max(moveRight,moveUp);
    }

    private static int findMaxCoins(int[][] grid, int i, int j) {
        // Base case: If out of bounds, return 0
        if (i < 0 || j >= grid[0].length) {
            return 0;
        }

        // Recursively collect coins by moving right or up
        int moveRight = findMaxCoins(grid, i, j + 1);
        int moveUp = findMaxCoins(grid, i - 1, j);

        // Return current cell's coins + max of right or up moves
        return grid[i][j] + Math.max(moveRight, moveUp);
    }
}
