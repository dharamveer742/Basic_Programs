
public class Box {
    private double width;
    private double height;
    private double depth;

    Box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    public double getWidth(){return width;}
    public double getHeight(){return height;}
    public double getDepth(){return depth;}
    public double Volume(){
        double vol = width*height*depth;
        return vol;
    }


}
class BoxMain{
    public static void main(String[] args) {
        Box ob = new Box(10, 10, 10);
        System.out.println(ob.Volume());
    }


}
