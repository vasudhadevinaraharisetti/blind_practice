package blind_practice;
import java.util.*;
public class D3Q12 {
    public static void main(String[] args) {
        int[] arr= {8,2,4,7};
        int limit=4;
        int res=max_min_window(arr,limit);
        System.out.println(res);
    }
    public static int max_min_window(int arr[],int limit){
        int l=0;
        int max_len=0;
        for(int r=0;r<arr.length;r++){
            //confusion on first min max calc
            int max = arr[l];
            int min = arr[l];
            for (int i = l; i <= r; i++) {
                if (arr[i] > max) max = arr[i];
                if (arr[i] < min) min = arr[i];
            }
            int diff=max-min;
            while(diff>limit){
               l++;
                max=arr[l];
                min=arr[l];
               if(arr[r]>max){
                max=arr[r];
            }
            if(arr[r]<min){
                min=arr[r];
            }
            diff=max-min;
            }
            max_len=Math.max(max_len,r-l+1);
        }
        return max_len;
    }
}
