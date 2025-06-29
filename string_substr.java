public class string_substr {
    public static void main(String[] args) {
        String str="abcd";
        System.out.println(str.substring(1, 3));
        System.out.println(str.substring(1));
        //question:-print all substring of str?
        for(int i=0;i<str.length();i++){//4
            for(int j=i+1;j<=str.length();j++){//4
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }
}
