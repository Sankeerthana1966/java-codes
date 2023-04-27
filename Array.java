//Arrays
import java.util.Scanner;
class Array{
	public static void main(String args[])
	{
		int n,k;
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int [10][9];
		System.out.println("value of n :");
		n=sc.nextInt();
		System.out.println("value of k is:");
		k=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<k;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array elements are");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
	}
}
