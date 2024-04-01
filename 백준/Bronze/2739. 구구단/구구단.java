import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		sc.close();
		
		for(int i=num; i<num+1; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(num + " * " + j + " = " + num * j);
			}
		}
	}
}
