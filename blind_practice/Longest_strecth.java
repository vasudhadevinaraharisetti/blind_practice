package blind_practice;
import java.util.Scanner;
import java.util.HashSet;
public class Longest_strecth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int res=longest_Strecth_unique(arr);
        System.out.println(res);
    }
    public static int longest_Strecth_unique(int arr[]){
        HashSet<Integer> hs=new HashSet<>();
        int l=0;
        int max_length=0;
        for(int r=0;r<arr.length;r++){
            while(hs.contains(arr[r])){
                hs.remove(arr[l]);
                l++; 
            }
            hs.add(arr[r]);
            max_length=Math.max(max_length,r-l+1);
        }
        return max_length;
    }
}
