package Date1106;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("input number 1st");
        int a = sc.nextInt();
        System.out.println("input number 2nd");
        int b = sc.nextInt();

        if (a>b){
            System.out.println("bigger is a");
        }else if (a<b){
            System.out.println("bigger is b");
        }else {
            System.out.println("same same");
        }
    }
}
