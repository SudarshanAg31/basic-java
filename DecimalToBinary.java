import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        double sum=0;
        int z=0;
        while(x!=0){
            int y=x%2;
            sum=sum+y*Math.pow(10,z);
            x=x/2;
            z++;
        }

        System.out.println((int)(sum));
    }
}

