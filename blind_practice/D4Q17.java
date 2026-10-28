package blind_practice;
import java.util.*;
public class D4Q17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        int k=sc.nextInt();
        int res=longest_distint_two_length(s,k);
        System.out.println(res);
    }
public static int longest_distint_two_length(String s,int k){
    int distinct=0;
    int l=0;
    int max_len=0;
    HashMap<Character,Integer>hm=new HashMap<>();
     for(int r=0;r<s.length();r++){
        char ch_r=s.charAt(r);
        if(!hm.containsKey(ch_r)){
            distinct++;
        }
        hm.put(ch_r,hm.getOrDefault(ch_r,0)+1);
        while(distinct>2){
            char ch_l=s.charAt(l);
            hm.put(ch_l,hm.get(ch_l)-1);
            if(hm.get(ch_l)==0){
                hm.remove(ch_l);
                distinct--;
            } 
            l++;
        }
        max_len=Math.max(max_len,r-l+1);
    }   
    return max_len;
}
}