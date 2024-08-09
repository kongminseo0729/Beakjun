import java.util.Scanner;

public class Beakjun3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] arr=new int[10];
        boolean bl;
        int cnt=0;

        for(int i=0; i<10; i++){
            arr[i]=sc.nextInt() %42;

        }
        for(int i=0; i< arr.length; i++){
            bl=false;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    bl=true;
                    break;
                }
            }
            if(!bl){
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
