

public class _2d_array {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // int x=sc.nextInt();
        // int y=sc.nextInt();
        int[][] x={{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                System.out.print(x[i][j]+" ");
            }
            System.out.println("");
        }        
    }
}
