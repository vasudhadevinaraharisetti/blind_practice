package blind_practice;
import java.util.Scanner;
public class Delivery_profit {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int revenue[]=new int[n];
        for(int i=0;i<revenue.length;i++){
            revenue[i]=sc.nextInt(); 
        }
        int res=maxProfit(revenue);
        System.out.println(res);
    }
    public static int maxProfit(int revenue[]){
        int sum=0;
        int max_profit=revenue[0];
        for(int i=0;i<revenue.length;i++){
            sum+=revenue[i];
            max_profit=Math.max(max_profit,sum);
            if(sum<0){
                sum=0;
            }
        }
        return max_profit;
    }

}