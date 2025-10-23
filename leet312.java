import java.util.*;
// question number 312 of leetcode only few testcase is pass 
//this question is base on dp and recursion
//but i try to solve with array only 
public class leet312 {
    public static int logic(int min_idx,ArrayList<Integer>arr,int sum){
        sum+=arr.get(min_idx-1)*arr.get(min_idx)*arr.get(min_idx+1);
        arr.remove(min_idx);
        return sum;
    }
    public static void main(String[] args) {
        int[]arr1={3,1,5,8};
        ArrayList<Integer> arr=new ArrayList<>();

        for(int num:arr1){
            arr.add(num);
        }
        int sum=0;
        while(arr.size()!=0){
            if(arr.size()>=3){
                int min=1;
                for(int i=2;i<arr.size()-1;i++){
                    if(arr.get(min)>arr.get(i)){
                        min=i;
                    }
                }
                sum=logic(min,arr,sum);
            }
            else if(arr.size()==2){
                int min=(arr.get(0)<arr.get(1))?0:1;
                if(min==0){
                sum+=1*arr.get(min)*arr.get(min+1);
                }
                else if (min==1) {
                    sum+=1*arr.get(min)*arr.get(min-1);
                }
                arr.remove(min);
            }
            else if(arr.size()==1){
                sum+=1*1*arr.get(0);
                arr.remove(0);
            }
        }
        System.out.println(sum);
    }
}

