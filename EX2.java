package SEP;

import java.util.Scanner;

public class EX2 {
// nhap vao day so nguyen duong va sap xep theo thu tu tang dan sau do in ra so nguyen duong nho nhat trong day
	
	public static void main(String[] args) {
		int n, temp,i,j;	
		boolean check = false;
	    Scanner sc = new Scanner(System.in);
	         
	    do {
	        System.out.println("Input elements to array: ");
	        n = sc.nextInt();
	    } while (n < 0);
	         // khoir tao va cap phat bo nho cho mang
				int[] arr =  new int[n];
	   
	    	for ( i = 0; i < n; i++) {
	    do {
	    	System.out.print("element " + i + ": ");
	    	arr[i] = sc.nextInt();
		if(arr[i] <=0) {
	    		System.out.println("Please enter number > 0 !!! ");
	    				}
	    		}while(arr[i] <= 0);
	    	}
	    	

	    // hien thi mang vua nhap
	    System.out.println("\nFirst Array: ");
	    for ( i = 0; i < n; i++) {
	        System.out.print(arr[i] + "\t");
	    }
	         // sap xep theo thu tu tang dan
	    for ( i = 0; i < n + 1; i++) {
	        for ( j = i + 1; j <= n - 1; j++) {
	            if (arr[i] > arr[j]) {
	                temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }
	    // in day so theo thu tu tang dan
	    System.out.println("\nArray after sorting: ");
	    for ( i = 0; i < n; i++) {
	        System.out.print(arr[i] + "\t");
	    }
	    System.out.println("\nThe smallest element of array is " + arr[0] );
	        
	}
}
