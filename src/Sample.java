public class Sample {
    String Name ;
    public void display(){
        System.out.println("Welcome "+Name);
    }

    public static void main(String[] args) {
        Sample ob = new Sample();
        ob.Name=args[0];
        ob.display();
    }
}
