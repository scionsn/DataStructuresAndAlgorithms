//Given an NxN matrix Mat. Sort all elements of the matrix.


import java.util.Arrays;

public class SortedMatrix {
	  int[][] sortedMatrix(int N, int Mat[][]) {
		  int temp[]=new int[N*N];

		  int k=0;
		  for(int i=0;i<N;i++)
		  {
		      for(int j=0;j<Mat[0].length;j++)
		      {
		          temp[k++]=Mat[i][j];
		      }
		  }
		  k=0;
		  Arrays.sort(temp);
		  for(int i=0;i<N;i++)
		  {
		      for(int j=0;j<Mat[0].length;j++)
		      {
		      Mat[i][j]=temp[k++];
		      }
		  }
		       return Mat;   
		      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
