package blind_practice;
import java.util.Scanner;
import java.util.HashMap;
public class D2Q9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
       int res=count_div(arr,k);
        System.out.println(res);
    }
    public static int count_div(int arr[], int k){
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        int count=0;
        hm.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int rem=sum%k;
            if(hm.containsKey(rem)){
                count+=hm.get(rem);
            }
            hm.put(rem,hm.getOrDefault(rem,0)+1);
        }
        return count;
    }   
}
