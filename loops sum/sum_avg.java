import java.util.Scanner;
public class sum_avg{
public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	System.out.println("enter the limit:");
	int n=in.nextInt();
	int sum=0,a;
	for (int i=1;i<=n;i++){
			System.out.println("enter the number" + i + ":");
			a=in.nextInt();
			sum+=a;
	}
	System.out.println("the sum of the given number is:" + sum);
	System.out.println("the avg of the given number is:" + sum/n);
}
}