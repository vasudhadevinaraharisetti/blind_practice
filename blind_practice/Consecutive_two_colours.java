package blind_practice;
import java.util.HashMap;
import java.util.Scanner;
public class Consecutive_two_colours {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        String colours[]=new String[n];
        for(int i=0;i<colours.length;i++){
            colours[i]=sc.next();
        }
        int res=longestTwoColors(colours);
        System.out.println(res);
    }
    public static int longestTwoColors(String[] colors){
        int distinct=0;
        HashMap<String,Integer>hm=new HashMap<>();
        int l=0;
        int max_length=0;
        for(int r=0;r<colors.length;r++){
            
            if(!hm.containsKey(colors[r])){
                distinct++;
            }
            hm.put(colors[r],hm.getOrDefault(colors[r],0)+1);
            while(distinct>2){
                if(hm.get(colors[l])==1){
                    hm.remove(colors[l]);
                    distinct--;
                }
                else{
                    hm.put(colors[l],hm.get(colors[l])-1);
                }
                l++;
            }
            max_length=Math.max(max_length,r-l+1);
        }
        return max_length;
    }
}
