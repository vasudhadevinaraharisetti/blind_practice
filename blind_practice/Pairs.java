package blind_practice;
import java.util.Scanner;
import java.util.HashSet;
public class Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        boolean res=countPairs(arr,target);
        System.out.println(res);
    }
    public static boolean countPairs(int arr[],int target){
        HashSet<Integer> set=new HashSet<>();
        for(int x: arr){
            int complement=target-x;
            if(set.contains(complement)){
                return true;
            }
            set.add(x);
        }
        return false;
    }
}
