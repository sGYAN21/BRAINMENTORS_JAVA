import java.util.Scanner;

public class Hollowpiramid {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++) {
            for(int j=0;j<n-i;j++) {
                System.out.print("  ");


            }
            for(int j=0;j<i-1;j++) {
                if(j==0||i==n){
                System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            for(int j=0;j<i;j++) {
                if(j==i-1||i==n) {
                System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
           


        }
        
    }
    
}
