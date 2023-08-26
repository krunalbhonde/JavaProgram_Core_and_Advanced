package Interview_java;

public class Missing_number {

	public static void main(String[] args) {
		// Write down the program to finding missing number in array
		int [] a = { 1,4,3,2};
		System.out.println("The Missing number in array is " + Missing_no(a));
	}
	public static int Missing_no(int a[]) {
		 int n=a.length+1;    //5
	        int sum=n*(n+1)/2; //15
	        int restSum=0;  
	        for (int i = 0; i < a.length; i++) { //0,1,2,3
	            restSum= restSum + a[i];  //0+1 =1,1+4=5,5+3=8,8+2=10
	        }
	         int missingNumber=sum-restSum; //15-10=5
	        return missingNumber;
	}

}
