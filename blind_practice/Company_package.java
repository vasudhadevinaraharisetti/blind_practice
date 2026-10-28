package blind_practice;
import java.util.Scanner;
import java.util.HashMap;
public class Company_package {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int deliveries[] = new int[n];
        for(int i=0;i<n;i++){
            deliveries[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int longest = longest_subarray(deliveries,target);
        System.out.println(longest);
    }
    public static int longest_subarray(int[] deliveries,int target){
        int sum=0;
        int diff=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        int max_length=0;
        int current_length=0;
        for(int i=0;i<deliveries.length;i++){
            int x = deliveries[i];
            sum+=x;
            diff=sum-target;
            if(hm.containsKey(diff)){
                current_length=i - hm.get(diff);
                max_length=Math.max(max_length,current_length);
            }
           if(!hm.containsKey(sum)){
                hm.put(sum,i);
            }
        }
        return max_length;
    }
    
}
