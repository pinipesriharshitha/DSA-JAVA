import java.util.*;
public class main{
    public static void Average(int []arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int avg = sum/arr.length;
        System.out.println("the average student marks are :" + avg );
    }
    public static void Minmax(int []arr){
         int highest=arr[0];
         int lowest=arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>highest){
                highest=arr[i];
            }
            if(arr[i]<lowest){
                lowest=arr[i];
            }
        }
        System.out.println("The maximum mark is : " + highest );
        System.out.println("The minimum mark is : " + lowest );
        
    }
    public static void Sorting(int []arr){
        for(int i= 0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }  
            }
        }
            System.out.println("The sorted array is : " );
            for(int i = 0 ;i< arr.length;i++){
                System.out.print(arr[i]+ " ");
            }
        System.out.println();    
    }
    public static void Passed(int []arr){
        int count = 0;
        for(int i= 0;i<arr.length;i++){
            if(arr[i]>=35){
                count ++;
            }
        }
        System.out.println("The no of students passed : " + count );
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int n = sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the marks of the students : ");
        for(int i = 0;i<n;i++){
             arr[i]=sc.nextInt();
        }
        Average(arr);
        Minmax(arr);
        Sorting(arr);
        Passed(arr);
        
    }
}
