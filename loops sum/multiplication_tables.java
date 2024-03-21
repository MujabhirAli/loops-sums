import java.util.Scanner;
public class multiplication_tables{
public static void main(String args[]){
Scanner in =new Scanner(System.in);
System.out.println("enter the table:");
int t=in.nextInt();
System.out.println("enter the limit:");
int l=in.nextInt();

	for(int i=1;i<=l;i++){
System.out.println(t + " x " + i + " = " + (t*i));

}	
}
}