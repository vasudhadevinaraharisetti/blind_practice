package blind_practice;
import java.util.Scanner;
import java.util.HashMap;
public class D4Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
       int res=longest_subarray(arr,k);
        System.out.println(res);
    }
    public static int longest_subarray(int arr[], int k){
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        int max_length=0;
        hm.put(0,-1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int diff=sum-k;
            if(hm.containsKey(diff)){
                max_length=Math.max(max_length,i-hm.get(diff));
            }
            if(!hm.containsKey(sum)){
                hm.put(sum,i);
            }
        }
        return max_length;
    }
}
