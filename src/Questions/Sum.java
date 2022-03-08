package Questions;

public class Sum {
    int num1;
    int num2;
    public int add(){
        return num1+num2;
    }

    public static void main(String[] args) {
        Sum ob = new Sum();
        ob.num1=Integer.parseInt(args[0]);
        ob.num2=Integer.parseInt(args[1]);
        System.out.println("BasicQuestions.Sum of two numbers is "+ob.add());
    }
}
