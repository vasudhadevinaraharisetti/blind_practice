package blind_practice;
import java.util.HashMap;
import java.util.Scanner;
public class Shopping_target {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<prices.length;i++){
            prices[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        boolean res=hasTargetGroup(prices,k);
        System.out.println(res);
    }
    public static boolean hasTargetGroup(int[] prices, int k){
        int sum=0;
        int diff=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        for(int x:prices){
            sum+=x;
            diff=sum-k;
            if(hm.containsKey(diff)){
                return true;
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return false;
    }
}
