import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class hashing_p1{

    public static void main(String[] args) {

           // number hashing 

         Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();  // important
        // int []arr = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        
        // // precompute
        // int [] hash = new int[13]; // int [] hash = {0,0,0,0,0,0,0,0,0,0,0,0,0}
        // for(int i=0;i<n;i++){
        //     hash[arr[i]] = hash[arr[i]] + 1;
        // }

        // int q = sc.nextInt();
        // while(q-- != 0){
        //     int number = sc.nextInt();
        //     System.out.println(hash[number]);
        // }
        
            // String hashing

        // String S = sc.next();
        //     // pre compute  
        // int []hash = new int[256];  // new int[256]
        // for(int i =0;i<S.length();i++){
        //     hash[S.charAt(i)]++;
        // }
        // int q = sc.nextInt();
        // while(q-- != 0){
        //     char ch = sc.next().charAt(0);
        //     // fetch
        //     System.out.println(hash[ch]);  // hash[ch]
        // }

        // int n = sc.nextInt();
        // int []arr = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // } 
        // // pre computation
        // Map<Integer , Integer>mpp = new HashMap<>();
        // for(int i=0;i<arr.length;i++){
        //      int key = arr[i];
        //      int freq =0;
        //      if(mpp.containsKey(key)) freq = mpp.get(key);
        //       freq++;
        //      mpp.put(key, freq);
        // }

        // int q = sc.nextInt();
        // while(q-- !=0){
        //     int number = sc.nextInt();
        //     // fetch
        //    if(mpp.containsKey(number)) System.out.println(mpp.get(number));
        //    else System.out.println(0);
        // }

       // find maximum/minimum frequency
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // pre computation
        Map<Integer,Integer>mpp = new HashMap<>();

        // count the frequency of each element
        for(int e : arr){
            mpp.put(e, mpp.getOrDefault( e, 0)+1);
        }

        int Max_fre = Integer.MIN_VALUE;
        int Min_fre = Integer.MAX_VALUE;
        int max_ele =0;
        int min_ele =0;

        // find max/min value
        for(Map.Entry<Integer,Integer>entry : mpp.entrySet()){
            int fre = entry.getValue();
            int ele = entry.getKey();

        if(fre>Max_fre){
            Max_fre = fre;
            max_ele = ele;
        }
        else if(fre<Min_fre){
            Min_fre = fre;
            min_ele = ele;
        }
        }
        
        // fetch

        System.out.println("the max frequency" + Max_fre);
        System.out.println("thee max element " + max_ele);
        System.out.println("the min frequency" + Min_fre);
        System.out.println("thee min element " + min_ele);

       
        }
        
    }

