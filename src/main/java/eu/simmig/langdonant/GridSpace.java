package eu.simmig.langdonant;

public class GridSpace {
    public static final int WHITE = 0;
    public static final int BLACK = 1;

    private int width;
    private int height;
    private int grid[][];

    public GridSpace(int width, int height) {
        this.width = width;
        this.height = height;
        grid = new int[width][height];
    }

    public int switchColor(int x, int y) {
        int newColor = (getColor(x, y) == BLACK) ? WHITE : BLACK;
        setColor(x, y, newColor);
        return newColor;
    }

    public void setColor(int x, int y, int color) {
        grid[x][y] = color;
    }

    public int getColor(int x, int y) {
        return grid[x][y];
    }

}
