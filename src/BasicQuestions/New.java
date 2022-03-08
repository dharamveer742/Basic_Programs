package BasicQuestions;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        int[] myArr1 =new int[size];
        int[] myArr2 = new int[size];

        for(int i =0;i<myArr1.length;i++){
            myArr1[i]=sc.nextInt();

        }
        for(int i =0;i<myArr1.length;i++){
            myArr2[i]=sc.nextInt();
        }

        for(int i=0; i<myArr1.length;i++){
            int l=0;
            for(int j=0;j<myArr2.length;j++){
                if(myArr2[j]>=myArr1[i]){
                    l++;
                }
            }

            System.out.println(l);
        }
    }

}
