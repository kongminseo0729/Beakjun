import java.util.Scanner;

public class Beakjun10807 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int[] array=new int[n];

        for(int i=0; i<n; i++){
           array[i]=sc.nextInt();
        }
        int c=sc.nextInt();
        int count=0;
        for(int i=0; i< array.length; i++){
            if(array[i]==c){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
