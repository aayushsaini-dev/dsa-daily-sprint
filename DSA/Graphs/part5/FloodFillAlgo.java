import java.util.*;

public class FloodFillAlgo {

    public void helper(int [][] image, int sr, int sc,int color, boolean vis[][], int orgcolour){
    if(sr<0 || sc<0 || sr>= image.length || sc>= image[0].length || vis[sr][sc] || image[sr][sc] != orgcolour){
        return;
    }
    // left
    helper(image, sr, sc-1, color, vis, orgcolour);
    // Right
    helper(image, sr, sc+1, color,vis,orgcolour);
    // up
    helper(image, sr-1, sc, color,vis,orgcolour);
    // down
    helper(image, sr+1, sc, color,vis,orgcolour);

    }

    public int[][] floodFill(int[][] image, int sr, int sc, int colour) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, colour, vis, image[sr][sc]);
        return image;
    }

    public static void main(String[] args) {

    }
}
