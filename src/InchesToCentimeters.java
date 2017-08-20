import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;
        
        Scanner in = new Scanner(System.in);
        System.out.println("How many inches? ");
        
        int inch = in.nextInt();
        double cm = inch * CM_PER_INCH;
        
        System.out.printf("%din = %.2fcm\n", inch, cm);
        
        in.close();
    }
}