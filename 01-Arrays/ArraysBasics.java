#Reverse an array 
import java.util.*;

public class main{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size of Array");
                int n = sc.nextInt();
                int arr[]=new int[n];
                for(int i=0;i<n;i++){
                        arr[i]=sc.nextInt();
                }
                System.out.println("Reverse of array:");
                for(int i=n-1;i>=0;i--){
                        System.out.println(arr[i]);
                }
                
                
        }
}
# search an element
import java.util.*;

public class main{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size of Array");
                int n = sc.nextInt();
                int arr[]=new int[n];
                for(int i=0;i<n;i++){
                        arr[i]=sc.nextInt();
                }
                System.out.println("Enter the number you want to search");
                int number = sc.nextInt();
                for(int i =0;i<n;i++){
                        if(arr[i]==number){
                           System.out.println("the number is present at:"+i);                     
                        }
                        
                }
                
                
        }
}
# find min and max value
import java.util.*;

public class main{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size of Array");
                int n = sc.nextInt();
                int arr[]=new int[n];
                for(int i=0;i<n;i++){
                                arr[i]=sc.nextInt();
                }
                int max = arr[0];
                int min = arr[0];
                for(int i=1;i<n;i++){
                           if(arr[i]>max){
                                           max = arr[i];
                                           
                           } 
                           if(arr[i]<min){
                                           min=arr[i];
                          }
                }
                System.out.println("The maximum value is:"+max);
                System.out.println("The minimum value is:"+min);         
                
        }
}
# count of occurences
import java.util.*;
 public class Main{
     public static void  main(String[]args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt(); 
         int arr[] = new int[n];
         
         for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
         }
         System.out.println("enter the number to count : ");
         int number=sc.nextInt();
         int count=0;
         for(int i =0;i<n;i++){
             if(arr[i]==number){
                 count ++;
             }
         }
         System.out.println("the count is :" + count);
     }
 }
# sum of elements in array
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
         int sum=0;
         for(int i =0;i<n;i++){
             sum += arr[i];
         }
         System.out.println("the sum of array elements is:" + sum);
     }
 }
# Print alternate elements

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
         System.out.println("the alternative elements are :");
         for(int i =0;i<n;i+=2){
             System.out.println(arr[i]);
         }
     }
 }

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
 

