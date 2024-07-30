import java.util.Scanner;

public class Beakjun10871 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] array1=new int[n];

        for(int i=0; i<n; i++){
            array1[i]=sc.nextInt();
        }
        sc.close();

        for(int i=0; i< n; i++){
            if (array1[i]<m){
                System.out.print(array1[i]+" ");
            }
        }


    }
}
