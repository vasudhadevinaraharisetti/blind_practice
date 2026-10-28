package blind_practice;
import java.util.Scanner;
import java.util.HashMap;
public class Transactions {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
    }
    int k= sc.nextInt();
    boolean ans=transactions_method(a,k);
    System.out.println(ans);
    }
    public static boolean transactions_method(int[] a,int k){
        int sum=0;
        int diff=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        for(int x:a){
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