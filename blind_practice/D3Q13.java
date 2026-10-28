package blind_practice;
import java.util.*;
public class D3Q13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
        int k=sc.nextInt();
        int res=longest_distint_two(arr,k);
        System.out.println(res);
    }
public static int longest_distint_two(int []arr,int k){
    int distinct=0;
    int l=0;
    int count=0;
    HashMap<Integer,Integer>hm=new HashMap<>();
    for(int r=0;r<arr.length;r++){
        int ch_r= arr[r];
        if(!hm.containsKey(ch_r)){
            distinct++;
        }
        hm.put(ch_r,hm.getOrDefault(ch_r,0)+1);
        while(distinct>k){
           int ch_l= arr[l];
            hm.put(ch_l,hm.get(ch_l)-1);
            if(hm.get(ch_l)==0){
                hm.remove(ch_l);
                distinct--;
            } 
            l++;
        }
        count+=(r-l+1);
    }
    return count;
}
}
