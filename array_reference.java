public class array_reference {
    public static void arr(int[] x) {
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        System.out.println("original");
        int[] x={1,2,3,4,5};
        arr(x);
        System.out.println("copied");
        int[] arr1=x;
        arr(arr1);
        arr1[0]=9;
        arr1[1]=8;
        System.out.println("original");
        arr(x);
        System.out.println("copied");
        arr(arr1);
    }
    //in this both the array have same address
    //shallow copy
}
