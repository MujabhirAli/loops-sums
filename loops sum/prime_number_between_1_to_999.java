public class prime_number_between_1_to_999{
public static void main(String args[]){
	for(int n=1;n<=20;n++){
		int f=0;
	for(int i=1;i<=20;i++){	
		if(n%i==0){
			f++;
	}	
	}
if (f==2){
	System.out.println(n + " is a prime number");
}
}
}
}