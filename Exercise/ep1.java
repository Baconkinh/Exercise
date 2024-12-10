package Exercise;
import java.util.Scanner;
public class ep1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        input.nextLine();
        String c=input.nextLine();
        int p=0;
        if (c.equals("20s")) {
            p = 20;
        } else {
            p=Integer.valueOf(c);
        }
        int sum=a+b+p;
        if (sum>=80) {
            System.out.print("A");
        }else if (sum>=75) {
            System.out.print("B+");
        }else if (sum>=70) {
            System.out.print("B");
        } else if (sum>=65) {
            System.out.print("C+");
        }else if (sum>=60) {
            System.out.print("C");
        }else if (sum>=55) {
            System.out.print("D+");
        }else if (sum>=50) {
            System.out.print("D");
        }else {
            System.out.print("F");
        }
    }
}
