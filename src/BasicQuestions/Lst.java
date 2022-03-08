package BasicQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class Lst {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int n=ss.nextInt();
        int[][] a = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=ss.nextInt();
            }
        }
        ArrayList<Integer> c = new ArrayList<Integer>();
        ArrayList<Integer> d =new ArrayList<Integer>();
        int[] odd=new int[n];
        int[] even = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]%2==0){
                    c.add(a[i][j]);

                }
                else{
                    d.add(a[i][j]);
                }

            }
        }
        System.out.println(c);
        System.out.println(d);
    }
}
