package blind_practice;
import java.util.Scanner;
public class Maxsum_subarray {
    Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int res=maxSubarraySum(arr);
        System.out.println(res);
    }
    public static int maxSubarraySum(int[] arr){
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
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
