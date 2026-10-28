package blind_practice;
import java.util.Scanner;
public class Position_target {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int res=positionTarget(arr,target);
        System.out.println(res);
    }
    public static int positionTarget(int[] arr,int target){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return l;
    }
}
