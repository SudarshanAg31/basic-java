public class string_int_char {
    public static void main(String[] args) {
        String str="abc";
        str=str+"def";//we can add string
        System.out.println(str);
        
        str+='h';//we can add char also with string
        System.out.println(str);

        str+=5;//we can add int with string
        System.out.println(str);
    }
}
