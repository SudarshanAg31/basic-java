public class string_builder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("hello");
        str.append(" world");//to add in string
        str.setCharAt(0, 'm');//to add char at any index
        str.insert(3,'y');//to insert char at any idx
        str.deleteCharAt(0);//delete any char
        str.reverse();//reverse string
        str.delete(2, 4);//delete some part of string
        System.out.println(str);
    }
}
