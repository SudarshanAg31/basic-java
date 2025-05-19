//program for abs
//if > else if > else
import java.util.Scanner;
public class conditionals{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x<0){
            System.out.println(-x);
        }
        else if(x==0){
            System.out.println(0);
        }
         else{
            System.out.println(x);
        }
    }
}
