package Program_Practice;

public class ReverseArray {
	
		public static void main(String[] args){
		int [] a = {1,2,43,56,77,89};
		int round =2;
		for(int j=1;j<=round;j++){
		int last = a[a.length-1];
		for(int i=a.length-1;i>0;i--){
		a[i] = a[i-1];
		}
		a[0] = last;
		}
		for(int i=0;i<a.length;i++){
		System.out.print(a[i] + " ");
		}
		}
}
