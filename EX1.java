package SEP;

import java.util.Scanner;

public class EX1 {
	// nhap vao 2 so a va b bat ki sao cho a != b tinh tong tu a den b
	public static void main(String[] args) {
		int sum = 0;
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		// nhap hai so a va b 
		do {
			System.out.println("Input 2 numbers");
			System.out.print("inut a = ");
			 a = sc.nextInt();
			System.out.print("input b = ");
			 b = sc.nextInt();
			if(
			System.out.print("please enter again!!!");
				}
		}while(a==b);
		
			//tinh tong tua den b
		if(a<b) {
			for(int i = a ; i <= b; i++) {
				sum+=i;
			}
			System.out.println("sum of a and b is " + sum);
		}else if(a>b) {
			for(int i = b; i<=a;i++) {
			}
			System.out.println("sum of a and b is " + sum);
		}
		
	}
}
