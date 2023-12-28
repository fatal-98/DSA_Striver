import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class sorting_part1 {
    
    static void selection_sort(int []arr){
        ArrayList <Integer> temp1 = new ArrayList<>();
        int n = arr.length;
        
        for(int i=0;i<=n-2;i++){
            int mini = i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[mini]){
                    mini = j;
                }
            }
           int temp = arr[i];
            arr[i] = arr [mini];
            arr[mini] = temp;
        }
    }
     static void bubble_sort(int []arr){
        int n=arr.length;
        int temp;
        for(int i=n-1;i>=1;i--){
            int didswap = 0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didswap = 1;
                }
            }
            if(didswap ==0) break;
            System.out.println("run");
        }
     }
     static void insertion_sort(int[]arr){
        int n = arr.length;
        int temp;
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
               temp = arr[j];
               arr[j]=arr[j-1];
               arr[j-1]=temp;

               j--;
            }
            
        }
     }
     public static ArrayList<Integer> inter(int []a,int []b,int m ,int n){
        ArrayList<Integer> ans = new ArrayList<>();
        int i =0;
        int j=0;
        while(i<m && i<n){
            if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }
            else if(a[i]==a[j]){
                ans.add(a[i]);
                i++;
                j++;
            }
        }
        while(i<m){
            ans.add(a[i]);
            i++;
        }
        while(j<n){
            ans.add(b[j]);
            j++;
        }
        return ans;
     }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // // int n = sc.nextInt();
        // // int []arr1=new int[n];
        // // for(int i=0;i<n;i++){
        // //     arr1[i] = sc.nextInt();
        // // } 
        // // insertion_sort(arr1); 
        // // for(int i=0;i<n;i++){
        // //     System.out.print(arr1[i] + " ");
        // // } 
           int [] arr1 = {1,2,3,4,5};
           int [] arr2 ={2,4,5,6,7};
           int a =5;
           int b=5;
           List <Integer> ans = inter(arr1, arr2, a, b);           
           for(int e : ans){
            System.out.print(e + " ");
           }
        System.out.println("hello world !");
    }    
}
