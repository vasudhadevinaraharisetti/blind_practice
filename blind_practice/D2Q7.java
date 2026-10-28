package blind_practice;
import java.util.Scanner;
import java.util.HashMap;
public class D2Q7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
       int res=sum_equal_k(arr,k);
        System.out.println(res);
    }
    public static int sum_equal_k(int arr[], int k){
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int diff=sum-k;
            hm.put(0,1);
            if(hm.containsKey(diff)){
                count+=hm.get(diff);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
