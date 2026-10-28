package blind_practice;
import java.util.Scanner;
import java.util.HashMap;
public class D2Q6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
       int[] res=target_indices(arr,target);
        System.out.println(res[0] + " " + res[1]);
    }
    public static int[] target_indices(int arr[], int target){
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],i);
        }
        for(int i=0;i<arr.length;i++){
            int diff=target-arr[i];
            if(hm.containsKey(diff)){
                return new int[]{i,hm.get(diff)};
            }
            
        }
        return new int[]{-1,-1};
    }
}