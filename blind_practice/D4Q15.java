package blind_practice;
import java.util.*;
public class D4Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
       int res=search_target(arr,target);
        System.out.println(res);
    }
    public static int search_target(int arr[],int target){
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>=arr[l]){
                if(arr[l]<=target && arr[mid]>=target){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else
            {
                if(arr[mid]<=target && arr[h]>=target){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
        }
        return -1;
    }
}
