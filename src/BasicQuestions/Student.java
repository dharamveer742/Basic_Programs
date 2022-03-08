package BasicQuestions;
import java.util.Scanner;

public class Student {
    private int roll_no;
    private int marks;
    private String name;

    Student(int roll_no, int marks, String name){
        this.roll_no=roll_no;
        this.marks=marks;
        this.name=name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public int getMarks() {
        return marks;
    }
    public String getName(){
        return name;
    }
}

class Main{
    public static void main(String[] args) {
        Student[] arr =new Student[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("Enter the roll no ,marks , name of student "+ (i+1));
            arr[i] = new Student(sc.nextInt(),sc.nextInt(),sc.next());
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].getMarks()+" "+arr[i].getRoll_no()+" "+arr[i].getName());
        }
        int max = arr[0].getMarks();
        for(int j=1;j<arr.length;j++){
            if(arr[j].getMarks()>max){
                max=arr[j].getMarks();
            }
        }
        int min = arr[0].getMarks();
        String name=arr[0].getName();
        int roll_no=arr[0].getRoll_no();
        for(int j=1;j<arr.length;j++){
            if(arr[j].getMarks()<min){
                min=arr[j].getMarks();
                name=arr[j].getName();
                roll_no=arr[j].getRoll_no();
            }
        }
        System.out.println(min+" "+ name+ " "+ roll_no);

    }
}











