package Basic_Program;

public class Rotate_array_two_position {

	public static void main(String[] args) {
		// write a program to rotate a array by two position
		int[] a= {1,2,3,4,5,6};
		int round = 2;   //round rotate by position
		for(int j=0;j<round;j++) {  //
		int last =a[a.length-1];   //6
		for(int i =a.length-1;i>0;i--) {  //5,4,3,2,1,0
			a[i]=a[i-1];  //a[6] (6)=a.length-1-1=[5] (5) ,
	                     //a[5] 5 = a[4], a[4] = a[3],
			             //a[3] = a[2],a[2] = a[1],
		}
           a[0] = last;
		}
           for(int i=0;i<a.length;i++) {
        	   System.out.print(a[i] +" ");
           }
	}
   }
