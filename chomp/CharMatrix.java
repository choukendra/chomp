/*
 * Implements a 2-D array of characters
 */

public class CharMatrix
{
    // Fields:
    char[][] grid;

    /*
     * Constructor: creates a grid with dimensions rows, cols,
     * and fills it with spaces
     */
    public CharMatrix(int rows, int cols)
    {
        grid = new char[rows][cols]; 
        for(rows = 0; rows < grid[0].length; rows++){
            for(cols = 0; cols < grid.length; cols++){
                grid[rows][cols] = " "; 
            }

        }
    }

    /*
     * Constructor: creates a grid with dimensions rows , cols ,
     * and fills it with the fill  character
     */
    public CharMatrix(int rows, int cols, char fill)
    {
        //your answer goes here
        grid = new char[rows][cols]; 
        for(rows = 0; rows < grid[0].length; rows++){
            for(cols = 0; cols < grid.length; cols++){
                grid[rows][cols] = fill; 
            }

        }
    }

    /*
     * Returns the number of rows in grid
     */
    public int numRows()
    {
        //your answer goes here
        int howManyRows = 0;
        for(int rows = 0; rows < grid[0].length; rows++){
            howManyRows++;
        }
        return howManyRows; 
    }

    /*
     * Returns the number of columns in grid
     */
    public int numCols()
    {
        //your answer goes here
        int howManyCols = 0;
        for(int cols = 0; cols < grid.length; cols++){
            howManyCols++;   
        }
        return howManyCols; 
    }

    /*
     * Returns the character at row, col location
     */
    public char charAt(int row, int col)
    {
        //your answer goes here
        return grid[row][col]; 
        /*for(col = 0; col < grid.length; col++){
        for(row = 0; row < grid[0].length; row++){

        }
        }

         */
    }

    /*
     * Sets the character at row, col location to ch
     */
    public void setCharAt(int row, int col, char ch)
    {
        //your answer goes here
        grid[row][col] = ch; 
    }

    /*
     * Returns true if the character at row, col is a SPACE,
     * false otherwise
     */
    public boolean isEmpty(int row, int col)
    {
        //your answer goes here
        for(int rows = 0; rows < grid[0].length; rows++){
            for(int cols = 0; cols < grid.length; cols++){
                if(grid[row][col] == " "){
                    return true; 
                }else{
                    return false;
                }
            }
        }

    }
    /*
     * Fills the given rectangle with the fill characters.
     * row0, col0 is the upper left corner and row1, col1 is the
     * lower right corner of the rectangle.
     */
    public void fillRect(int row0, int col0, int row1, int col1, char fill)
    {
        //your answer goes here
    }

    /*
     * Fills the given rectangle with the SPACE characters.
     * row0, col0 is the upper left corner and row1, col1 is the
     * lower right corner of the rectangle.
     */
    public void clearRect(int row0, int col0, int row1, int col1)
    {
        //your answer goes here
    }

    /*
     * Returns the count of all non-SPACE characters in row.
     */
    public int countInRow(int row)
    {
        //your answer goes here
        int count = 0;
        for(int col = 0; col < grid.length; col++){
            if(grid[row][col] != " "){
                count++; 
            }
        }
    }

    /*
     * Returns the count of all non-SPACE characters in col.
     */
    public int countInCol(int col)
    {
        //your answer goes here
        int count = 0;
        for(int row = 0; row < grid[0].length; row++){
            if(grid[row][col] != " "){
                count++; 
            }
        }
    }

    public void printMatrix() {
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                System.out.print(grid[r][c]);
            }
            System.out.println("");
        }
    }
}
