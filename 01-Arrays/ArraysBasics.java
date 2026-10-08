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
