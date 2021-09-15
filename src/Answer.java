public class Answer {
    int no;

    Answer() {
        System.out.println("Constructor called");
    }

    //public static void method() {
       // System.out.println(no); // error , cannot access without object creation
    //}

    static {
        System.out.println("Static block called");
    }

}
class Main{

    public static void main(String[] args) {
        Answer ob = new Answer();
        Answer ob1 = new Answer();

        ob.no=5; //accessing non-static variable inside the static method by creating object


    }
}
//yes a static method can access a non- static variable only by creating
// a object of class and accessing the variable through object
