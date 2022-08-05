package Assignment1;

import java.util.Scanner;

public class FifthQuestion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n=sc.nextInt();
		for(int i=0; i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||i==(n-1)||j==0||i+j<=(n-1)/2||i-j>=(n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
