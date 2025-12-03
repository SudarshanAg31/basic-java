public class banana{
    public static void main(String[] args) {
        solution s1=new solution();
        String str="aaabbbabbbb";
        int[] arr={3,5,10,7,5,3,5,5,4,8,1};
        System.out.println(s1.minCost(str, arr));
    }
}
class solution {
    public int minCost(String str, int[] arr) {
        int s=0;
        int i=0;
        int max=0;
        int total=0;
        int count=0;

        while(i<str.length()-1){
            while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
                int temp=Math.max(arr[i],arr[i+1]);
                if(temp>=max){
                    max=temp;
                    count++;
                }
                i++;
            }
            if(max!=0){
                if((i-(s-1))==count){
                    total+=max;
                    max=0;
                }
                while(max!=0&&s<=i){
                    if(max!=arr[s]){
                        total+=arr[s];
                    }
                    s++;
                }
                max=0;
                count=0;
            }
            i++;
            s=i;
        }
        return total;
    }
}