package Program_Practice;
import java.util.Scanner;
public class Cla {
	

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	char Operator = sc.next().charAt(0);
	calculator(a,b,Operator);

	}
	public static void calculator(int a,int b,char Operator){
	switch(Operator){
	case'+' : System.out.println((a+b));
	break;
	case'-' : System.out.println((a-b));
	break;
	case'*' : System.out.println((a*b));
	break;
	case'/' : System.out.println((a/b));
	break;
	case '%':if(b!=0){
	System.out.println("Invalid number");
	}else{
	System.out.println(a%b);
	}
	break;
	default: System.out.println("Invalid number");
	}
	}
	}
