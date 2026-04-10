import java.util.*;
public class Pattern7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            //loop for left Space
            for(int j=0;j<(n-i)-1;j++){
                System.out.print("  ");
            }
            //loop for Stars
            for(int j=0;j<(2*i)+1;j++){
                System.out.print("* ");
            }
            //loop for right Space
            for(int j=0;j<(n-i)-1;j++){
                System.out.print("  ");
            }
            System.out.println();
        }

    }
    
}
