class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int rows = grid.length;
        int cols = grid[0].length;
        int row = 0, col = 0;
        visited[row][col] = true;
        while (true) {
            int nextrow = row;
            int nextcol = col;
            switch (grid[row][col]) {
                case 'R' -> nextcol++;
                case 'D' -> nextrow++;
                case 'U' -> nextrow--;
                case 'L' -> nextcol--;

            }
            if(nextrow < 0 || nextrow >= rows || nextcol < 0 || nextcol >= cols || visited[nextrow][nextcol]){
                break;
            }
            col = nextcol;
            row = nextrow;
            visited[row][col] = true;
        }
        return new int[] { row, col };
    }
}