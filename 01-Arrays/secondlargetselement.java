#second largest elements
import java.util.*;
 public class Main{
     public static void  main(String[]args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of array :");
         int n = sc.nextInt(); 
         int arr[] = new int[n];
         
         for(int i=0;i<n;i++){
             System.out.println("Enter the element in array : ");
             arr[i] = sc.nextInt();
         }
         int largest = arr[0];
         int secondlargest = arr[0];
         for(int i =0;i<n;i++){
             if(arr[i]>largest){
                 secondlargest = largest;
                 largest = arr[i];
             }else if(arr[i] > secondlargest && arr[i] != largest){
                 secondlargest =arr[i];
             }
         }
         System.out.println("the secondlargest element is "+ secondlargest);
     }
 }
