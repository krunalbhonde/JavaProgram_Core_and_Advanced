package Program_Practice;

public class PallindromNumber{
public static void main(String[] args){
int n = 121;

checkPallindrom(n);
}
public static void checkPallindrom(int n){
int rev =0;
int original = n;
int rem = 0;
while(n>0){
rem = n % 10;
rev = rev *10 + rem;
n= n/10;
}
if(original==rev){
System.out.println(rev + " is an pallindrome number");
}else{
System.out.println(rev + " is not  an pallindrome number");
}

}
}