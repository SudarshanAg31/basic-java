//array is pass by reference...
//in array the memory address is same .NO new array is created...
public class array_pass_function {
    public static void change(int[] arr) {
        arr[0]=9;
        System.out.println(arr[0]);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }
}
