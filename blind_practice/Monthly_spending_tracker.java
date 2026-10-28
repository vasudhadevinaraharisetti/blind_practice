package blind_practice;
import java.util.Scanner;
import java.util.HashMap;
public class Monthly_spending_tracker{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] expenses = new int[n];
    for(int i=0;i<n;i++){
        expenses[i] = sc.nextInt(); 
    }
    int target = sc.nextInt();
    int result = countSubarrays(expenses,target);
    System.out.println(result);
    }
    public static int countSubarrays(int[] spending, int target){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum=0;
        int diff=0;
        int count=0;
        hm.put(0,1);
        for(int i=0;i<spending.length;i++){
            sum+=spending[i];
            diff=sum-target;
            if(hm.containsKey(diff)){
                count+=hm.get(diff);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }

}