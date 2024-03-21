import java.util.Scanner;

public class strong_number {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = in.nextInt();
        int orginal_number=num;
		int sum = 0;
		while(num>0){
			int rem=num%10;
			int fact=1;
for(int i=1;i<=rem;i++){
	fact*=i;//fact=fact*i
}
 sum+=fact;
 num=num/10;
	}
	if(sum==orginal_number){
		        System.out.println(orginal_number + "is a strong number");
	}else{
				        System.out.println(orginal_number + "is not a strong number");

	}
    }
}
