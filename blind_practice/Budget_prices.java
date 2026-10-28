package blind_practice;
import java.util.Scanner;
public class Budget_prices{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prices[] = new int[n];
        for(int i=0;i<n;i++){
            prices[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    int[] result = twoSum(prices,target);
    if (result[0] == -1) {
    System.out.println("No valid pair found");
} else {
    System.out.println(result[0] + " " + result[1]);
}
    }

public static int[] twoSum(int[] prices, int target){
    int[]ans = new int[2];
    int l=0;
    int r=prices.length-1;
    while(l<r){
        int sum=prices[l]+prices[r];
        if(sum==target){
            ans[0]=l;
            ans[1]=r;
            return ans;
        }
        else if(sum<target){
            l++;
        }
        else{
            r--;
        }
        
    }
    return new int[]{-1, -1};
}
}
