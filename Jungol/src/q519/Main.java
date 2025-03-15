package q519;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int plus_100 = n1 + 100;
		int mod_10 = n2 % 10;
		
		System.out.println(plus_100);
		System.out.println(mod_10);

	}

}
