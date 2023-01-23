import java.util.Scanner;
public class pr1{
	int real;
	int complex;



	public static void main(String[] args){
		pr1 c = new pr1();
 		Scanner s = new Scanner(System.in);
		c.real = s.nextInt();
		c.complex = s.nextInt();
		System.out.println(c.real +"+"+c.complex+"i");
	}
}
