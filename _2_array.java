//take input/output of array with loops
import java.util.Scanner;

public class _2_array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    
        System.out.println("size of array");
        int y=sc.nextInt();
        //allocate memory of array
        int[] x=new int[y];
        //input of array
        for(int i=0;i<x.length;i++){
        System.out.print(i+" size of array :");
            x[i]=sc.nextInt();
        }
        //output of array
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
        //x.length:- it finds the length of array
    }
}
