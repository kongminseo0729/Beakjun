import java.util.Scanner;

public class Beakjun10813 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        int[] arr=new int[N];
        int M=sc.nextInt();

        for(int i=0;i<N;i++){
            arr[i]=i+1;
        }

        for(int i =0;i<M;i++)
        {
            int temp=0;
            int I=sc.nextInt();
            int J=sc.nextInt();

            temp=arr[I-1];
            arr[I-1]=arr[J-1];
            arr[J-1]=temp;


        }

        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
