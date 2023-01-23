import java.util.Scanner;
public class pr2{
	int real,imaginary;
	void InputData()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter real part");
		real= s.nextInt();
		System.out.println("Enter imaginary part");
		imaginary = s.nextInt();
	}
	public static void main(String args[]){
		pr2 c = new pr2();
		c.InputData();
		System.out.println(c.real + "+" + c.imaginary+"i");
		
	}
}
