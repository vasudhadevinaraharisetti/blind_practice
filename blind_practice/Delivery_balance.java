package blind_practice;
import java.util.HashMap;
import java.util.Scanner;
public class Delivery_balance {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int changes[]=new int[n];
        for(int i=0;i<changes.length;i++){
            changes[i]=sc.nextInt();
        }
        int res=longestZeroChangePeriod(changes);
        System.out.println(res);
    }
    public static int longestZeroChangePeriod(int[] changes){
        int sum=0;
        int diff=0;
        int k=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,-1);
        int max_length=0;
        int current_length=0;
        for(int i=0;i<changes.length;i++){
            sum+=changes[i];
            diff=sum-k;
            if(hm.containsKey(diff)){
                current_length=i-hm.get(diff);
                max_length=Math.max(max_length,current_length);
            }
            else{
                hm.put(sum,i);
            }
        }
        return max_length;
    }
}
