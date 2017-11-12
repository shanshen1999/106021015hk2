import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int sum = 0;
        char [] a = str.toCharArray();
        if ( str.length() < 16 ) {
            for (int i = 0;i <str.length();i++) {
                int c = a[i] - '0';
                sum += c;
            }
            System.out.println(sum);
            }
        }
    }