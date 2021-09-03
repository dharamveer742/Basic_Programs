public class Shape {
    public void Draw() {
        System.out.println("Drawing Shape");
    }
    public void Erase() {
        System.out.println("Erasing Shape");
    }

    public static void main(String[] args) {
        Shape ob = new Shape();
        ob.Draw();
        ob.Erase();
    }
}




