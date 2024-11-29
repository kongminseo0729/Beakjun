import java.util.Scanner;
public class Beakjun10988 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        String s=sc.next();
        sc.close();
        int sL = s.length();
        int res = 1;

        for(int i=0; i<sL; i++){
            if(s.charAt(i)!= s.charAt(sL -1 - i)){
                res=0;
            }
        }
        System.out.println(res);
    }
}
