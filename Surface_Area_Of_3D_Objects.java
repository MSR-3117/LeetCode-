// Problem : Surface Area of 3D Shapes LeetCode (892)

// My Solution

class Solution {
    public int surfaceArea(int[][] grid) {
        int sum = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int h = grid[i][j];

                int fullS = h > 0 ? h * 4 + 2 : 0;

                // check left
                if (cellExists(i, j - 1, grid)) {
                    fullS -= Math.min(h, grid[i][j - 1]);
                }

                // check up
                if (cellExists(i - 1, j, grid)) {
                    fullS -= Math.min(h, grid[i - 1][j]);
                }

                // check right
                if (cellExists(i, j + 1, grid)) {
                    fullS -= Math.min(h, grid[i][j + 1]);
                }

                // check down
                if (cellExists(i + 1, j, grid)) {
                    fullS -= Math.min(h, grid[i + 1][j]);
                }

                sum += fullS;
            }
        }
        return sum;
    }

    private static boolean cellExists(int row, int col, int[][] array) {
        return (row >= 0 && row < array.length)
                && (col >= 0 && col < array[0].length);
    }
}

/*
Approach:

The problem asks for the total surface area of 3D shapes formed by stacking
unit cubes on a 2D grid.

Logic Breakdown:
- Each stack of height h contributes:
  - 4 * h side faces
  - 2 faces for top and bottom (if h > 0)
- Adjacent cells share faces, which should not be counted twice.
- For each direction (left, right, up, down), subtract the overlapping area:
  min(current height, adjacent height)

Design Choice:
- Calculated full surface area per cell first.
- Subtracted shared faces by checking all four directions.
- Used a helper method to safely validate adjacent cells.

Time Complexity: O(n × m)
Space Complexity: O(1)
*/
