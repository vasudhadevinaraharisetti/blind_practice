package blind_practice;
import java.util.Scanner;
public class Online_shopping_discounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i=0;i<n;i++){
            prices[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int result = minSubArrayLen(target, prices);
        System.out.println(result);
    }
    public static int minSubArrayLen(int target, int[] prices){
        int min_length=Integer.MAX_VALUE;
        int sum=0;
        int l=0;
        for(int r=0;r<prices.length;r++){
            sum+=prices[r];
            while(sum>=target){
                min_length=Math.min(min_length,r-l+1);
                sum-=prices[l];
                l++;
            }
        }
        if(min_length==Integer.MAX_VALUE){
            return 0;
        }
        return min_length;
    }
}
