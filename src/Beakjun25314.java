import java.util.Scanner;

public class Beakjun25314 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();


        for(int i=1;i<=n;i++)
        {
            if(i%4==0)
        {
            System.out.print("long ");
        }
        }
        System.out.print("int");
        sc.close();
    }
}
