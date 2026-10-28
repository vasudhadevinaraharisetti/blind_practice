package blind_practice;
import java.util.Scanner;
public class D1Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int res[] = {-1, -1};
        res[0] = first(arr, target);
        res[1] = last(arr, target);
        System.out.println(res[0] + " " + res[1]);
    }
    public static int  first(int arr[],int target){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                if(arr[mid-1]==target){
                    r=mid-1;
                }
                else{
                    return mid;
                }
            }
            else if(arr[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }
    public static int last(int arr[],int target){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                if(arr[mid+1]==target){
                    l=mid+1;
                }
                else{
                    return mid;
                }
            }
            else if(arr[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }

}
