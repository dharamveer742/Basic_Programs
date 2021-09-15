public class Student {
    String Name;
    double Percentage;

    Student(String Name,double Percentage){
        this.Name=Name;
        this.Percentage=Percentage;
    }
}
class Test {
    public static void main(String[] args) {
        Student ob1 = new Student("Rahul", 74.2);
        Student ob2 = new Student("Aman", 75);
        Student ob3 = new Student("Kamal", 79);

        if ((ob1.Percentage > ob2.Percentage) && (ob1.Percentage > ob3.Percentage))
            System.out.println("Topper is " + ob1.Name + " with " + ob1.Percentage + '%');

        else if ((ob2.Percentage > ob1.Percentage) && (ob2.Percentage > ob3.Percentage))
            System.out.println("Topper is " + ob2.Name + " with " + ob2.Percentage + '%');
        else
            System.out.println("Topper is " + ob3.Name + " with " + ob3.Percentage + '%');
    }
}








