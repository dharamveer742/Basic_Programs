public class Patient {
    String PatientName;
    double Height ;
    double Weight ;
    double BMI ;

    double ComputeBMi() {
         BMI = Weight / (Height * Height);
        return BMI ;
    }

    public static void main(String[] args) {
        Patient ob = new Patient();
        ob.PatientName = "Rahul";
        ob.Height = 1.5;
        ob.Weight = 55;
        System.out.println("BMI of "+ob.PatientName+" is "+ob.ComputeBMi());

    }
}
