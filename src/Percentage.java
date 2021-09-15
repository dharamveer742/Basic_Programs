public class Percentage {
    String Gender ;
    int age ;
    public void method(){
        if (Gender.equals("Female") && (age>=1 && age<=58)){
            System.out.println("percentage of interest is 8.2%");
        }
        else if(Gender.equals("Female") && (age>=59 && age<=100)){
            System.out.println("percentage of interest is 9.2%");
        }
        else if(Gender.equals("Male") && (age>=1 && age<=58)){
            System.out.println("percentage of interest is 8.4%");
        }
        else if (Gender.equals("Male") && (age>=59 && age<=100)){
            System.out.println("percentage of interest is 10.5%");
        }
    }
    public static void main(String[] args) {
        Percentage ob = new Percentage();
        ob.Gender = args[0];
        ob.age =  Integer.parseInt(args[1]);
        ob.method();
    }
}
