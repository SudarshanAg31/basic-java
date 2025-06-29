public class string_internig_new {
    public static void main(String[] args) {
        String str="hello";
        String gtr="hello";
        gtr="Mello";//str? 
        //if we change in gtr so str will change bcz both str and gtr point same address??
        //not ,bcz when we change gtr so mello is added to heep
        System.out.println(gtr);
        System.out.println(str);
    }
}
