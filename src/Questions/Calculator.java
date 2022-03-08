package Questions;

public class Calculator {
     static double PowerInt(int num1,int num2){return Math.pow(num1,num2);}
     static double PowerDouble(double num1,double num2){
         return Math.pow(num1,num2); //returns double
     }
}
class CalculatorMain{
    public static void main(String[] args) {
        System.out.println(Calculator.PowerInt(2,5));
        System.out.println(Calculator.PowerDouble(5.0,2.0));
    }
}
