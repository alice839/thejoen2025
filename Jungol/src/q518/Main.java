package q518;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	int n3 = sc.nextInt();
	
	int sum = n1+n2+n3;
	int avg = (n1+n2+n3)/3;
	
	System.out.println("sum" + " : " + sum);
	System.out.println("avg" + " : " + avg);

	}
}
