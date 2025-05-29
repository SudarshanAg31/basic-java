public class _1_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};//deceleration of array
        System.out.println(arr[2]);//to print the spcific element of array 
        
        System.out.println(arr);//it print memory address of array
        
        arr[2]=12;//update value of given array
        System.out.println(arr[2]);

        int[] arr1=new int[10];//to allocate memory to new array 
        //all the element contain 0 value
        System.out.println(arr1[0]);
        System.out.println(arr1[4]);
        System.out.println(arr1[9]);
    }
}
