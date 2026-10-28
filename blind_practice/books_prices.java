package blind_practice;
import java.util.Scanner;
public class books_prices {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i=0;i<n;i++){
            prices[i] = sc.nextInt();
        }
        int budget = sc.nextInt();
        int longest = longest_subarray(prices,budget);
        System.out.println(longest);
    }
    public static int longest_subarray(int[]prices,int budget){
        int l=0;
        int max_length=0;
        int sum=0;
        for(int r=0;r<prices.length;r++){
            sum+=prices[r];
            while(sum>budget){
                sum-=prices[l];
                l++;
            }
            max_length=Math.max(r-l+1,max_length);
        }
        return max_length;
    }

}
