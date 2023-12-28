import java.util.Scanner;
public class pattern { 
    static void pattern1(int n){
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    static void pattern2(int n){
         for(int i=0;i<n;i++){
            for(int j =0 ;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
         }
    }
    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }
    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println("\n");
        }
    }
    static void pattern5(int n){
        for(int i=1;i<=n;i++){
            for(int j =1; j<=(n-i+1);j++){
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
     static void pattern6(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<= (n-i+1); j++){
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
     }
     static void pattern7(int n){
        for (int i=0;i<n;i++){
            for(int j =0 ; j<(n-i-1); j++){
                System.out.print(" ");
            }
                for(int k =0 ; k<((2*i)+1);k++){
                    System.out.print("*");
                }
                    for(int l =0 ; l<(n-i-1); l++){
                        System.out.print(" ");
                    }
                    System.out.print("\n");
        }
     }
     static void pattern8(int n){    // see again 
       for (int i=0;i<n;i++){
            for(int j =0 ; j<i; j++){
                System.out.print(" ");
            }
                for(int k =0 ; k<2*n-(2*i+1);k++){
                    System.out.print("*");
                }
                    for(int l =0 ; l<i; l++){
                        System.out.print(" ");
                    }
                    System.out.print("\n");
                    
        }
     }
     static void pattern9(int n){ 
          for (int i=0;i<n;i++){
            for(int j =0 ; j<(n-i-1); j++){
                System.out.print(" ");
            }
                for(int k =0 ; k<((2*i)+1);k++){
                    System.out.print("*");
                }
                    for(int l =0 ; l<(n-i-1); l++){
                        System.out.print(" ");
                    }
                    System.out.print("\n");
                    
        }
          for (int i=0;i<n;i++){
            for(int j =0 ; j<i; j++){
                System.out.print(" ");
            }
                for(int k =0 ; k<2*n-(2*i+1);k++){
                    System.out.print("*");
                }
                    for(int l =0 ; l<i; l++){
                        System.out.print(" ");
                    }
                    System.out.print("\n");
        }
     }
     static void pattern10(int n){
        for(int i=1;i<=2*n-1;i++){
            int stars = i;
            if(i>n) stars = 2*n-i;
            for(int j=1;j<=stars;j++){                
              System.out.print("*");
            }
            System.out.print("\n");
        }
     }
     static void pattern11(int n){    // important 
        int start;
        for(int i =0;i<n;i++){
            if(i%2==0) start = 1;
            else start =0;
            for(int j =0;j<=i;j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.print("\n");
        }
     }
     static void pattern12(int n){
        int space = 2*(n-1);
        for(int i =1;i<=n;i++){ 
            // numbers 
          for(int j=1;j<=i;j++){
            System.out.print(j);
          }
            // spaces 
          for(int k =1;k<=space;k++){
            System.out.print(" ");
          }
            // numbers
           for(int l =i;l>=1;l--){
            System.out.print(l);
           } 
           System.out.print("\n");
           space -= 2;
        }
     }
     static void pattern13(int n){
        int num =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num + " ");
                num += 1;
            }
            System.out.print("\n");
        }
     }
     static void pattern14(int n){
        for(int i =0;i<n;i++){
            for(char j = 'A';j<='A'+i;j++){
                System.out.print(j+ " ");
            }
            System.out.print("\n");
        }
     }
     static void pattern15(int n){
        for(int i =n;i>0;i--){
            for(char j = 'A';j<='A'+(i-1);j++){
                System.out.print(j+ " ");
            }
            System.out.print("\n");
        }
     }
     static void pattern16(int n){
        
        for(int i =0;i<n;i++){
            char c =(char)('A'+ i);
            for(int j=0;j<=i;j++){
                System.out.print(c);
            }
            System.out.print("\n");   
        }
        
        // for(int i =0;i<n;i++){
        //     char c =(char) ('A'+ i);
        //     for(int j=0;j<=i;j++){
        //         System.out.print(c);
        //     }
        //     System.out.print("\n");   
        // }

}
    static void pattern17(int n){   // important
    for(int i=0;i<n;i++){
        // spaces
       for(int j =0 ; j<(n-i-1); j++){
                System.out.print(" ");
            }
        // alphabets 
        char c ='A';
        int breakpoint =  (2*i+1)/2;
        for(int j =1;j<=2*i+1;j++){
            System.out.print(c);
            if(j<=breakpoint) c++;
            else c--;
        }
        // spaces
       for(int j =0 ; j<(n-i-1); j++){
                System.out.print(" ");
            }

        System.out.print("\n");
        
    }
}
     static void pattern18(int n){  // important

    for(int i=0;i<n;i++){
        for(char j = (char)('E'-i);j <='E';j++){
            System.out.print(j);
        }
        System.out.println("\n");
}
     }
     static void pattern19(int n){
        int inS = 0;
        for(int i =0;i<n;i++){
            // stars 
            for(int j =0;j<n-i;j++){
               System.out.print("*");
            }
            // spaces
            for(int j =0;j<inS;j++){
                System.out.print(" ");
            }
            // stars 
            for(int j =0;j<n-i;j++){
               System.out.print("*");
            }
            inS+=2;
            System.out.print("\n");
        }
           int ins = 2*n-2;
        for(int i =0;i<n;i++){
             // stars 
            for(int j =0;j<=i;j++){
               System.out.print("*");
            }
            // spaces
            for(int j =0;j<ins;j++){
                System.out.print(" ");
            }
            // stars 
            for(int j =0;j<=i;j++){
               System.out.print("*");
            }
            ins-=2;
            System.out.print("\n");
        }
     }
    static void pattern20(int n){
        //  int ins = 8;
        //  for(int i =0;i<n;i++){
        //      // stars 
        //     for(int j =0;j<=i;j++){
        //        System.out.print("*");
        //     }
        //     // spaces
        //     for(int j =0;j<ins;j++){
        //         System.out.print(" ");
        //     }
        //     // stars 
        //     for(int j =0;j<=i;j++){
        //        System.out.print("*");
        //     }
        //     ins-=2;
        //     System.out.print("\n");
        // }
        //   int inS = 2;
        // for(int i =0;i<n-1;i++){
        //     // stars 
        //     for(int j =0;j<n-i-1;j++){
        //        System.out.print("*");
        //     }
        //     // spaces
        //     for(int j =0;j<inS;j++){
        //         System.out.print(" ");
        //     }
        //     // stars 
        //      for(int j =0;j<n-i-1;j++){
        //        System.out.print("*");
        //     }
        //     inS+=2;
        //     System.out.print("\n");
        // }
        int ins = 2*n-2;
        for(int i = 1;i<=2*n-1;i++){
            int stars = i;
            if(i>n) stars = 2*n -i;
            // stars
            for(int j = 1 ; j<=stars ;j++){
                System.out.print("*");
            }
            // spaces 
            for (int j =1; j<=ins ;j++){
                System.out.print(" ");
            }
            // stars
             for(int j = 1 ; j<=stars ;j++){
                System.out.print("*");
            }
            if(i>=n) ins += 2;
            else ins -=2;
            System.out.print("\n");
        }
        
    }
    static void pattern21(int n){     // important 
        for(int i =0;i<n;i++){
          for(int j=0;j<n;j++){
            if(i==0||i==n-1||j==0||j==n-1){
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");    
        }
    }
    static void pattern22(int n){     // little bit complicated
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top =i;
                int left = j;
                int bottom = (2*n-2)-i;
                int right = (2*n-2)-j;
                System.out.print(n-Math.min(Math.min(left,right),Math.min(top, bottom)));
            }
            System.out.print("\n");
        }
    }
   
    static void pattern23(int n){
        for(int i=-0;i<n;i++){
            // space
            for(int j =0;j<n-i-1;j++){
                System.out.print(" ");
            }
            // star
            for(int j=0;j<=i;j++){
                System.out.print("*"+ " "); 
            }
            // space
            for(int j =0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    static void array(int []arr , int d){
        int n=arr.length;
        int[]temp = new int[d];
        int j=0;
        // add
        for(int i=n-d;i<n;i++){
            temp[j]=arr[i];
            j++;
        }
        // shift to right
        for(int i=d;i<n;i++){
            arr[i]=arr[i-d];
        }
        // push back
        for(int i=0;i<d;i++){
            arr[i]=temp[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]); 
            System.out.print(" ");
        }

    }
    public static void firstarray(int[]arr,int d){
        int n = arr.length;
        reverse( arr , 0 , d);
        reverse(arr , d+1 , n-1);
        reverse(arr , 0 , n-1);
        for(int i=0;i<n;i++){
            System.out.print (arr + "  ");
        }

    }
    public static void reverse(int []arr , int low , int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }         
     public static void main(String[] args) {
        pattern obj = new pattern();
        Scanner sc =new Scanner(System.in);
        // int t = sc.nextInt();
        // for (int i=0;i<t;i++){
        //     int n = sc.nextInt();
        //     pattern20(n);
        // }
        int [] arr1 = {1,2,3,4,5,6,7};
        // obj.array(arr1, 3);
        //  int [] arr1 = new int[t];
        //  for(int i=0;i<t;i++){
        //     arr1[i] = sc.nextInt(); 
        //  }
          obj.firstarray( arr1, 3);
      
        
    }
}


