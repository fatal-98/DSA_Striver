// import java.util.Scanner;
// import java.util.*;
// public class basicmaths {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n =sc.nextInt();
//     int noofdigits =0;
//     int reverse =0;
//     int count = String.valueOf(n).length();               
//     while (n>0) {
//       noofdigits++;
//       int lastdigit = n %10;
//       n/=10;
//       reverse =(reverse*10)+lastdigit;
      
//     }
//     System.out.println(reverse);
//     System.out.println("\n");
//      System.out.print(noofdigits);
//     // int noofdigit = (int)(Math.log10(n)+1);
//     // System.out.println(noofdigit);
//   }
  
// }
public class basicmaths {

	static boolean isAngstrom(int n){
		int count = String.valueOf(n).length();
		int sum =0;
		int dup = n;
		while(n>0){
			int ld = n%10;
            sum += Math.pow(ld,count);
			n /=10;
		}
		if(sum == dup){
			return true;
		}
		else {
			return false;
		}
	}
	public static void main (String []args){
		System.out.println(isAngstrom(1634));
	}

}
