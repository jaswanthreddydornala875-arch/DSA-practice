import java.util.*;
public class Pattern11 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int  n=sc.nextInt();
        int k;
        for(int i=1;i<=n;i++){
            if(i%2==0)k=0;
            else k=1;
            for(int j=1;j<=i;j++){
                System.out.print(k);
                //for flipping values b/w 0&1;
                k=1-k;
            }
            System.out.println();
        }

    }
    
}
