package src;

import java.util.Arrays;

public class flipping_image {
    public static void main(String[] args) {
        int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0},{1,1},{1,0},{0,0}};
        System.out.println("Inverted Array:" + Arrays.toString(flipAndInvertImage(image)));
    }
    public static int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {
            for (int j = 0, k = image[i].length-1; k>j; j++, k--) {
                int temp = image[i][j];
                image[i][j] = image[i][k];
                image[i][k] = temp;
            }
        }
        for(int l =0; l<image.length;l++) {
            for (int m = 0; m< image[l].length; m++) {
                if(image[l][m]==0)
                {
                    image[l][m] = 1;
                }
                else if(image[l][m]==1){
                    image[l][m] = 0;
                }
            }
        }
        return image;
    }
}

