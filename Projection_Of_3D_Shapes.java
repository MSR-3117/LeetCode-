// Problem : Surface Area of 3D Shapes LeetCode (892)

// My Solution

class Solution {
    public int surfaceArea(int[][] grid) {
        int sum = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int h = grid[i][j];

                // base surface for a stack of height h
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
  - 2 faces for top and bottom (only if h > 0)
- Adjacent stacks share faces which must not be counted.
- For every cell, subtract the overlapping faces using:
  min(current height, adjacent height) in all four directions.

Design Choices:
- Calculated full surface area for each cell first.
- Reduced shared faces by explicitly checking all neighbors.
- Used a helper function to safely validate grid boundaries.

Time Complexity: O(n × m)
Space Complexity: O(1)
*/
