public class queues_5_{
    public static class circular {
        int[] arr=new int[10];
        int f=-1;
        int r=-1;
        int size=0;
        public void add(int val) {
            if (size==arr.length) {
                System.out.println("queue is full");
                return;
            }
            else if(size==0){
                f=r=0;
                arr[r]=val;
            }
            else if(r<arr.length-1){
                r++;
                arr[r]=val;
            }
            else if(r==arr.length-1){
                r=0;
                arr[0]=val;
            }
            size++;
        }
        public int remove() throws Exception{
            if(size==0){
                throw new Exception("queue is empty");
            }
            else if(f==arr.length-1){
                int x=arr[f];
                f=0;
                size--;
                return x;
            } 
            else {
                int x=arr[f];
                f++;
                size--;
                return x;
            }
        }
        public  int peek() {
            return arr[f];
        }
        public  void display () {
            if(f<=r){
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else{
                for(int i=f;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        circular c1=new circular();
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add(5);
        c1.display();
    }
}
