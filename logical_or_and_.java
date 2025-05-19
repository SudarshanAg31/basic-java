import java.util.Scanner;
public class logical_or_and_ {
 public static void main(String[] agrs){
    Scanner sc=new Scanner(System.in);
    System.out.println("logical OR AND");
    int x=8;
    int y=2;
    if(x==8 && y==2){
        System.out.println("AND");
    }
    else if(x>4 || y>1){
        System.out.println("OR");
    }
    else{
        System.out.println("kuch nhi");
    }
    
 }   
}
