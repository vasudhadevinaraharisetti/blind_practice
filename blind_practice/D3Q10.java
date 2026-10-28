package blind_practice;
import java.util.Scanner;
import java.util.HashSet;
public class D3Q10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        int res=longest_substring(str);
        System.out.println(res);
    }
    public static int longest_substring(String str){
        HashSet<Character> hs=new HashSet<>();
        int max_length=0;
        int l=0;
        for(int r=0;r<str.length();r++){
            char ch=str.charAt(r);
            while(hs.contains(ch)){
                hs.remove(str.charAt(l));
                l++;
            }
            hs.add(str.charAt(r));
            max_length=Math.max(max_length,r-l+1);
        }
        
        return max_length;
    }
}
