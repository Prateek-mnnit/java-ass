import java.util.*;
class Array{
	int arr[];
	public void getval(){
		Scanner s = new Scanner(System.in);
		for(int i = 0; i<12;i++){
			arr[i] = s.nextInt();
		}
	}
	Array(){
	this.arr=new int[12];
	}
	int total(){
		int sum = 0;
		for(int i = 0;i<12;i++){
			sum+=arr[i];
		}
		return sum;
	
	}
	
	double avg(){
			int sum = 0;
		for(int i = 0;i<12;i++){
			sum+=arr[i];
			
		}
		double a = sum/12;
		return a;
	}
	
	int most(){
		int max = arr[0];
		for(int i =0;i<12;i++){
			if(arr[i]>max)
				max = arr[i];
		}
		return max;
	}
	
	int least(){
		int min = arr[0];
		for(int i =0;i<12;i++){
			if(arr[i]<min)
				min = arr[i];
		}
		return min;
	}

}

public class two{
	public static void main(String args[]){
		Rainfall r = new Rainfall();
		r.getval();
		
		System.out.println("total rainfall: " +r.total());
		System.out.println("avarage monthaly rainfall: " +r.avg());
		System.out.println("most rainfall: " +r.most());
		System.out.println("least rainfall: " +r.least());
	}
}
