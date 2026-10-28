package blind_practice;
import java.util.Scanner;
public class Max_gain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int res=maxGain(arr);
        System.out.println(res);
    }
    public static int maxGain(int arr[]){
        int sum=0;
        int max_sum=0;
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
