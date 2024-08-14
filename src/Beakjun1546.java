import java.util.Scanner;

public class Beakjun1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] arr=new double[n];
        double avg, max = 0,sum = 0;

        for(int i =0; i <n; i++) {
            arr[i]=sc.nextInt();

            if(arr[i]>max) {
                max=arr[i];
            }
        }

        for(int i = 0; i < n; i++) {
            arr[i]=(arr[i]/max)*100;
            sum+=arr[i];
        }
        sc.close();
        avg=sum/n;
        System.out.println(avg);


    }
}
