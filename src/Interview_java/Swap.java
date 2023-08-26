package Interview_java;
public class Swap {
	public static void main(String[] args) {
		// Program to swap two integer without using third variable
		//& swap two string without using third string
		int a = 23;
		int b = 25;
		String s1 = "First ";
		String s2 = "Last ";
		System.out.println("Before Swaping two variable is " + a + " "+ b);
		Swap_variable(a,b);
		System.out.println("Before Swaping two string is " + s1 + " "+ s2);
		Swap_string(s1,s2);
	}
	public static void Swap_variable(int a,int b) {
		a = a + b; // 23+25 = 48
		b = a - b; // 48-25 = 23
		a = a - b; // 48-23 = 25
		System.out.println("After Swaping of two variable is " + a + " " + b);
	}
	public static void Swap_string(String s1, String s2) {
		s1 = s1 + s2;   // =FirstLast
        s2 = s1.substring(0, s1.length()-s2.length());  // (0, (8-3))= 0,5
                                                     // s2 = First 
		s1 = s1.substring(s2.length()); // last
		System.out.println("After Swaping of two string is " + s1 + " " + s2);
	}
}
