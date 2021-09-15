import java.util.Objects;
public class Check_Length {
    int length;
    String[] cha;
    public void methodC(){

        if(Objects.equals(length, 0)){
            System.out.println("No Values");
        }
        else{
            for (String arg:cha) System.out.print(arg + ",");

        }
    }
    public static void main(String[] args) {
        Check_Length ob = new Check_Length();
        ob.length=args.length;
        ob.cha=args;
        ob.methodC();
    }
}

