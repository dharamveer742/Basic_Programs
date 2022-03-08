package BasicQuestions;

import java.util.Scanner;

public class Count {
    Scanner sc = new Scanner(System.in);
    int size ;
    int[] myArr1 =new int[size];
    int[] myArr2 = new int[size];
    Count(int s){
        Scanner sc = new Scanner(System.in);
        size =s;
        int[] myArr1 =new int[size];
        int[] myArr2 = new int[size];
        for(int i =0;i<myArr1.length;i++){
            myArr1[i]=sc.nextInt();

        }
        for(int i =0;i<myArr1.length;i++){
            myArr2[i]=sc.nextInt();

        }
    }

    public void countDuplicate(){
     //   int[] count = new int[myArr1.length];
        for(int i=0; i<myArr1.length;i++){
            int l=0;
            for(int j=0;j<myArr2.length;j++){
                if(myArr2[j]>=myArr1[i]){
                    l++;

                }
            }
         //   count[i]=l;
            System.out.println(l);
        }
      /*  for(int m=0;m<myArr1.length;m++){
            System.out.println(count[m]);
        }   */

    }

}

class S{

    public static void main(String[] args) {
        Count n = new Count(5);
        n.countDuplicate();
    }

}
