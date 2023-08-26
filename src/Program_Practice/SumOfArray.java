package Program_Practice;

public class SumOfArray{
public static void main(String[] args){
int a[] ={ 1,8,7,56,79,45};
SumOfArray sa = new SumOfArray();
int b = sa.printSum(a);
System.out.println("the sum is " + b);
}
public int printSum(int a[]){
int sum =0;
for(int i=0;i<a.length;i++){
sum = sum + a[i];
}
return sum;
}
}