
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * An image is represented by a 2-D array of integers, each integer representing
 * the pixel value of the image (from 0 to 65535).
 * 
 * Given a coordinate (sr, sc) representing the starting pixel (row and column)
 * of the flood fill, and a pixel value newColor, "flood fill" the image.
 * 
 * To perform a "flood fill", consider the starting pixel, plus any pixels
 * connected 4-directionally to the starting pixel of the same color as the
 * starting pixel, plus any pixels connected 4-directionally to those pixels
 * (also with the same color as the starting pixel), and so on. Replace the
 * color of all of the aforementioned pixels with the newColor.
 * 
 * At the end, return the modified image.
 * 
 * @author SCION
 */
public class FloodFill {
	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
//  this is to handle the case when  our new color
//is same as the pixelat [sr][sc],   so now we dont need to make any call.
		if (image[sr][sc] == newColor)
			return image;
//  in our helper function we pass our prev color along with new color
//  so that we can change those elem to new color that match the prev ocolor
		int res[][] = helper(image, sr, sc, image[sr][sc], newColor);
		return res;
	}

	static int[][] helper(int arr[][], int i, int j, int prevclr, int newclr) {
		if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] != prevclr)
			return null;
		arr[i][j] = newclr;
//up
		helper(arr, i - 1, j, prevclr, newclr);
//down
		helper(arr, i + 1, j, prevclr, newclr);
//left
		helper(arr, i, j - 1, prevclr, newclr);
//right
		helper(arr, i, j + 1, prevclr, newclr);
		return arr;
	}

	public static void main(String[] args) {
		int image[][] = { { 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 0, 0 }, 
				{ 1, 0, 0, 1, 1, 0, 1, 1 },
				{ 1, 2, 2, 2, 2, 0, 1, 0 }, 
				{ 1, 1, 1, 2, 3, 0, 1, 0 }, 
				{ 1, 1, 1, 2, 2, 2, 2, 0 },
				{ 1, 1, 1, 1, 1, 2, 1, 1 }, 
				{ 1, 1, 1, 1, 1, 2, 2, 1 }, };
		System.out.println(image.length);
		System.out.println(".....->" + image[0].length);
//        src is (2,4) and change it and all its adj and their adj nodes to 6.
//        can be done using recursion or the concept of graphs
		int res[][] = floodFill(image, 2, 4, 6);
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res.length; j++) {
				System.out.print(res[i][j]);
			}
			System.out.println(" ");
		}

	}
}
