package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of columns: ");
		int m = sc.nextInt();
		System.out.print("Enter the number of rows: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		System.out.println("Enter the values:");
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0;j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter a number:");
		int x = sc.nextInt();
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if(j > 0)
						System.out.println("Left: " + mat[i][j-1]);
					if(j < mat[i].length-1)
						System.out.println("Right: " + mat[i][j+1]);
					if(i > 0)
						System.out.println("up: " + mat[i-1][j]);
					if(i < mat[i].length-1)
						System.out.println("Down: " + mat[i+1][j]);
				}
			}
			
		}
		
		sc.close();
	}
}
