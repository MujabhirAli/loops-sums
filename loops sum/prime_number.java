import java.util.Scanner;
public class prime_number{
public static void main(String args[]){
Scanner in =new Scanner(System.in);
System.out.println("enter the number:");
int n=in.nextInt();
int f=0;
	for(int i=1;i<=n;i++){
		if(n%i==0){
			f++;
	}	
	}
if (f==2){
	System.out.println(n + " is a prime number");
}else {
	System.out.println(n + " not a prime number");
}
}
}