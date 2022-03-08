
//  Java program to check a number is prime or not

package BasicQuestions;

import java.util.Scanner;

public class Prime {
    void isPrime(int n){


        for(int i=1;i<=n;i++) {
            int count=0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if(count==2){
                System.out.println(i + " is  a  Prime number .");
            }
        }
    }

    public static void main(String[] args) {
        Prime ob = new Prime();
        ob.isPrime(10);


    }
}

// Java program to print a series of prime number .


class Series{
    public static void main(String[] args) {
        int s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number");
        int n2 = sc.nextInt();
        for(int i=n1;i<=n2;i++){
            int count =0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count+=1;
                }

            }
            if(count==2){
                System.out.println(i);
                s+=1;
            }


        }
        System.out.println("Total number is "+s);


    }
}
