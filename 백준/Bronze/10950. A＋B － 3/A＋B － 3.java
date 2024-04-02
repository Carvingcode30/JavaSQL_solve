import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int select = sc.nextInt();
		
		int[] sum = new int[select];
		
		for(int i=0; i<select; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum[i] = a+b;
		}
		
		for(int s : sum) {
			System.out.println(s);
		}
	}
}
