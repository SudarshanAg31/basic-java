
import java.util.Arrays;
public class array_function {
    public static void y(int[] x) {
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }        
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        y(arr);
        int [] arr1=Arrays.copyOf(arr,arr.length);//arr1 is created same as array x with same length
        // if we change the value of arr1 so the value of arr is not change..
        y(arr1);
        int [] arr2=Arrays.copyOf(arr,2);//arr of length 2
        y(arr2);
        int [] arr3=Arrays.copyOfRange(arr, 0, 4);
        //start index is include last index is exclude
        y(arr3);
        
    }
}
