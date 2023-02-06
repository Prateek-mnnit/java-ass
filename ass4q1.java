import java.util.*;
class Rainfall{
	int rain[];
	public void getval(){
		Scanner s = new Scanner(System.in);
		for(int i = 0; i<12;i++){
			rain[i] = s.nextInt();
		}
	}
	Rainfall(){
	this.rain=new int[12];
	}
	int total(){
		int sum = 0;
		for(int i = 0;i<12;i++){
			sum+=rain[i];
		}
		return sum;
	
	}
	
	double avg(){
			int sum = 0;
		for(int i = 0;i<12;i++){
			sum+=rain[i];
			
		}
		double a = sum/12;
		return a;
	}
	
	int most(){
		int max = rain[0];
		for(int i =0;i<12;i++){
			if(rain[i]>max)
				max = rain[i];
		}
		return max;
	}
	
	int least(){
		int min = rain[0];
		for(int i =0;i<12;i++){
			if(rain[i]<min)
				min = rain[i];
		}
		return min;
	}

}

public class one{
	public static void main(String args[]){
		Rainfall r = new Rainfall();
		r.getval();
		
		System.out.println("total rainfall: " +r.total());
		System.out.println("avarage monthaly rainfall: " +r.avg());
		System.out.println("most rainfall: " +r.most());
		System.out.println("least rainfall: " +r.least());
	}
}
