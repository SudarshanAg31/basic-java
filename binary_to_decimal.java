
import java.util.Scanner;

public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        double sum=0;
        int z=0;
        while(x!=0){
            int y=x%10;
            sum=sum+y*Math.pow(2,z);
            x=x/10;
            z++;
        }
        System.out.println(sum);
    }
}
