//Java mein this ek reference variable hota hai jo current object ko point karta hai.
//Jis object ka method ya constructor chal raha hai, this usi object ko refer karta hai.
public class oops_this_keyword {
    public static void main(String[] args) {
        Student2 s1 = new Student2("Rahul", 20);
        s1.display();
    } 
} 
class Student2 {
    String name;
    int age;

    Student2(String name, int age) {
        this.name = name;  // yaha "this.name" instance variable hai
        this.age = age;    // aur "age" jo right side me hai wo parameter hai
    }

    void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}
//Agar this na lagate to name = name; sirf local parameter ko assign karta,
// instance variable empty reh jata.
