package practiceJava;
import java.util.*;
public class petternPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*solid rectangle*/
		/*
			int row = 4;
			int col = 5;
			for(int i = 1; i<=row; i++) {
				for(int j=1; j<= col; j++) {
					System.out.print(" * ");
				}
				System.out.println();
			}
		*/
		/*hollow rectangle*/
		/*
			int row = 4;
			int col = 5;
			for(int i = 1; i<=row; i++) {
				for(int j=1; j<= col; j++) {
					if(i == 1 || j == 1 || i == row || j == col) {
						System.out.print(" * ");
					}else {
						System.out.print("   ");
					}
				}
				System.out.println();
			}
		*/
		/*half pyramid*/
		/*
			int row = 4;
			for(int i = 0; i<= row; i++) {
				for (int j=0; j<=i; j++) {
					System.out.print(" * ");
				}
				System.out.println();
			}
		*/
		/*
			int row = 4;
			int k = row;
			for(int i = row; i>=1; i--) {
				for (int j = 1; j<=i; j++) {
					System.out.print(" * ");
				}
				System.out.println();
			}
		*/
		/*
			int row = 4;
		
			for(int i = 1; i<=row; i++) {
				for(int j = 1; j <= row -1 ; j++) {
					System.out.print(" ");	
				}
				for (int j = 1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		*/
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 * */
		/*
			int row = 5;
			for (int i = 1; i<=row; i++) {
				for(int j = 1; j<=i; j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		*/
		/*12345
		 *12345
		 *123
		 *12
		 *1
		 * */
		/*
			int row = 5;
			for (int i = row; i >= 1; i--) {
				for(int j = 1; j<=i; j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		*/
		/*floyd's triangle*/
		/*
			int n = 5;
			
			for (int i = 1; i<=n; i++) {
				for(int j = 1; j<=i; j++) {
					if((i+j) % 2 == 0) {
						System.out.print(1+" ");
					}else {
						System.out.print(0+" ");
					}
				}
				System.out.println();
			}
		*/
		/*Print a solid rombhus.*/
		/*
			int row = 10;
			
			for (int i = 1; i<=(row/2)+1; i++) {
				for(int j = i; j<=(row/2); j++) {
					System.out.print(" ");
				}
				for (int j =1; j<= (row/2); j++) {
					System.out.print(" * ");
				}
				System.out.println();
			}
		*/
		/*Print a number pyramid.*/
		/*
			int n = 5;
			for (int i = 1; i <= n; i++) {
				for(int j = i; j<=n; j++) {
					System.out.print(" ");
				}
				for(int j = 1; j<=i; j++) {
					System.out.print(i+" ");
				}
				System.out.println();
			}
		*/
		/*Print a palindromic number pyramid.
		 *          1 
			      2 1 2 
			    3 2 1 2 3 
			  4 3 2 1 2 3 4 
			5 4 3 2 1 2 3 4 5 
		 * */
		/*
			int n = 5;
			for (int i = 1; i <= n; i++) {
				for(int j = 1; j<=(n - i); j++) {
					System.out.print("  ");
				}
				for(int j = i; j>=1; j--) {
					System.out.print(j+" ");
				}
				for(int j = 2; j<=i; j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		*/
		/*
			*  ****
			*  *   
			*  *   
			*******
			   *  *
			   *  *
			****  *
		 * */
		/*
			int n = 7;
			
			for (int i = 1; i <= n; i++) {
				for(int j = 1; j<=n; j++) {
					if( i == (n/2)+1 || j == (n/2)+1 || 
							(i == 1 && j>= (n/2)+1) || (i == n && j <= n/2 ) || 
							(j == 1 && i <= n/2 ) || (j == n && i >= (n/2)+1) 
					) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		*/
		
		
		
		
	}
}
