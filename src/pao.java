/**
 * Created by helmeter on 7/27/16.
 */
public class pao {

    public static void main(String[] args) {
        int a1[]={1,1,1,2,2,3,3,1,2};
        System.out.println(juli(a1));
    }

    static int juli(int a1[]){
        int i = 0;
        for(int j =1;j<=5;j=j+2){

            int juli =(int)Math.pow(a1[j]-a1[7],2)+(int)Math.pow(a1[j+1]-a1[8],2);
            if(juli<=a1[0]){
                i++ ;
            }

        }


      return i;
    }
}
