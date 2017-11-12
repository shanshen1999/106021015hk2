import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i ;
        String str = "YES";
        if (n>1){
            if (n==2) {
                System.out.println("YES");
            }
            for (i=2;i<n;i++) {
                if (n % i == 0) {
                    str = "NO";
                }
            }
            System.out.println(str);
                }
            }
        }
