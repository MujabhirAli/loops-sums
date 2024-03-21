class Someclass{
private Someclass(){
}
}
public class Main{
Main(){}
Main(Main mainobj){
System.out.println("copy constructor");
}
public static void main(String[]args){
Main m = new Main();
new Main(m);
}
}