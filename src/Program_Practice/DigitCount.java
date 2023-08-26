package Program_Practice;

public class DigitCount{
public static void main(String[] args){
int a = 123456789;
DigitCount dc = new DigitCount();
int n = dc.printSum(a);
System.out.println("The sum of count of digit : " + n);

}
public int printSum(int a){
int count = 0;
int sum = 0;
while(a!=0){
int rem = a % 10;
sum = sum + rem;
a= a/10;
}
return sum;
}
}