package Questions;

public class Students {
    String Name;

    Students(String Name) {
        this.Name = Name;
        //System.out.println(Name);
    }
    Students() {
        Name = "Unknown";
       // System.out.println(Name);
    }
    public void display(){
        System.out.println(Name);
    }
}
class StudentsMain{
    public static void main(String[] args) {
        //BasicQuestions.Students ob = new BasicQuestions.Students();
        Students ob1 = new Students("Aman");
        ob1.display();
    }
}
