import java.util.Scanner;

public class mir{
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		System.out.println("How many letters are in your name? ");
		int number = scan.nextInt();
		char[] c = new char[number];

		System.out.println("Type your name");
		String name = sc.nextLine();

		for(int i = 0; i < c.length; i++){
			c[i] = name.charAt(i);
		}

		System.out.println("Your name is ");
		for(int i = 0; i < number; i++){
			System.out.print(c[i]);
			System.out.println();
		}

	}
}