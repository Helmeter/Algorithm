/**
 * Created by helmeter on 7/27/16.
 */
public class Peach {


    public static void main(String[] args) {
       int[] a1= {5,20};
        int[]a2 ={30,20,15,40,100};

        for(int i =0;i<a1[0];i++){

            if(a1[1]>=a2[i]){

                a1[1] = a1[1]+a2[i];
            }else{
               a1[1] = a1[1]+ Gong(a1[1],a2[i]);

            }

        }
        System.out.println(a1[1]);
    }

    static  int Gong(int m,int n){

        while (m % n != 0) {

            int temp = m % n;

            m = n;

            n = temp;

        }

        return n;


    }
}
