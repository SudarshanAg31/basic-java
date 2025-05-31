public class _array_clone {
    public static void y(int[] x) {
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        System.out.println("original");
        int[] arr={1,2,3,4,5,6,7};
        y(arr);
        System.out.println("copied");
        int[] arr1=arr.clone();
        y(arr1);
        arr1[0]=12;
        arr1[1]=23;
        System.out.println("original");
        y(arr);
        System.out.println("copied");
        y(arr1);
    // in this both the array have different address 
    //deep copy
    }
}
