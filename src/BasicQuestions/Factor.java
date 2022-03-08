
// Program to print and calculate the factors of a number


package BasicQuestions;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        int total=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want to find the factors");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                total+=1;
                System.out.println(i+" is a factor of "+n);

            }
        }
        System.out.println("Total factors are "+ total);
    }


}
