package blind_practice;
import java.util.Scanner;
public class D1Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       int res=maxSum(arr);
        System.out.println(res);
    }
    public static int maxSum(int arr[]){
        int sum=0;
        int max_sum=arr[0];
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max_sum=Math.max(max_sum,sum);
            if(sum<0){
                sum=0;
            }
        }
        return max_sum;
    }
}

