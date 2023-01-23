import java.util.Scanner;
class Pr3DefaultConstructor{
	int real,imaginary;
	Pr3DefaultConstructor(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter real part");
		real = s.nextInt();
		System.out.println("Enter imaginary part");
		imaginary = s.nextInt();
		}	
	public static void main(String args[])
	{
		Pr3DefaultConstructor c = new Pr3DefaultConstructor();
		System.out.println(c.real+ "+"+c.imaginary+"i");
	} 
}
