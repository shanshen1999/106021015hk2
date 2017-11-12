import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float [ ] array = new float[10];
        for (int i = 0; i <10 ; i++) {
            array[i] = scn.nextFloat();
        }
        float max = array[0];
        float min = array[0];
        for (int j = 0;j <10; j++) {
            if (array[j] > max) {
                max = array[j];
            }
            if (array[j] < min) {
                min = array[j];
            }
        }
        System.out.println(max);
        System.out.println(min);
            }
        }
