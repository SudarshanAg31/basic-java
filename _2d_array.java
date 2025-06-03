import java.util.Scanner;
public class _2d_array {
    public static void printarr(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }   
    }
    public static int[][] inputarr(int[][] arr,int x,int y) {
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //first way without input
        int[][] arr={{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
        printarr(arr);        
        //second input array 
        int x=sc.nextInt();
        int y=sc.nextInt();
        int[][] arr1=new int[x][y];
        int[][] arr2=inputarr(arr1, x, y);
        printarr(arr2);
    }
}
