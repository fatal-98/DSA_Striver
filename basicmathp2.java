import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class basicmathp2 {
  static int fibo(int n){
    if(n==0 || n==1) return n;
    int last = fibo(n-1);
    int slast = fibo(n-2);
    return last + slast;
  }
  static boolean pali(int i , String na ){ // important 
    if(i>=na.length()/2){
      return true;
    }
    if (na.charAt(i) != na.charAt(na.length()-i-1)){
      return false;
    }
    return pali(i+1, na);
  }
  public static void swapelements(int i, int []arr,int n) {            
      if(i>=n/2){
        return; 
      }
      int temp;
         temp = arr[i];
         arr[i]=arr[n-i-1]; 
         arr[n-i-1]= temp;
         
      for (int e : arr){
        System.out.print(e + " ");
      }     
      swapelements(i+1, arr,n);
  }
  public static int sum(int n){
    if(n==0){
      return 0;
    }
    return n + sum(n-1);
  }
  public static int fact(int n){
    if(n==0|| n==1){
      return 1;
    }
    return n*fact(n-1);
  }
  public static void printNtimes(int i, int n){ 
    if(i>n){
        return;
    }
  System.out.print("Coding Ninjas");
   printNtimes( i+1, n);
}
  public static boolean isPrime(int n){
		int count = 0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count ++;
			}
		}
		if(count ==2){
			return true;
		}
		else{
			return false;
		}

	}
  public static int isGCD(int a , int b){  // brute force 
    int gcd = 1;
    for(int i = Math.min(a, b);i>=1;i--){
      if(a%i==0 && b%i==0){
        gcd = i;
        break;
      }
    }
    return gcd;
  }
   static void divisor(int n){
     Vector <Integer> ls = new Vector<>();
    //  for(int i =1;i<=Math.sqrt(n);i++){ 
      for(int i =1;i*i<=n;i++){ 
       if(n%i == 0){
        ls.add(i);
        if((n/i) != i){
          ls.add(n/i); 
        }
       }
     }
     Collections.sort(ls);
     for (int e : ls ){
      System.out.println(e);
     }
     
   }
   public static void main(String[] args) {

    basicmathp2 obj = new basicmathp2();
    int []array = {1,2,3,4,5};
    // System.out.println(isPrime(36));
    // System.out.println(isGCD(52, 10));
    // printNtimes(1, 4);
    // System.out.println(sum(3));
    // System.out.println(fact(5));
    // obj.swapelements(0, array , 4);
    // swapElements1(array, 0, 4);
    // System.out.println(Arrays.toString(array));
      // String name = "MADSM";
      // System.out.println(pali(0, name));
         System.out.println(fibo(4));
    }
  
}
