
import java.util.Scanner;

public class for_loops {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
    //for positive loop
        for(int i=0;i<=x;i++){
            System.out.println("sudarshan");
        }
    // -ne loop
        for(int i=10;i>=0;i--){
            System.out.println(i);
        }
        // for loop can be as while loop
        int j=1;
        for(;j<=10;){
            System.out.println(j);
            j++;
        }
        sc.close();
    }
}
