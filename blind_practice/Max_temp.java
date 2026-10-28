package blind_practice;
import java.util.Scanner;
public class Max_temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] temps = new int[n];
        for(int i=0;i<n;i++){
            temps[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int result = maxTemperatureSum(temps,k);
        System.out.println(result);
    }
    public static int maxTemperatureSum(int[] temperatures, int k){
        int max_sum=Integer.MIN_VALUE;
        int current_sum=0;
        int l=0;
        for(int r=0;r<k;r++){
            current_sum+=temperatures[r];
        }
        max_sum=current_sum;
        for(int r=k;r<temperatures.length;r++){
            current_sum=current_sum-temperatures[l];
            l++;
            current_sum=current_sum+temperatures[r];
            max_sum=Math.max(max_sum,current_sum);
        }
        return max_sum;
    }
}
