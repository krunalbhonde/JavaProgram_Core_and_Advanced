package Interview_java;

public class CountEvenodd {

	public static void main(String[] args) {
		// Program to count even odd digit in number
		int a = 123456789;
		int evencount =0;
		int oddcount =0;
		while(a!=0) {
			if(a%2 ==0) {
				evencount++; 
			}else {
				oddcount++; 
			}
			a = a/10;		
		}
		System.out.println("Even count is " + evencount);
        System.out.println("Odd count is " + oddcount);
	}

}
